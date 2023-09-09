package core;

import com.esotericsoftware.reflectasm.FieldAccess;
import com.esotericsoftware.reflectasm.MethodAccess;

import core.gen.HydroBaseVisitor;
import core.gen.HydroParser;
import core.reprs.*;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Visitor<T> extends HydroBaseVisitor<T> {
    public Object getFieldValue(Object cls, String fieldName) {
        var field = FieldAccess.get(cls.getClass());
        return field.get(cls, fieldName);
    }

    public MethodAccess getMethod(Object cls) {
        if (cls instanceof Class<?> c) {
            return MethodAccess.get(c);
        }

        return MethodAccess.get(cls.getClass());
    }

    public Object invokeMethod(MethodAccess method, Object cls, String methodName, Class[] paramTypes, Object... args) {
        if (cls instanceof Class<?> c) {
            return method.invoke(c, methodName, paramTypes, args);
        }

        return method.invoke(cls.getClass(), methodName, paramTypes, args);
    }

    public Method FindFunction(Method[] methods, String funcName) {
        return Arrays.stream(methods)
                .filter(method -> method.getName().equals("_" + funcName))
                .findFirst()
                .orElse(null);
    }

    @SuppressWarnings("unchecked")
    public T varCheck(HydroParser.ExprContext exprContext) {
        var expr = visitExpr(exprContext);

        if (expr instanceof idRepr e) {
            var v = e.value;
            if (env.variables.containsKey(v)) {
                expr = (T) env.GetVariable(v).value;
            } else if (env.functions.containsKey(v)) {
                expr = (T) env.GetFunc(v);
            }
        }

        return expr;
    }

    public HashMap<String, Class<?>> reprs = new HashMap<>();

    public HashMap<String, String> operators = new HashMap<>();
    public Env env = new Env();

    public Funcs<T> funcs = new Funcs<T>();

    public List<String> args = new ArrayList<>();

    public Visitor(List<String> passedArgs) {
        args.addAll(passedArgs);
    }

    public void Init() {
        this.reprs.put("id", idRepr.class);
        this.reprs.put("string", stringRepr.class);
        this.reprs.put("int", intRepr.class);
        this.reprs.put("bool", boolRepr.class);
        this.reprs.put("float", floatRepr.class);
        this.reprs.put("null", nullRepr.class);

        operators.put("+", "add");
        operators.put("-", "sub");
        operators.put("*", "mul");
        operators.put("/", "div");
        operators.put("%", "mod");
        operators.put("**", "pow");
        operators.put("==", "eq");
        operators.put("!=", "neq");
        operators.put("<", "lt");
        operators.put(">", "gt");
        operators.put(">=", "gte");
        operators.put("<=", "lte");
        operators.put("&&", "and");
        operators.put("||", "or");
        operators.put("and", "and");
        operators.put("or", "or");
    }

    public T visitVarassignment(HydroParser.VarassignmentContext ctx) {
        var name = ctx.ID().toString();

        var value = visitExpr(ctx.expr());

        env.AddVariable(new varRepr(name, value, name.equals(name.toUpperCase())));

        return null;
    }

    @SuppressWarnings("unchecked")
    public T visitFuncassignment(HydroParser.FuncassignmentContext ctx) {
        var name = ctx.ID().toString();
        var params = (List<Object>) visitParams(ctx.params());
        var block = ctx.block();

        env.AddFunc(new funcRepr<>(name, params, block, null));

        return null;
    }

    public T visitClassdef(HydroParser.ClassdefContext ctx) {
        var name = ctx.ID(0).toString();

        var repr = new classRepr(name, new ArrayList<>());
        var blocks = visitDefine_blocks(ctx.define_blocks(), repr);

        env.AddCls(repr);

        return null;
    }

    @SuppressWarnings("unchecked")
    public T visitDefine_blocks(HydroParser.Define_blocksContext ctx, classRepr repr) {
        int i = 0;
        for (var name : ctx.ID()) {
            if (ctx.FUNC(i) != null) {
                var params = (List<Object>) visitParams(ctx.params(i));
                var newName = ctx.TILDE(i) != null ? "~" + name : name.toString();
                repr.methods.put(newName, new funcRepr<>(newName, params, ctx.block(i), null));
            } else if (ctx.ASSIGN(i) != null) {
                var expr = visitExpr(ctx.expr(i));

                repr.attributes.put(name.toString(), new varRepr(name.toString(), expr, false));
            }

            i++;
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    public T visitClsassign(HydroParser.ClsassignContext ctx) {
        var clsName = ctx.ID().toString();
        var args = (List<?>) visitArgs(ctx.args());

        var repr = env.GetCls(clsName);

        if (repr.methods.containsKey("~Init")) {
            var initializer = repr.methods.get("~Init");
            initializer.Call(args, this);
        }

        return (T) repr;
    }

    @SuppressWarnings("unchecked")
    public T visitArgs(HydroParser.ArgsContext ctx) {
        List<Object> args = new ArrayList<>();
        if (ctx != null) {
            for (int i = 0; i < ctx.expr().size(); i++) {
                var value = varCheck(ctx.expr(i));

                args.add(value);
            }
        } else {
            args.add(null);
        }

        return (T) args;
    }

    @SuppressWarnings("unchecked")
    public T visitParams(HydroParser.ParamsContext ctx) {
        List<Object> params = new ArrayList<>();
        if (ctx != null) {
            for (int i = 0; i < ctx.ID().size(); i++) {
                params.add(ctx.ID(i));
            }
        } else {
            params.add(null);
        }

        return (T) params;
    }

    public T visitWhile_stmt(HydroParser.While_stmtContext ctx) {
        while (((boolRepr) visitConditional_block(ctx.conditional_block())).value) {
            visitBlock(ctx.block());
        }

        return null;
    }

    /*
    public T visitFor_stmt(HydroParser.For_stmtContext ctx) {
        var name = ctx.ID(0).toString();
        var counter = new varRepr(name, new intRepr("0"), name.equals(name.toUpperCase()));

        var increment = ctx.INCREMENT() != null;

        env.AddVariable(counter);

        while (((boolRepr) visitConditional_block(ctx.conditional_block())).value) {
            visitBlock(ctx.block());

            if (increment) {
                env.SetVariable(new varRepr(name, new intRepr(Long.toString(((intRepr) counter.value).value + 1)),
                        name.equals(name.toUpperCase())));
            } else {
                env.SetVariable(new varRepr(name, new intRepr(Long.toString(((intRepr) counter.value).value - 1)),
                        name.equals(name.toUpperCase())));
            }
        }

        env.RemoveVariable(counter.name);

        return null;
    }*/

    public T visitConditional_block(HydroParser.Conditional_blockContext ctx) {
        return visitExpr(ctx.expr());
    }

    public T visitIf_stmt(HydroParser.If_stmtContext ctx) {
        var condition = visitConditional_block(ctx.conditional_block(0));
        visitBlock(((boolRepr) condition).value ? ctx.block(0) : 
            ctx.ELSE().size() > 1 ? ctx.block(1) : 
                !(((boolRepr) condition).value) && ctx.ELSE().size() == 1 ? 
                ctx.block(1) : null);
        
        
        return null;

        /*
        var condition = visitConditional_block(ctx.conditional_block(0));

        if (((boolRepr) condition).value) {
            visitBlock(ctx.block(0));
        } else {
            if (ctx.ELSE().size() > 1) {
                for (int i = 0; i < ctx.ELSE().size(); i++) {
                    var c = visitConditional_block(ctx.conditional_block(i));
                    if (((boolRepr) c).value) {
                        visitBlock(ctx.block(i));
                        break;
                    }
                }
            } else if (!((((boolRepr) condition).value)) && ctx.ELSE().size() == 1) {
                visitBlock(ctx.block(1));
            }
        }

        return null;*/
    }

    public T visitImport_stmt(HydroParser.Import_stmtContext ctx) {
        var module = ctx.STRING(ctx.STRING().size() - 1).toString();
        module = module.substring(1, module.length() - 1);

        var repr = new moduleRepr(module);
        var importList = new ArrayList<>();
        for (int i = 0; i < ctx.STRING().toArray().length; i++) {
            if (ctx.FROM() != null && i == ctx.STRING().toArray().length - 1) {
                break;
            }

            var value = ctx.STRING(i).toString();
            importList.add(value.substring(1, value.length() - 1));
        }

        if (ctx.FROM() != null) {
            try {
                if (importList.contains("*")) {
                    for (Field field : repr.attributes) {
                        env.AddVariable(new varRepr(field.getName(), field.get(repr.moduleJavaClass), false));
                    }

                    for (Method method : repr.methods) {
                        var r = new funcRepr<>(method.getName(), new ArrayList<>(), null, repr.moduleJavaClass);
                        env.AddFunc(r);
                    }
                } else {
                    for (Field field : repr.attributes) {
                        if (importList.contains(field.getName())) {
                            env.AddVariable(new varRepr(field.getName(),
                                    field.get(repr.moduleJavaClass), false));
                        }
                    }

                    for (Method method : repr.methods) {
                        if (importList.contains(method.getName())) {
                            var r = new funcRepr<>(method.getName(), new ArrayList<>(), null, null);
                            env.AddFunc(r);
                        }
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } else {
            env.AddModule(repr);
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    public T visitCall(HydroParser.CallContext ctx) {
        var funcName = ctx.ID().toString();
        var args = (List<?>) visitArgs(ctx.args());

        var methods = funcs.getClass().getDeclaredMethods();
        var funcExists = FindFunction(methods, funcName);
        if (funcExists != null) {
            try {
                return (T) (funcExists.invoke(funcs, args, this));
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        } else if (env.functions.containsKey(funcName)) {
            var func = env.GetFunc(funcName);
            return (T) func.Call(args, this);
        //} else if (env.modules)
        } else {
            new Error("Unbound", "Unknown function '" + funcName + "'");
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    public T visitGetattribs(HydroParser.GetattribsContext ctx) {
        var obj = visitAtom(ctx.atom());
        if (obj instanceof idRepr r) {
            if (env.variables.containsKey(r.value)) {
                obj = (T) env.GetVariable(r.value).value;
            } else if (env.modules.containsKey(r.value)) {
                obj = (T) env.GetModule(r.value);
            } else if (env.functions.containsKey(r.value)) {
                obj = (T) env.GetFunc(r.value);
            } else if (env.classes.containsKey(r.value)) {
                obj = (T) env.GetCls(r.value);
            }
        }

        var args = visitArgs(ctx.args(0));

        var method = getMethod(obj);
        if (Objects.isNull(method)) {
            return (T) new Error("Attribute", "'" + ctx.ID().toString() + "' is not an attribute" +
                    " of type '" + getFieldValue(obj, "type") + "'");
        } else {
            return (T) invokeMethod(method, obj, ctx.ID().toString().substring(1, ctx.ID().toString().length() - 1),
                    new Class[]{List.class}, args);
        }
    }

    @SuppressWarnings("unchecked")
    public T visitType_conversion(HydroParser.Type_conversionContext ctx) {
        var type = ctx.ID().toString();
        var atom = visitAtom(ctx.atom());

        switch (type) {
            case "int" -> {
                if (atom instanceof stringRepr r) {
                    return (T) new intRepr(Long.toString(Long.parseLong(r.value)));
                } else if (atom instanceof floatRepr r) {
                    return (T) new intRepr(Long.toString((long) r.value));
                } else {
                    return (T) new Error("Type", "Cannot cast to type '" + type + "'");
                }
            }
            case "string" -> {
                if (atom instanceof intRepr r) {
                    return (T) new stringRepr("\"" + r.value + "\"");
                } else if (atom instanceof floatRepr r) {
                    return (T) new stringRepr("\"" + r.value + "\"");
                } else {
                    return (T) new Error("Type", "Cannot cast to type '" + type + "'");
                }
            }
            case "bool" -> {
                if (atom instanceof stringRepr r) {
                    return (T) new boolRepr(r.value);
                } else {
                    return (T) new Error("Type", "Cannot cast to type '" + type + "'");
                }
            }
            case "array" -> {
                var l = new ArrayList<>();
                l.add(atom);
                return (T) new arrayRepr(l);
            }
            case "float" -> {
                if (atom instanceof stringRepr r) {
                    return (T) new floatRepr(Float.toString(Float.parseFloat(r.value)));
                } else if (atom instanceof intRepr r) {
                    return (T) new floatRepr(r.value + ".0");
                }
            }
            default -> {
                return (T) new Error("Type", "Type '" + type + "' is not a valid type");
            }
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    public T visitFuncassignment_expr(HydroParser.Funcassignment_exprContext ctx) {
        var name = ctx.ID().toString();
        var params = (List<Object>) visitParams(ctx.params());
        var block = ctx.block();

        return (T) new funcRepr<>(name, params, block, null);
    }

    @SuppressWarnings("unchecked")
    public T visitExpr(HydroParser.ExprContext ctx) {
        if (ctx.atom() != null) {
            return visitAtom(ctx.atom());
        }
        if (ctx.call() != null) {
            return visitCall(ctx.call());
        }
        if (ctx.getattribs() != null) {
            return visitGetattribs(ctx.getattribs());
        }
        if (ctx.type_conversion() != null) {
            return visitType_conversion(ctx.type_conversion());
        }
        if (ctx.funcassignment_expr() != null) {
            return visitFuncassignment_expr(ctx.funcassignment_expr());
        }
        if (ctx.expr().size() == 2) {
            var val1 = varCheck(ctx.expr(0));
            var val2 = varCheck(ctx.expr(1));
            var op = ctx.op.getText();
            return (T) invokeMethod(getMethod(val1), val1, operators.get(op), new Class[]{Object.class}, val2);
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public T visitList(HydroParser.ListContext ctx) {
        return (T) new arrayRepr((List<?>) visitArgs(ctx.args()));
    }

    String[] atomKeys = {"id", "string", "int", "bool", "float", "null"};

    @SuppressWarnings("unchecked")
    public T visitAtom(HydroParser.AtomContext ctx) {
        if (ctx.list() != null) {
            return visitList(ctx.list());
        }

        Object[] values = {ctx.ID(), ctx.STRING(), ctx.INT(), ctx.BOOL(), ctx.FLOAT(), ctx.NULL()};

        for (int i = 0; i < atomKeys.length; i++) {
            String key = atomKeys[i];
            if (reprs.containsKey(key) && values[i] != null) {
                String value = values[i].toString();

                try {
                    return (T) reprs.get(key).getConstructor(String.class).newInstance(value);
                } catch (InvocationTargetException | InstantiationException | IllegalAccessException |
                         NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }
}

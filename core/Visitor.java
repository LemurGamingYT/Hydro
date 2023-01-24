package core;

import core.gen.HydroBaseVisitor;
import core.gen.HydroParser;
import core.reprs.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Visitor<T> extends HydroBaseVisitor<T> {
    private Method getMethod(Object cls, String methodName, Class<?> paramTypes) {
        try {
            return cls.getClass().getMethod(methodName, paramTypes);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return null;
    }

    private Object invokeMethod(Method method, Object cls, Object... args) {
        try {
            return method.invoke(cls, args);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    HashMap<String, Class<?>> reprs = new HashMap<>();

    HashMap<String, String> operators = new HashMap<>();

    Env env = new Env();

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

    @SuppressWarnings("unchecked")
    public T varCheck(HydroParser.ExprContext exprContext) {
        var expr = visitExpr(exprContext);

        if (expr instanceof idRepr e) {
            expr = (T) this.env.GetVariable(e.value).value;
        }

        return expr;
    }

    @SuppressWarnings("unchecked")
    public T visitArgs(HydroParser.ArgsContext ctx) {
        List<Object> args = new ArrayList<>();
        if (ctx != null) {
            for (int i = 0; i < ctx.expr().size(); i++) {
                T value = varCheck(ctx.expr(i));

                args.add(value);
            }
        } else {
            args.add(null);
        }

        return (T) args;
    }

    private List<?> FindFunction(Method[] methods, String funcName) {
        var returning = new ArrayList<>();

        for (Method method : methods) {
            if (method.getName().equals("_" + funcName)) {
                returning.add(true);
                returning.add(method);
                break;
            }
        }

        if (returning.size() == 0) {
            returning.add(false);
            returning.add(null);
        }

        return returning;
    }

    @SuppressWarnings("unchecked")
    public T visitCall(HydroParser.CallContext ctx) {
        var funcName = ctx.ID().toString();
        var args = (List<?>) visitArgs(ctx.args());

        var funcs = new Funcs<T>();

        var methods = funcs.getClass().getDeclaredMethods();
        var funcExists = FindFunction(methods, funcName);
        if ((boolean) funcExists.get(0)) {
            try {
                return (T) ((Method) funcExists.get(1)).invoke(funcs, args);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        } else {
            new Error("Unbound", "Unknown function '" + funcName + "'");
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    public T visitExpr(HydroParser.ExprContext ctx) {
        if (ctx.atom() != null) {
            return visitAtom(ctx.atom());
        } else if (ctx.call() != null) {
            return visitCall(ctx.call());
        } else if (ctx.expr().size() == 2) {
            var val1 = visitExpr(ctx.expr(0));
            var val2 = visitExpr(ctx.expr(1));

            var op = ctx.op.getText();

            return (T) invokeMethod(Objects.requireNonNull(getMethod(val1, operators.get(op), Object.class)), val1, val2);
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    public T visitAtom(HydroParser.AtomContext ctx) {
        var atoms = new HashMap<String, Object>();
        atoms.put("id", ctx.ID());
        atoms.put("string", ctx.STRING());
        atoms.put("int", ctx.INT());
        atoms.put("bool", ctx.BOOL());
        atoms.put("float", ctx.FLOAT());
        atoms.put("null", ctx.NULL());

        for (String key : atoms.keySet()) {
            if (reprs.containsKey(key) && atoms.get(key) != null) {
                var value = atoms.get(key).toString();
                var repr = reprs.get(key);

                try {
                    var c = repr.getConstructor(String.class);
                    return (T) c.newInstance(value);
                } catch (NoSuchMethodException | InvocationTargetException | InstantiationException |
                         IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return null;
    }
}

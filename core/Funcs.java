package core;

import core.reprs.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;

public class Funcs<T> {
    @SuppressWarnings("unchecked")
    public T _createError(List<?> args, Env env, Visitor<Object> visitor) {
        var errorType = (stringRepr) args.get(0);
        var cause = (stringRepr) args.get(1);

        return (T) new Error(errorType.value, cause.value);
    }

    @SuppressWarnings("unchecked")
    public T _min(List<?> args, Env env, Visitor<Object> visitor) {
        var value = args.get(0);
        var value2 = args.get(1);

        var ltVal2 = visitor.invokeMethod(Objects.requireNonNull(
                visitor.getMethod(value, "lt", Object.class)), value, value2);

        assert ltVal2 != null;
        if (((boolRepr) ltVal2).value) {
            return (T) value;
        } else {
            return (T) value2;
        }
    }

    @SuppressWarnings("unchecked")
    public T _max(List<?> args, Env env, Visitor<Object> visitor) {
        var value = args.get(0);
        var value2 = args.get(1);

        var ltVal2 = visitor.invokeMethod(Objects.requireNonNull(
                visitor.getMethod(value, "gt", Object.class)), value, value2);

        assert ltVal2 != null;
        if (((boolRepr) ltVal2).value) {
            return (T) value;
        } else {
            return (T) value2;
        }
    }

    @SuppressWarnings("unchecked")
    public T _forEach(List<?> args, Env env, Visitor<Object> visitor) {
        var value = args.get(0);
        var func = (funcRepr) args.get(1);

        var firstArg = func.params.get(0);

        if (value instanceof stringRepr r) {
            env.AddVariable(new varRepr(firstArg.toString(),
                    new stringRepr("\"" + r.value.charAt(0) + "\""), false));

            for (int i = 0; i < r.value.length(); i++) {
                env.SetVariable(new varRepr(firstArg.toString(),
                        new stringRepr("\"" + r.value.charAt(i) + "\""), false));

                visitor.visitBlock(func.block);
            }
        } else {
            new Error("Type", "Unable to forEach loop through a non-iterable");
        }

        return (T) new nullRepr();
    }

    @SuppressWarnings("unchecked")
    public T _loopNum(List<?> args, Env env, Visitor<Object> visitor) {
        var mapFunc = (funcRepr) args.get(0);
        var num = args.get(1);

        var firstArg = mapFunc.params.get(0);

        int i = 0;
        env.AddVariable(new varRepr(firstArg.toString(), new intRepr("0"), false));
        while (i < ((intRepr) num).value) {
            visitor.visitBlock(mapFunc.block);

            i += 1;

            env.SetVariable(new varRepr(firstArg.toString(), new intRepr(Integer.toString(i)), false));
        }

        return (T) new nullRepr();
    }
}

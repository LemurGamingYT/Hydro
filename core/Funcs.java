package core;

import core.reprs.*;

import java.util.List;
import java.util.Objects;

public class Funcs<T> {
    @SuppressWarnings("unchecked")
    public T _raiseError(List<?> args, Visitor<Object> visitor) {
        var errorType = (stringRepr) args.get(0);
        var cause = (stringRepr) args.get(1);

        return (T) new Error(errorType.value, cause.value);
    }

    @SuppressWarnings("unchecked")
    public T _Type(List<?> args, Visitor<Object> visitor) {
        var value = args.get(0);
        var type = visitor.getFieldValue(value, "type");
        return (T) new stringRepr("\"" + type + "\"");
    }

    @SuppressWarnings("unchecked")
    public T _Args(List<?> args, Visitor<Object> visitor) {
        return (T) new arrayRepr(visitor.args);
    }

    @SuppressWarnings("unchecked")
    public T _min(List<?> args, Visitor<Object> visitor) {
        var value = args.get(0);
        var value2 = args.get(1);

        var ltVal2 = visitor.invokeMethod(Objects.requireNonNull(
                visitor.getMethod(value)), value, "lt", new Class[]{Object.class}, value2);

        assert ltVal2 != null;
        if (((boolRepr) ltVal2).value) {
            return (T) value;
        } else {
            return (T) value2;
        }
    }

    @SuppressWarnings("unchecked")
    public T _max(List<?> args, Visitor<Object> visitor) {
        var value = args.get(0);
        var value2 = args.get(1);

        var ltVal2 = visitor.invokeMethod(Objects.requireNonNull(
                visitor.getMethod(value)), value, "gt", new Class[]{Object.class}, value2);

        assert ltVal2 != null;
        if (((boolRepr) ltVal2).value) {
            return (T) value;
        } else {
            return (T) value2;
        }
    }

    @SuppressWarnings("unchecked")
    public T _forEach(List<?> args, Visitor<Object> visitor) {
        var value = args.get(0);
        var func = (funcRepr<?>) args.get(1);

        var firstArg = func.params.get(0);

        if (value instanceof stringRepr r) {
            visitor.env.AddVariable(new varRepr(firstArg.toString(),
                    new stringRepr("\"" + r.value.charAt(0) + "\""), false));

            for (int i = 0; i < r.value.length(); i++) {
                visitor.env.SetVariable(new varRepr(firstArg.toString(),
                        new stringRepr("\"" + r.value.charAt(i) + "\""), false));

                visitor.visitBlock(func.block);
            }
        } else if (value instanceof arrayRepr r) {
            visitor.env.AddVariable(new varRepr(firstArg.toString(),
                    new nullRepr(), false));

            for (int i = 0; i < r.value.toArray().length - 1; i++) {
                visitor.env.SetVariable(new varRepr(firstArg.toString(),
                        r.value.get(i), false));

                visitor.visitBlock(func.block);
            }
        } else {
            new Error("Type", "Unable to perform forEach loop through a non-iterable");
        }

        return (T) new nullRepr();
    }

    @SuppressWarnings("unchecked")
    public T _LoopNum(List<?> args, Visitor<Object> visitor) {
        var num = args.get(0);
        var mapFunc = (funcRepr<?>) args.get(1);

        var firstArg = mapFunc.params.get(0);

        int i = 0;
        visitor.env.AddVariable(new varRepr(firstArg.toString(), new intRepr("0"), false));
        while (i < ((intRepr) num).value) {
            visitor.visitBlock(mapFunc.block);

            i += 1;

            visitor.env.SetVariable(new varRepr(firstArg.toString(), new intRepr(Integer.toString(i)), false));
        }

        return (T) new nullRepr();
    }

    @SuppressWarnings("unchecked")
    public T _Remove(List<?> args, Visitor<Object> visitor) {
        return (T) new Error("NotImplemented", "This feature is not implemented");
    }
}

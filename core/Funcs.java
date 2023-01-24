package core;

import core.reprs.boolRepr;
import core.reprs.nullRepr;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;

public class Funcs<T> {
    private Object getFieldValue(Object cls, String fieldName) {
        try {
            var field = cls.getClass().getField(fieldName);
            return field.get(cls);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

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

    @SuppressWarnings("unchecked")
    public T _Println(List<?> args) {
        var value = args.get(0);

        System.out.println(getFieldValue(value, "value"));

        return (T) new nullRepr();
    }

    @SuppressWarnings("unchecked")
    public T _min(List<?> args) {
        var value = args.get(0);
        var value2 = args.get(1);

        var ltVal2 = invokeMethod(Objects.requireNonNull(
                getMethod(value, "lt", Object.class)), value, value2);

        assert ltVal2 != null;
        if (((boolRepr) ltVal2).value) {
            return (T) value;
        } else {
            return (T) value2;
        }
    }

    @SuppressWarnings("unchecked")
    public T _max(List<?> args) {
        var value = args.get(0);
        var value2 = args.get(1);

        var ltVal2 = invokeMethod(Objects.requireNonNull(
                getMethod(value, "gt", Object.class)), value, value2);

        assert ltVal2 != null;
        if (((boolRepr) ltVal2).value) {
            return (T) value;
        } else {
            return (T) value2;
        }
    }
}

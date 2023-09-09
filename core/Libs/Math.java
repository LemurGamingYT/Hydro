package core.Libs;

import core.Error;
import core.Visitor;
import core.reprs.*;

import java.util.List;

public class Math {
    public static Object Sine(List<?> args, Visitor<Object> visitor) {
        var value = args.get(0);

        if (!(value instanceof intRepr || value instanceof floatRepr)) {
            return new Error("Type", "'Sine' function requires an 'int' or 'float' as an argument");
        } else if (value instanceof intRepr r) {
            return new floatRepr(Double.toString(java.lang.Math.sin(r.value)));
        } else {
            return new floatRepr(Double.toString(java.lang.Math.sin(((floatRepr) value).value)));
        }
    }

    public static Object Cosine(List<?> args, Visitor<Object> visitor) {
        var value = args.get(0);

        if (!(value instanceof intRepr || value instanceof floatRepr)) {
            return new Error("Type", "'Cosine' function requires an 'int' or 'float' as an argument");
        } else if (value instanceof intRepr r) {
            return new floatRepr(Double.toString(java.lang.Math.cos(r.value)));
        } else {
            return new floatRepr(Double.toString(java.lang.Math.cos(((floatRepr) value).value)));
        }
    }

    public static Object Ceil(List<?> args, Visitor<Object> visitor) {
        var value = args.get(0);

        if (!(value instanceof floatRepr)) {
            return new Error("Type", "'Ceil' function requires a 'float' as an argument");
        } else {
            return new intRepr(Long.toString((long) java.lang.Math.ceil(((floatRepr) value).value)));
        }
    }

    public static Object Floor(List<?> args, Visitor<Object> visitor) {
        var value = args.get(0);

        if (!(value instanceof floatRepr)) {
            return new Error("Type", "'Floor' function requires a 'float' as an argument");
        } else {
            return new intRepr(Long.toString((long) java.lang.Math.floor(((floatRepr) value).value)));
        }
    }
}

package core.reprs;

import core.Error;

import java.util.Objects;

public class intRepr {
    public long value;

    public String type = "int";

    public intRepr(String value) {
        this.value = Long.parseLong(value);
    }

    public Object add(Object other) {
        if (other instanceof intRepr r) {
            return new intRepr(Long.toString(this.value + r.value));
        } else if (other instanceof floatRepr r) {
            return new floatRepr(Float.toString(this.value + r.value));
        } else {
            new Error("Type", "Incompatible addition types, must be 'int' or 'float' types");
        }

        return null;
    }

    public Object sub(Object other) {
        if (other instanceof intRepr r) {
            return new intRepr(Long.toString(this.value - r.value));
        } else if (other instanceof floatRepr r) {
            return new floatRepr(Float.toString(this.value - r.value));
        } else {
            new Error("Type", "Incompatible subtraction types, must be 'int' or 'float' types");
        }

        return null;
    }

    public Object mul(Object other) {
        if (other instanceof intRepr r) {
            return new intRepr(Long.toString(this.value * r.value));
        } else if (other instanceof floatRepr r) {
            return new floatRepr(Float.toString(this.value * r.value));
        } else {
            new Error("Type", "Incompatible multiplication types, must be 'int' or 'float' types");
        }

        return null;
    }

    public Object div(Object other) {
        if (other instanceof intRepr r) {
            return new intRepr(Long.toString(this.value / r.value));
        } else if (other instanceof floatRepr r) {
            return new floatRepr(Float.toString(this.value / r.value));
        } else {
            new Error("Type", "Incompatible division types, must be 'int' or 'float' types");
        }

        return null;
    }

    public Object mod(Object other) {
        if (other instanceof intRepr r) {
            return new intRepr(Long.toString(this.value % r.value));
        } else if (other instanceof floatRepr r) {
            return new floatRepr(Float.toString(this.value % r.value));
        } else {
            new Error("Type", "Incompatible modulo types, must be 'int' or 'float' types");
        }

        return null;
    }

    public Object pow(Object other) {
        if (other instanceof intRepr r) {
            return new intRepr(Long.toString((int) Math.pow(this.value, r.value)));
        } else if (other instanceof floatRepr r) {
            return new floatRepr(Float.toString((float) Math.pow(this.value, r.value)));
        } else {
            new Error("Type", "Incompatible power types, must be 'int' or 'float' types");
        }

        return null;
    }

    public Object eq(Object other) {
        if (other instanceof intRepr r) {
            return new boolRepr(Boolean.toString(this.value == r.value));
        } else {
            return new boolRepr("false");
        }
    }

    public Object neq(Object other) {
        if (other instanceof intRepr r) {
            return new boolRepr(Boolean.toString(this.value != r.value));
        } else {
            return new boolRepr("false");
        }
    }

    public Object lt(Object other) {
        if (other instanceof intRepr r) {
            return new boolRepr(Boolean.toString(this.value < r.value));
        } else {
            return new boolRepr("false");
        }
    }

    public Object gt(Object other) {
        if (other instanceof intRepr r) {
            return new boolRepr(Boolean.toString(this.value > r.value));
        } else {
            return new boolRepr("false");
        }
    }

    public Object gte(Object other) {
        if (other instanceof intRepr r) {
            return new boolRepr(Boolean.toString(this.value >= r.value));
        } else {
            return new boolRepr("false");
        }
    }

    public Object lte(Object other) {
        if (other instanceof intRepr r) {
            return new boolRepr(Boolean.toString(this.value <= r.value));
        } else {
            return new boolRepr("false");
        }
    }

    public Object and(Object other) {
        return new boolRepr("false");
    }

    public Object or(Object other) {
        return new boolRepr("false");
    }
}

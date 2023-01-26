package core.reprs;

import core.Error;

import java.util.List;

public class stringRepr {
    public String value;
    public String type = "string";

    public stringRepr(String value) {
        this.value = value.substring(1, value.length() - 1);
    }

    public stringRepr Lower(List<?> args) {
        return new stringRepr("\"" + this.value.toLowerCase() + "\"");
    }
    public stringRepr Start(List<?> args) {
        return new stringRepr("\"" + this.value.charAt(0) + "\"");
    }

    public stringRepr End(List<?> args) {
        return new stringRepr("\"" + this.value.charAt(this.value.length() - 1) + "\"");
    }

    public Object add(Object other) {
        if (other instanceof stringRepr r) {
            return new stringRepr("\"" + this.value + r.value + "\"");
        } else if (other instanceof intRepr r) {
            return new stringRepr("\"" + this.value + this.value.charAt((int) r.value) + "\"");
        } else {
            return new Error("Type", "Incompatible addition types, must be 'string' or 'int' types");
        }
    }

    public Object sub(Object other) {
        if (other instanceof intRepr r) {
            return new stringRepr("\"" + this.value.substring((int) r.value) + "\"");
        } else {
            return new Error("Type", "Incompatible subtraction types, must be of type 'int'");
        }
    }

    public Object mul(Object other) {
        if (other instanceof intRepr r) {
            return new stringRepr("\"" + new String(
                    new char[(int) r.value]).replace("\0", this.value) + "\"");
        } else {
            return new Error("Type", "Incompatible multiplication types, must be of type 'int'");
        }
    }

    public Object div(Object other) {
        if (other instanceof intRepr r) {
            return new stringRepr("\"" + this.value.substring((int) r.value) + "\"");
        } else {
            return new Error("Type", "Incompatible division types, must be of type 'int'");
        }
    }

    public Object mod(Object other) {
        if (other instanceof intRepr r) {
            return new stringRepr("\"" + this.value.substring((int) r.value) + "\"");
        } else if (other instanceof stringRepr r) {
            return new stringRepr("\"" + this.value.substring(r.value.length()) + "\"");
        } else {
            return new Error("Type", "Incompatible modulo types, must be 'int' or 'string' types");
        }
    }

    public Object pow(Object other) {
        if (other instanceof intRepr r) {
            return new stringRepr("\"" + new String(
                    new char[(int) r.value]).replace("\0", this.value) + "\"");
        } else {
            return new Error("Type", "Incompatible power types, must be of type 'int'");
        }
    }

    public Object eq(Object other) {
        if (other instanceof stringRepr r) {
            return new boolRepr(Boolean.toString(this.value.equals(r.value)));
        } else {
            return new boolRepr("false");
        }
    }

    public Object neq(Object other) {
        if (other instanceof stringRepr r) {
            return new boolRepr(Boolean.toString(!this.value.equals(r.value)));
        } else {
            return new boolRepr("false");
        }
    }

    public Object lt(Object other) {
        if (other instanceof stringRepr r) {
            return new boolRepr(Boolean.toString(this.value.length() < r.value.length()));
        } else {
            return new boolRepr("false");
        }
    }

    public Object gt(Object other) {
        if (other instanceof stringRepr r) {
            return new boolRepr(Boolean.toString(this.value.length() > r.value.length()));
        } else {
            return new boolRepr("false");
        }
    }

    public Object gte(Object other) {
        if (other instanceof stringRepr r) {
            return new boolRepr(Boolean.toString(this.value.length() >= r.value.length()));
        } else {
            return new boolRepr("false");
        }
    }

    public Object lte(Object other) {
        if (other instanceof stringRepr r) {
            return new boolRepr(Boolean.toString(this.value.length() <= r.value.length()));
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

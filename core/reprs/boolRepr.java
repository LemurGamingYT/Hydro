package core.reprs;

import core.Visitor;

public class boolRepr {
    public boolean value;

    public String type = "bool";

    public boolRepr(String value) {
        this.value = Boolean.parseBoolean(value);
    }

    public String repr(Object context, Visitor<Object> visitor) {
        return Boolean.toString(value);
    }
}

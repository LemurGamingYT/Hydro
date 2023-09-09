package core.reprs;

import core.Visitor;

public class idRepr {
    public String value;
    public String type = "id";

    public idRepr(String value) {
        this.value = value;
    }

    public String repr(Object context, Visitor<Object> visitor) {
        return "<Identifier id='" + value + "'>";
    }
}

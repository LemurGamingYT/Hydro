package core.reprs;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

public class classRepr {
    public String name;

    public HashMap<String, funcRepr> methods = new HashMap<>();

    public HashMap<String, varRepr> attributes = new HashMap<>();

    public List<classRepr> inherit;

    public classRepr(String name, List<classRepr> inherits) {
        this.name = name;
        this.inherit = inherits;
    }

    public String repr(Object context) {
        return "<Class name=" + name + ">";
    }
}

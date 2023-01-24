package core.reprs;

import core.gen.HydroParser;

import java.util.List;

public class funcRepr {
    public String name;

    public List<Object> params;

    public HydroParser.BlockContext block;

    public Object javaCallable;

    public funcRepr(String name, List<Object> params, HydroParser.BlockContext block, Object javaCallable) {
        this.name = name;
        this.params = params;
        this.block = block;
        this.javaCallable = javaCallable;
    }

    public Object Call(List<?> args) {
        if (this.block != null) {
            return this.block;
        } else {
            return this.javaCallable;
        }
    }
}

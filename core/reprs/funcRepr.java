package core.reprs;

import core.Env;
import core.Visitor;
import core.gen.HydroParser;

import java.lang.reflect.Method;
import java.util.List;

public class funcRepr<T> {
    public String name;

    public List<Object> params;

    public HydroParser.BlockContext block;

    public Method javaCallable;
    public Class<?> javaCallableCls;

    public funcRepr(String name, List<Object> params, HydroParser.BlockContext block, Method javaCallable) {
        this.name = name;
        this.params = params;
        this.block = block;
        this.javaCallable = javaCallable;
    }

    public Object Call(List<?> args, Visitor<?> visitor, Env env) {
        if (block != null) {
            return visitor.visitBlock(block);
        } else {
            return visitor.invokeMethod(visitor.getMethod(
                    javaCallableCls, name, List.class, Env.class, Visitor.class), javaCallableCls, args, env, visitor);
        }
    }
}

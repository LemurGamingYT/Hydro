package core.reprs;

import com.esotericsoftware.reflectasm.MethodAccess;
import core.Visitor;
import core.gen.HydroParser;

import java.util.List;

public class funcRepr<T> {
    public String name;

    public List<Object> params;

    public HydroParser.BlockContext block;
    public Class<?> javaCallableCls;

    public funcRepr(String name, List<Object> params, HydroParser.BlockContext block, Class<?> javaCallableCls) {
        this.name = name;
        this.params = params;
        this.block = block;
        this.javaCallableCls = javaCallableCls;
    }

    public String repr(Object context) {
        return "<Function name=" + name + ">";
    }

    public Object Call(List<?> args, Visitor<Object> visitor) {
        if (block != null) {
            return visitor.visitBlock(block);
        } else {
            var access = MethodAccess.get(javaCallableCls);
            return access.invoke(javaCallableCls, name, new Class[]{List.class, Visitor.class}, args, visitor);
        }
    }
}

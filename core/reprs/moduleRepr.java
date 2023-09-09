package core.reprs;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class moduleRepr {
    public String name;

    public List<Class<?>> classes = new ArrayList<>();

    public List<Method> methods = new ArrayList<>();

    public List<Field> attributes = new ArrayList<>();

    public Class<?> moduleJavaClass;

    public moduleRepr(String fn) {
        var className = "core.Libs." + fn;
        name = fn;

        try {
            Class<?> cls = Class.forName(className);
            moduleJavaClass = cls;

            attributes.addAll(Arrays.asList(cls.getDeclaredFields()));
            methods.addAll(Arrays.asList(cls.getDeclaredMethods()));
            classes.addAll(Arrays.asList(cls.getDeclaredClasses()));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String repr(Object context) {
        return "<ModuleObject name=" + name + ">";
    }
}

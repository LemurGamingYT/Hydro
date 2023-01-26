package core.reprs;

import core.Env;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class moduleRepr {
    public String name;

    public List<Method> methods = new ArrayList<>();

    public List<Field> attributes = new ArrayList<>();

    public Class<?> moduleJavaClass;

    public moduleRepr(String fn) {
        var className = "core.Libs." + fn;
        name = fn;

        try {
            Class<?> cls = Class.forName(className);
            moduleJavaClass = cls;

            attributes.addAll(Arrays.asList(cls.getFields()));
            methods.addAll(Arrays.asList(cls.getMethods()));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

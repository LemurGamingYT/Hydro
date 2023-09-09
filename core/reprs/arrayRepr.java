package core.reprs;

import core.Error;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class arrayRepr {
    public List<?> value;
    public String type = "array";

    public arrayRepr(List<?> values) {
        this.value = values;
    }

    public String repr(Object context) {
        StringBuilder r = new StringBuilder("[");

        int i = 0;
        for (var obj : this.value) {
            try {
                r.append(obj.getClass().getMethod("repr", Object.class).invoke(obj, this));
                r.append(i == this.value.toArray().length - 1 ? "" : ", ");
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }

            i += 1;
        }

        r.append("]");

        return r.toString();
    }

    public Object FirstElement(List<?> args) {
        return value.get(0);
    }

    public Object LastElement(List<?> args) {
        return value.get(value.size() - 1);
    }

    public arrayRepr RemoveDuplicates(List<?> args) {
        List<String> cache = new ArrayList<>();

        List<?> values = this.value;

        for (var obj : this.value) {
            if (!(cache.contains(obj))) {
                cache.add(obj.toString());
            } else {
                values.remove(obj);
            }
        }

        return new arrayRepr(values);
    }

    public Object Get(List<?> args) {
        try {
            return this.value.get((int) ((intRepr) args.get(0)).value);
        } catch (ClassCastException e) {
            return new Error("Type", "Accessing an index requires an 'int' argument");
        }
    }
}

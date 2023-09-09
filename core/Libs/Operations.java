package core.Libs;

import core.Error;
import core.Visitor;
import core.reprs.*;

import java.util.List;

public class Operations {
    public static Object op(List<?> args, Visitor<Object> visitor) {
        var OpType = (stringRepr) args.get(0);
        var value1 = args.get(1);
        var value2 = args.get(2);

        if (visitor.operators.containsKey(OpType.value) || visitor.operators.containsValue(OpType.value)) {
            String methodName = OpType.value;
            if (visitor.operators.containsKey(OpType.value)) {
                methodName = visitor.operators.get(OpType.value);
            }

            return visitor.invokeMethod(visitor.getMethod(value1), value1, methodName,
                    new Class[]{Object.class}, value2);
        } else {
            return new Error("Operation", "Cannot find operator '" + OpType + "'");
        }
    }
}

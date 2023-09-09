package core.Libs;

import core.Visitor;
import core.reprs.*;

import java.time.Instant;
import java.util.List;

public class Time {
    public static Object performanceCount(List<?> args, Visitor<Object> visitor) {
        return new intRepr(Long.toString(Instant.now().toEpochMilli()));
    }

    public static Object timeFunc(List<?> args, Visitor<Object> visitor) {
        var func = (funcRepr<?>) args.get(0);

        Instant sTime = Instant.now();

        func.Call(args.subList(0, 0), visitor);

        Instant eTime = Instant.now();

        return new stringRepr("\"" + (eTime.toEpochMilli() - sTime.toEpochMilli()) + "ms" + "\"");
    }
}

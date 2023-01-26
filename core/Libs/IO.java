package core.Libs;

import core.Env;
import core.Error;
import core.Visitor;
import core.reprs.*;

import java.util.List;
import java.util.Scanner;

public class IO {
    public static Object Println(List<?> args, Env env, Visitor<Object> visitor) {
        var value = args.get(0);

        System.out.println(visitor.getFieldValue(value, "value"));

        return new nullRepr();
    }

    public static Object Print(List<?> args, Env env, Visitor<Object> visitor) {
        var value = args.get(0);

        System.out.print(visitor.getFieldValue(value, "value"));

        return new nullRepr();
    }

    public static Object Input(List<?> args, Env env, Visitor<Object> visitor) {
        var prompt = args.get(0);
        if (!(prompt instanceof stringRepr)) {
            return new Error("Type", "'Input' function requires a string for an argument one.");
        }

        System.out.println(env.functions.toString());

        var scanner = new Scanner(System.in);
        System.out.print(((stringRepr) prompt).value);
        var inp = scanner.nextLine();

        return new stringRepr(inp);
    }
}

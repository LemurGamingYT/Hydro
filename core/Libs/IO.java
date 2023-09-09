package core.Libs;

import core.Error;
import core.Visitor;
import core.reprs.*;

import java.util.List;
import java.util.Scanner;

public class IO {
    public static Object Println(List<?> args, Visitor<Object> visitor) {
        var value = args.get(0);

        System.out.println(visitor.invokeMethod(visitor.getMethod(value),
                value, "repr", new Class[]{Object.class}, value));

        return new nullRepr();
    }

    public static Object Print(List<?> args, Visitor<Object> visitor) {
        var value = args.get(0);

        System.out.print(visitor.invokeMethod(visitor.getMethod(value),
                value, "repr", new Class[]{Object.class}, value));

        return new nullRepr();
    }

    public static Object Input(List<?> args, Visitor<Object> visitor) {
        var prompt = args.get(0);
        if (!(prompt instanceof stringRepr)) {
            return new Error("Type", "'Input' function requires a string for an argument one.");
        }

        var scanner = new Scanner(System.in);
        System.out.print(((stringRepr) prompt).value);
        var inp = scanner.nextLine();
        scanner.close();

        return new stringRepr("\"" + inp + "\"");
    }
}

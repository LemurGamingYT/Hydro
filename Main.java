import core.Error;
import core.Visitor;
import core.gen.HydroLexer;

import core.gen.HydroParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.time.Instant;

public class Main {
    public static void main(String[] args) throws IOException {
        var start_time = Instant.now();

        var code = CharStreams.fromFileName(args[0]);

        var lexer = new HydroLexer(code);
        var tokens = new CommonTokenStream(lexer);

        var parser = new HydroParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new Error.ErrorListener());
        var tree = parser.program();

        var visitor = new Visitor<>();
        visitor.Init();
        visitor.visit(tree);

        var end_time = Instant.now();
        var elapsed = end_time.toEpochMilli() - start_time.toEpochMilli();
        /**/System.out.println("Total time to execute -> " + elapsed + "ms");

        System.out.println("\nProcess finished with exit code 0");
    }
}

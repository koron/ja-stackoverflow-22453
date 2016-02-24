import java.io.File;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class DoCompile {
    public static void main(String[] unused) {
        String[] args = {
            "-d", "./classes",
            "-sourcepath", "./src",
            "./src/Foo.java"
        };
        JavaCompiler c = ToolProvider.getSystemJavaCompiler();
        int r = c.run(null, null, null, args);
        if (r != 0) {
            System.out.printf("build failed: %d\n", r);
        }
    }
}

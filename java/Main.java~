import java.io.FileReader;
import xtc.parser.Result;


public class Main {

    public static void main(String args[]) throws Exception {
        FileReader file = new FileReader(args[0]);
        javarats parser = new javarats(file, "input");
        Result r = parser.pcompilation_unit(0);
        if(!(r instanceof xtc.parser.ParseError))
            System.out.println("OK");
        else
            System.out.println("NOT OK");
    }
}

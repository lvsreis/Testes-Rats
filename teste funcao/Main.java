import java.io.FileReader;
import xtc.parser.Result;


public class Main {

    public static void main(String args[]) throws Exception {
        FileReader file = new FileReader("input.txt");
        func parser = new func(file, "input");
        Result r = parser.pprog(0);
        if(!(r instanceof xtc.parser.ParseError))
            System.out.println("OK");
        else
            System.out.println("NOT OK");
    }
}

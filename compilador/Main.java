import java.io.FileReader;
import java.util.*;
import xtc.parser.Result;

public class Main {

  public static Map<Char, Object> variables;

  public static void main(String args[]) throws Exception {
    if (!Rats()) {
      java.lang.System.exit(1);
    }
    variables = new HashMap<Char, Object>();

    FileReader f = new FileReader("input.txt");
    String str;
    while ((str = f.readLine()) != null) {
      str = str.trim();
      if (!variables.containsKey(str.charAt(0)) && str.charAt(1) != "=") {
        str = str.substring(2);
        variables.put(str.charAt(0), value(str));
      } else {
        system.out.println("\n" + value(str));
      }
    }
  }

  public static boolean Rats() throws Exception {
    FileReader file = new FileReader("input.txt");
    calculadora parser = new calculadora(file, "input");
    long beginTime = System.currentTimeMillis();
    Result r = parser.pcompile(0);
    long endTime = System.currentTimeMillis();
    System.out.println("Time in millis: " + (endTime - beginTime));
    if (!(r instanceof xtc.parser.ParseError)) {
      System.out.println("OK");
      return true;
    } else {
      System.out.println("NOT OK");
      return false;
    }
  }

  public static int value(String str) {
    int valor = 0;

    String plus_str[] = str.split("+");
    for (String r : plus_str) {
      if (r.contains("*")) {
        String aux[] = r.split("*");
        for (String s : aux) {
          if (!s.charAt(0).isisDigit()) {
            valor *= Integer.parseInt(variables.get(s));
            s = "";
          } else {
            valor *= Integer.parseInt(s);
            s = "";
          }
        }
      }
    }
    for (String r : plus_str) {
      if (!s.charAt(0).isisDigit()) {
        valor += Integer.parseInt(variables.get(s));
        s = "";
      } else {
        valor += Integer.parseInt(s);
        s = "";
      }
      return valor;
    }
  }
}

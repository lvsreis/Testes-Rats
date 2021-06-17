import java.io.FileReader;
import xtc.parser.Result;

// brincar com o exemplo
public class Main { // imprimir resultado das operaçoes;

  /*  
    public static void main(String args[]) throws Exception {
        if(!rats())
        {
            
        }
    }

    public string Stmt( )
    { 
    boolean v=true;
    Filereader f = new FileReader("input.txt");
    String str;
    while ((str = f.readLine()) != null)
    {
    }
    } 
    */

  public static void main(String args[]) throws Exception {
    //public boolean Rats() throws Exception {
    FileReader file = new FileReader("input.txt");
    calculadora parser = new calculadora(file, "input");
    long beginTime = System.currentTimeMillis();
    Result r = parser.pcompile(0);
    long endTime = System.currentTimeMillis();
    System.out.println("Time in millis: " + (endTime - beginTime));
    if (!(r instanceof xtc.parser.ParseError)) System.out.println(
      "OK"
    ); else System.out.println("NOT OK"); //            return true; //          return false;
  }
}

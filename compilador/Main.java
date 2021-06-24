import java.io.FileReader;
import xtc.parser.Result;


public class Main { 
  public boolean Rats() throws Exception {
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


  public static void main(String args[]) throws Exception {
    if (!rats()) {
      exit(1);
    }  
    Map<String,object> variables = new HashMap<String,object>();
  }

  public string Stmt() {
    boolean v = true;
    Filereader f = new FileReader("input.txt");
    String str;
    while ((str = f.readLine()) != null) {
      str = str.trim();
        if (!variables.containsKey(str.charAt(0)))
          str=str.substring(2);
          variables.set(charAt(0),value(str));
        }else
        {
          
        }
      }
    }
    public int value(string str) {
      int aux=0;
      int auxi=0;
      
      for(int i=0;i<str.length();i++)
      {
          if(str.charAt(i).isDigit())
            aux = 
      }
    }
    public string digito(string str){
      
    }
  }
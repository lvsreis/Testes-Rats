
import java.io.*;

public class ListFile {

    public static void main(String args[]) {
	File f = new File(".");
	File inst[];
	try {
	    if(f.isDirectory()) {
		String pth;
		inst = f.listFiles();
		for(int i = 0; i < inst.length; i++) {
		    pth = inst[i].getPath();
		}
	    }

	} catch(Exception e) {
	    System.out.println("Deu merda " + e.getMessage());
	}

	
       try{
           if( f.isDirectory() ){
               String pth;
               inst = f.listFiles();
               for(File s : inst){
                   pth = s.getPath();
                   System.out.print("Testando " + pth + filler(50 -pth.length()) + "[");
                   if(adp.parseFile(s.getPath()) != null){
                       System.out.println("  OK  ]");
                       flips++;
                   }else{ 
                      System.out.println("FALHOU]");
                      flops++;
                   }
               }
               System.out.println("Total de acertos: " + flips );
               System.out.println("Total de erros: " + flops );
           }else{
              System.out.println("O caminho " + f.getPath() + " não é um diretório ou não existe.");
           }
           
       }catch(Exception e){
           e.printStackTrace();
       }
   }
    }
}

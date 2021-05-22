import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
import java.util.Queue;
import java.io.FileReader;
import xtc.parser.Result;


public class ListFiles {
	
	public static void main(String args[]) 
	{
		long soma = 0;
		Queue<File> q;
		q = new LinkedList();
		File f = new File(args[0]);
		File inst[];
		q.add(f); 

		long beginTime , endTime;
		Result r;
		FileReader file;

		try {
			System.out.println("Caminho;Tempo(Ms);Resultado");
			do{
				f= q.remove();	
				if(f.isDirectory()) {
					String pth;
					inst = f.listFiles();
					for(int i = 0; i < inst.length; i++) {
						pth = inst[i].getPath();
						if(inst[i].isDirectory())
						{
							q.add(inst[i]);
						}
						else
						{ 	
							if(pth.startsWith(".sugj",pth.length()-5))
							{
								//System.out.print(pth + ";");
								for(int cont=0 ; cont<30 ; cont++)
								{

								file = new FileReader(pth);
								xml parser = new xml(file, pth);
								beginTime = System.currentTimeMillis();
								r = parser.pDocument(0);
								endTime = System.currentTimeMillis();
								soma += (endTime - beginTime);

								System.out.print((endTime - beginTime) + "; \n");

								}
								//System.out.print("\n");
								/*if(!(r instanceof xtc.parser.ParseError))
									System.out.println("OK");
								else
									System.out.println("          NOT OK");*/
							}							
						}
					}
				} else {
					System.out.println(f.getPath());
				}

			}while(q.size() > 0);

			System.out.println("Total; " + soma );


		} catch(Exception e) {
			System.out.println("Deu merda " + e.getMessage());
			e.printStackTrace();
		}
	}
}	
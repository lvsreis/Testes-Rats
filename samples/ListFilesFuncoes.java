//package samples;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
import java.util.Queue;
import java.io.FileReader;
import xtc.parser.Result;
import java.util.Scanner;
import java.util.Collections;


public class ListFilesFuncoes {

	List<File> lista;

	 public long Executar()throws IOException
	{

		long beginTime , endTime, auxTimeMedicao = 0;
		Result r;
		FileReader file;
		String pth;
		int j = 0;
		
			Collections.shuffle(lista);
			for(int i = 0; i < lista.size(); i++)
			{
				pth = (lista.get(i)).getPath();
				file = new FileReader(pth);
				javarats parser = new javarats(file, pth);
				beginTime = System.currentTimeMillis();
				r = parser.pcompilation_unit(0);
				endTime = System.currentTimeMillis();
				auxTimeMedicao += (endTime - beginTime);
				//System.out.print(pth+";"+(endTime - beginTime) + "; \n");
			}
			//System.out.println("\n \n \n \n \n");	
			//System.out.print("Tempo de medicao " + (auxTimeMedicao) + "; \n");

			return auxTimeMedicao;	
	}

	 private List coletarArquivos(String endereco)
	{
		 
		File f = new File(endereco);
		File inst[];
		

		Queue<File> q;
		q = new LinkedList();

		if(f.getPath().startsWith(".java", f.getPath().length()-5))
		{
			lista.add(f);
			return lista;
		}

		q.add(f);

		try {
//fazer um loop
			while(!q.isEmpty()) {
			//	String pth;
				f = q.remove();
				inst = f.listFiles();
				for(int i = 0; i < inst.length; i++) {

					if(inst[i].isDirectory())
					{
						q.add(inst[i]);
					}
					else if(inst[i].getPath().startsWith(".java", inst[i].getPath().length()-5))
					{
						lista.add(inst[i]);
					}
				}
			}

		} 

		catch(Exception e) 
		{
			System.out.println("Deu merda " + e.getMessage());
			e.printStackTrace();
		}

		return lista;
	}

		ListFilesFuncoes(String args) throws IOException{
		 
		lista = new LinkedList();
		
		coletarArquivos(args);
	}

}

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

	static public void Executar(List<File> lista, int medicoes)throws IOException
	{

		long beginTime , endTime, beginTimeMedicao, endTimeMedicao;
		Result r;
		FileReader file;
		String pth;

		for(int j = 0; j < medicoes; j++)
		{
			beginTimeMedicao = System.currentTimeMillis();
			Collections.shuffle(lista);
			for(int i = 0; i < lista.size(); i++)
			{
				pth = (lista.get(i)).getPath();
				file = new FileReader(pth);
				javarats parser = new javarats(file, pth);
				beginTime = System.currentTimeMillis();
				r = parser.pcompilation_unit(0);
				endTime = System.currentTimeMillis();
				System.out.print(pth+";"+(endTime - beginTime) + "; \n");
			}
			System.out.println("\n \n \n \n \n");
			endTimeMedicao = System.currentTimeMillis();
			System.out.print("Tempo de medicao " + (j + 1) + ": " + (endTimeMedicao - beginTimeMedicao) + "; \n");

		}
	}

	static public List coletarArquivos(String endereco)
	{
		List<File> lista = new LinkedList(); 
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

	public static void main(String[] args) throws IOException{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero de medicoes a serem feitas: ");
		int medicoes = teclado.nextInt();

		Executar(coletarArquivos(args[0]), medicoes);
	}

}

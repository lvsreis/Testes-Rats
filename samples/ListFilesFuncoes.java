import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
import java.util.Queue;
import java.io.FileReader;
import xtc.parser.Result;


public class ListFilesFuncoes {

	public void Executar(List lista)
	{

		long beginTime , endTime;
		Result r;
		FileReader file;
		String pth;

			for(int i = 0; i < lista.size(); i++)
			{
				pth = lista.get(i).getPath();
				file = new FileReader(pth);
				javarats parser = new javarats(file, pth);
				beginTime = System.currentTimeMillis();
				r = parser.pcompilation_unit(0);
				endTime = System.currentTimeMillis();
				System.out.print((endTime - beginTime) + "; \n");
			}

	}

	public List coletarArquivos(String endereco)
	{
		List<File> lista = new LinkedList(); 
		File f = new File(endereco);
		File inst[];
		lista.add(f);

		Queue<File> q;
		q = new LinkedList();

		try {
			if(f.isDirectory()) {
				String pth;
				inst = f.listFiles();
				for(int i = 0; i < inst.length; i++) {
					pth = inst[i].getPath();
					
					if(inst[i].isDirectory())
					{
						q.add(inst[i]);
					}
					else if(pth.startsWith(".java", pth.length()-5))
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



		public static void main(String[] args) {
        	Executar(coletarArquivos(args[0]));

    }

	}

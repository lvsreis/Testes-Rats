import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
import java.util.Queue;

public class ListFiles {

	public static void main(String args[]) 
	{
		Queue<File> q;
		q = new LinkedList();
		File f = new File(args[0]);
		File inst[];
		q.add(f);

		try {
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
							//if(( pth.stringBegin(pth.length()-5)) == ".java")
							//if( pth.endsWith(".java"))
								 if(pth.startsWith(".java",pth.length()-5))
							System.out.println(pth);
						}
					}

				} else {
					System.out.println(f.getPath());
				}

			}while(q.size() > 0);


		} catch(Exception e) {
			System.out.println("Deu merda " + e.getMessage());
		}
	}
}
// tempo e .java stringbegin(string.length-5)
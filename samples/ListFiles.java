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
		Queue<File> q;
		q = new LinkedList();
		File f = new File(args[0]);
		File inst[];
		q.add(f);

		long beginTime , endTime;
		Result r;
		FileReader file;

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
							if(pth.startsWith(".java",pth.length()-5))
							{
								System.out.print(pth + "\t");
								file = new FileReader(pth);
								func parser = new func(file, pth );
								beginTime = System.currentTimeMillis();
								r = parser.pprog(0);
								endTime = System.currentTimeMillis();
								System.out.println("Time in millis: " + (endTime - beginTime));
								if(!(r instanceof xtc.parser.ParseError))
									System.out.println("OK");
								else
									System.out.println("NOT OK");
							}
							
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

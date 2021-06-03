import java.javarats;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
import java.util.Queue;
import java.io.FileReader;
import xtc.parser.Result;
import java.util.Scanner;
import java.util.Collections;

public class RunJava extends CSVTable implements Runner {
 	
 	public RunJava(){};

	@Override
	public void Run(List<File> lista) throws IOException {

		long beginTime, endTime, auxTimeMedicao = 0;
		Result r;
		FileReader file;
		String pth;
		int j = 0;

		Collections.shuffle(lista);
		for (int i = 0; i < lista.size(); i++) {
			pth = (lista.get(i)).getPath();
			file = new FileReader(pth);
			javarats parser = new javarats(file, pth);
			beginTime = System.currentTimeMillis();
			r = parser.pcompilation_unit(0);
			endTime = System.currentTimeMillis();
			auxTimeMedicao += (endTime - beginTime);	
		}
		AddLine(lista.getpath().lastIndexOf(""\"), auxTimeMedicao);
	}

}

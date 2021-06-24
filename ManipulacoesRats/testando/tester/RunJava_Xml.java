import parsers.rats.java_xml.*;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
import java.util.Queue;
import java.io.FileReader;
import xtc.parser.Result;
import java.util.Scanner;
import java.util.Collections;
import ManipulacoesRats.RatsParsers.closure;

public class RunJava_Xml extends CSVTable implements Runner {
 	
 	public RunJava_Xml(){};

	@Override
	public void Run (List<File> lista)  {

		long beginTime, endTime, auxTimeMedicao = 0;
		Result r;
		FileReader file;
		String pth;
		int j = 0;

		Collections.shuffle(lista);
		for (int i = 0; i < lista.size(); i++) {
			pth = (lista.get(i)).getPath();
			file = new FileReader(pth);
			java_xml parser = new java_xml(file, pth);
			beginTime = System.currentTimeMillis();
			r = parser.pcompilation_unit(0);
			endTime = System.currentTimeMillis();
			auxTimeMedicao += (endTime - beginTime);	
		}
		table.addLi("java_xml", (String)auxTimeMedicao);
	}

}

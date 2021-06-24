import parsers.rats.xml.*;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
import java.util.Queue;
import java.io.FileReader;
import xtc.parser.Result;
import java.util.Scanner;
import java.util.Collections;
//import ManipulacoesRats.RatsParsers.closure;

public class RunXml extends Escrita implements Runner {
 	
 	public RunXml(){};

	@Override
	public void Run (List<File> lista) {

		long beginTime, endTime, auxTimeMedicao = 0;
		Result r;
		FileReader file;
		String pth;
		int j = 0;

		Collections.shuffle(lista);
		for (int i = 0; i < lista.size(); i++) {
			pth = (lista.get(i)).getPath();
			file = new FileReader(pth);
			xml parser = new xml(file, pth);
			beginTime = System.currentTimeMillis();
			r = parser.pDocument(0);
			endTime = System.currentTimeMillis();
			auxTimeMedicao += (endTime - beginTime);	
		}
		table.addLi("xml", auxTimeMedicao);
	}

}

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

public class RunPair_Closure_Xml extends Escrita implements Runner {
 	
 	public RunPair_Closure_Xml(){};

	@Override
	public void Run (List<File> lista) throws IOException {

		long beginTime, endTime, auxTimeMedicao = 0;
		Result r;
		FileReader file;
		String pth;
		int j = 0;

		Collections.shuffle(lista);
		for (int i = 0; i < lista.size(); i++) {
			pth = (lista.get(i)).getPath();
			file = new FileReader(pth);
			pair_closure_xml parser = new pair_closure_xml(file, pth);
			beginTime = System.currentTimeMillis();
			r = parser.pcompilation_unit(0);
			endTime = System.currentTimeMillis();
			auxTimeMedicao += (endTime - beginTime);	
		}
		escrever("nome da pasta"+";"+auxTimeMedicao);
	}

}
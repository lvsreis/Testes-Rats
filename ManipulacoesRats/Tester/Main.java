import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
import java.util.Queue;
import java.io.FileReader;
import xtc.parser.Result;
import java.util.Scanner;
import java.util.Collections;

public class Main {

	final static int X = 5;

	public static void main(String[] args) throws IOException {

		List<File> lista = new LinkedList();
		File f = new File(args[0]);
		
		String Fname;
		
		String dados, path = func.getPath();
		

		File[] vet = f.listFiles();

		for (int i = 0; i < vet.length; i++) {

			if (vet[i].isDirectory()) {
				lista.add(vet[i]);
			}

		}

		for (int i = 0; i < X; i++) {

			Collections.shuffle(lista);

			for (File file : lista) {

				String aux = file.getPath();
				int index = aux.lastIndexOf(File.separatorChar, aux.length());
				Fname = aux.substring(index + 1, aux.length());
				switch(file.getName){
					case "closure":
							RunClosure a = new RunClosure();
							long tempoTotal = a.Run(file.listFiles());
							break;
					case "closure_xml":
							RunClosure_Xml a = new RunClosure_Xml();
							long tempoTotal = a.Run(file.listFiles());
							break;
					case "java_xml":
							RunJava a = new RunJava();
							long tempoTotal = a.Run(file.listFiles());
							break;
					case "pair":
							RunPair a = new RunPair();
							long tempoTotal = a.Run(file.listFiles());
							break;
					case "pair_closure":
							RunPair_Closure a = new RunPair_Closure();
							long tempoTotal = a.Run(file.listFiles());
							break;
					case "pair_closure_xml":
							RunPair_Closure_Xml a = new RunPair_Closure_Xml();
							long tempoTotal = a.Run(file.listFiles());
							break;
					case "pair_xml":
							RunPair_Xml a = new RunPair_Xml();
							long tempoTotal = a.Run(file.listFiles());
							break;
					case "xml":
							RunXml a = new RunXml();
							long tempoTotal = a.Run(file.listFiles());
							break;									

							default;
				}
			}
		}
	}

}
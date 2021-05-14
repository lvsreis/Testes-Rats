
//package xml;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
import java.util.Queue;
import java.io.FileReader;
import xtc.parser.Result;
import java.util.Scanner;
import java.util.Collections;

public class Execucao {

	final static int X = 5;

	public static void main(String[] args) throws IOException {

		ListFilesFuncoes a;
		List<File> lista = new LinkedList();
		File f = new File(args[0]);
		
		String Fname;
		File func = new File("saida.csv");
		if (func.exists()) {
			func.delete();
			func = new File("saida.csv");
		}
		String dados, path = func.getPath();
		

		File[] vet = f.listFiles();
		System.out.println("Processing " + vet.length + " files.");
		for (int i = 0; i < vet.length; i++) {

			if (vet[i].isDirectory()) {
				lista.add(vet[i]);
				System.out.println(vet[i]);
			}

		}

		for (int i = 0; i < X; i++) {

			Collections.shuffle(lista);

			for (File file : lista) {

				String aux = file.getPath();
				int index = aux.lastIndexOf(File.separatorChar, aux.length());
				Fname = aux.substring(index + 1, aux.length());

				a = new ListFilesFuncoes(file.getPath());
				long tempoTotal = a.Executar();

				dados = Fname + ";" + tempoTotal;
				System.out.println(dados);

				try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
					bw.write(dados);
					bw.newLine();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}

}
package samples;
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

	public static void main(String[] args)
	{
		ListFilesFuncoes a;
		List<File> lista = new LinkedList();
		File f = new File(args[0]);

		File [] vet = f.listFiles();

		for(int i = 0; i < vet.length; i++)
		{
			if(vet[i].isDirectory()) {
				lista.add(vet[i]);
			}

		}

		for(int i = 0; i < X; i++)
		{
			Collections.shuffle(lista);

			for(int j = 0; j < lista.size(); j++)
				a = new ListFilesFuncoes(lista.get(j).getPath());
		}

	}

}
package tester;

import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import xtc.parser.Result;

public class Main {

  static final int X = 8;

  public static void main(String[] args) throws IOException {
    CSVTable tabela = new CSVTable();

    List<File> lista = new LinkedList();
    List<File> listaAux = new LinkedList();

    File f = new File(args[0]);

    //String Fname;

    File[] vet = f.listFiles();

    for (int i = 0; i < vet.length; i++) {
      if (vet[i].isDirectory()) {
        lista.add(vet[i]);
      }
    }

    for (int i = 0; i < X; i++) {
      Collections.shuffle(lista);

      for (File file : lista) {
        //String aux = file.getPath();
        //int index = aux.lastIndexOf(File.separatorChar, aux.length());
        //Fname = aux.substring(index + 1, aux.length());
        switch (file.getName()) {
          case "closure":
            RunClosure a = new RunClosure(tabela);
            a.Run(vectorToList(file.listFiles()));
            break;
          case "closure_xml":
            RunClosure_xml b = new RunClosure_xml(tabela);
            b.Run(vectorToList(file.listFiles()));
            break;
          case "java_xml":
            RunJava_Xml c = new RunJava_Xml(tabela);
            c.Run(vectorToList(file.listFiles()));
            break;
          case "pair":
            RunPair d = new RunPair(tabela);
            d.Run(vectorToList(file.listFiles()));
            break;
          case "pair_closure":
            RunPair_Closure e = new RunPair_Closure(tabela);
            e.Run(vectorToList(file.listFiles()));
            break;
          case "pair_closure_xml":
            RunPair_Closure_Xml ff = new RunPair_Closure_Xml(tabela);
            ff.Run(vectorToList(file.listFiles()));
            break;
          case "pair_xml":
            RunPair_Xml g = new RunPair_Xml(tabela);
            g.Run(vectorToList(file.listFiles()));
            break;
          case "xml":
            RunXml h = new RunXml(tabela);
            h.Run(vectorToList(file.listFiles()));
            break;
          case "java":
            RunJava j = new RunJava(tabela);
            j.Run(vectorToList(file.listFiles()));
            tabela = j.getTable();
            break;
          default:
        }

        tabela.csvToFile("./reports/Saida.csv");
      }
    }
  }

  public static List<File> vectorToList(File[] v) {
    List<File> f = new LinkedList();

    for (int i = 0; i < v.length; i++) {
      f.add(v[i]);
    }
    return f;
  }
}

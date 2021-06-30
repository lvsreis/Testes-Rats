package tester;

import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import xtc.parser.Result;

public class ColetarArquivos {

  private List<String> lista;
  private Map<String, List<File>> collection;

  public ColetarArquivos() {
    lista = new ArrayList();
    collection = new HashMap();
  }

  private void collectFiles(String endereco) {
    File f = new File(endereco);
    File instancias[];

    Queue<File> q;
    q = new LinkedList();

    q.add(f);

    try {
      while (!q.isEmpty()) {
        f = q.remove();
        instancias = f.listFiles();
        for (int i = 0; i < instancias.length; i++) {
          if (instancias[i].isDirectory()) {
            q.add(instancias[i]);
            collection.put(f.getName(), new ArrayList());
            lista.add(f.getName());
          } else if (
            instancias[i].getPath()
              .startsWith(".sugj", instancias[i].getPath().length() - 5)
          ) {
            collection.get(f.getName()).add(instancias[i]);
          }
        }
      }
    } catch (Exception e) {
      System.out.println("Deu merda " + e.getMessage());
      e.printStackTrace();
    }
  }

  public Map<String, List<File>> getCollection() {
    return collection;
  }

  public List<String> getLista() {
    return lista;
  }
}

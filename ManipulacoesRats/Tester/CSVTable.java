package tester;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public final class CSVTable { //ArrayList de ArrayList de strings

  private ArrayList<ArrayList<Object>> tabela;
  private char sep;

  public CSVTable() {
    sep = ';';
    tabela = new ArrayList<ArrayList<Object>>();
  }

  public CSVTable(char s) {
    this();
    sep = s;
  }

  //Método AddLine = adiciona linha em branco sem nada na tabela
  public void addLine() {
    ArrayList<Object> l = new ArrayList<Object>();
    tabela.add(l);
  }

  //___________________________________________

  public void addLine(int size) {
    ArrayList<Object> l = new ArrayList<Object>(size);
    tabela.add(l);
  }

  //____________________________________________
  //AddToLine = Add uma coluna no final da linha; recebe como parametro a linha que vc
  //quer colocar
  public void addToLine(int line, Object value) {
    tabela.get(line).add(value);
  }

  public void addLi(Object um, Object dois) {
    ArrayList<Object> l = new ArrayList<Object>();
    l.add(um);
    l.add(dois);
    tabela.add(l);
  }

  public void addLin(Object um, Object dois, Object tres) {
    ArrayList<Object> l = new ArrayList<Object>();
    l.add(um);
    l.add(dois);
    l.add(tres);
    tabela.add(l);
  }

  //getLine(//Recebe um inteiro)
  public ArrayList<Object> getLine(int linha) {
    return tabela.get(linha);
  }

  //getAt(//Recebe dois inteiros)Linha e coluna
  public Object getAt(int linha, int coluna) { //Usar somente a linha ??????
    return tabela.get(linha).get(coluna);
  }

  public void csvToFile(String path) {
    File f = new File(path);

    try (
      BufferedWriter bw = new BufferedWriter(new FileWriter(f.getPath(), false))
      ) {
      String aux = "";

      for (ArrayList<Object> l : tabela) {
        aux = "";
        for (Object o : l) {
          aux = aux + o.toString() + sep;
        }

        bw.write(aux);
        bw.newLine();
      }

      bw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  //concatena 2 tabelas
  
}

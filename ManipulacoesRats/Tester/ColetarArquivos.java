import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
import java.util.Queue;
import java.io.FileReader;
import xtc.parser.Result;
import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class ColetarArquivos {
    private List<File> lista;
    private Map<String, List<File>> collection;

    private void coletarArquivos(String endereco) {

        File f = new File(endereco);
        File inst[];

        Queue<File> q;
        q = new LinkedList();

        if (f.getPath().startsWith(".sugj", f.getPath().length() - 5)) {
            lista.add(f);
        }

        q.add(f);

        try {

            while (!q.isEmpty()) {
        
                f = q.remove();
                inst = f.listFiles();
                for (int i = 0; i < inst.length; i++) {

                    if (inst[i].isDirectory()) {
                        q.add(inst[i]);
                    } else if (inst[i].getPath().startsWith(".sugj", inst[i].getPath().length() - 5)) {
                        lista.add(inst[i]);
                    }
                }
            }
        }

        catch (Exception e) {
            System.out.println("Deu merda " + e.getMessage());
            e.printStackTrace();
        }
    }
}
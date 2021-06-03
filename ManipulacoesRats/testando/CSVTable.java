import java.util.ArrayList;
import java.io.*;

class CSVTable { //ArrayList de ArrayList de strings

	private ArrayList<ArrayList<Object>> tabela; 
	private char sep;

	public CSVTable() {
		sep = ';';
		tabela = new ArrayList<ArrayList<Object> >(); 
	}

	public CSVTable(char s) {
		this();
		sep = s;
		
	}

	//Método AddLine = adiciona linha em branco sem nada na tabela
	public void AddLine(String nome, long tempo) {
		
		ArrayList<Object> l = new ArrayList<Object>(); 
		tabela.add(l);
		
		int tamTabela = tabela.size();
		
		AddToLine(tamTabela, nome, tempo);
	}

	//AddToLine = Add uma coluna no final da linha; recebe como parametro a linha que vc
	//quer colocar 
	public void AddToLine(int linha, String nome, long tempo) {

		tabela.get(linha).add(nome);
		tabela.get(linha).add(tempo);
	}

	//getLine(//Recebe um inteiro)
	public ArrayList<Object> getLine(int linha) {
		return tabela.get(linha);
	}
	
	//getAt(//Recebe dois inteiros)Linha e coluna
	public Object getAt(int linha, int coluna) {
		return tabela.get(linha).get(coluna);
	}

	public void csvToFile() {
		File f = new File("../reports/saida.csv");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f.getPath(), true))) {
			String aux = "";		
			
			for(int i = 0; i < tabela.size(); i++) {
						aux = (String)getAt(i, 0); //+ sep + getAt(i, 1);
				}
				bw.write(aux);
				bw.newLine();
				
			} catch (IOException e) {
					e.printStackTrace();
				}
	}
	
}
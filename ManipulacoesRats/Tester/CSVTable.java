import java.util.ArrayList;

class CSVTable { //ArrayList de ArrayList de strings

	private ArrayList<ArrayList<String>> tabela; 
	private char sep;

	public CSVTable(){
		sep = ';';
		tabela = new ArrayList<ArrayList<String> >(); 
	}

	public CSVTable(char s){
		this();
		sep = s;
		
	}

	//Método AddLine = adiciona linha em branco sem nada na tabela

	//AddToLine = Add uma coluna no final da linha; recebe como parametro a linha que vc
	//quer colocar 

	//getLine(//Recebe um inteiro)
	//getAt(//Recebe dois inteiros)Linha e coluna

	public void csvToFile(string dados) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
					bw.write(dados);
					bw.newLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
	
}
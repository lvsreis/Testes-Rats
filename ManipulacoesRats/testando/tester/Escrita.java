abstract class Escrita{
	
	public void verifica(){
		File func = new File("saida.csv");
		if (func.exists()) {
			func.delete();
			func = new File("saida.csv");
		}
	}
	public void escrever(string dados){
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
					bw.write(dados);
					bw.newLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
	
}
abstract class Escrita{

	public void escrever(string dados){
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
					bw.write(dados);
					bw.newLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
	
}
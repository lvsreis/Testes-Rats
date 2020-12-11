public class Dado 
{
	int val;


	int jogarDado()
	{
		return 1 + (int)(Math.random() * 5);
	}

	public static void main(String args[])
	{
		Dado dadoNum1, dadoNum2;

		dadoNum1 = new Dado();
		dadoNum2 = new Dado();

		//dadoNum1.imprime();
		//dadoNum2.imprime();

		System.out.println("Valor da soma dos dados: " + (dadoNum1.jogarDado() + dadoNum2.jogarDado()));
		
	}

}
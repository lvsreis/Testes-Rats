public class Dado 
{
	int val;

	void setDado(int _val)
	{
		val = 5; //Dado viciado
	}

	int getDado()
	{
		return val;
	}

	void imprime()
	{
		System.out.println("Valor do dado: " + val);
	}

}

	public static void main(String args[])
	{
		Dado dadoNum1, dadoNum2;

		dadoNum1 = new Dado;
		dadoNum2 = new Dado;

		dadoNum1.setDado(3); //Substituir por numero aleatorio
		dadoNum2.setDado(4); //substituir por numero aleatorio

		dadoNum1.imprime();
		dadoNum2.imprime();

		System.out.println("Valor da soma dos dados: " + (dadoNum1.getDado() + dadoNum2.getDado()));
		
	}


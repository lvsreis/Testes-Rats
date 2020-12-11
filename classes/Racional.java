public class Racional
{

	int numerador;
	int denominador;


	public Racional(int n, int d) throws Exception
	{
		numerador = n;

		if(d == 0)
		{
			throw new Exception("Erro! Denominador tem que ser diferente de 0, sua anta!!");
		}
		denominador = d;
	}

	Racional multiplicar(Racional r) throws Exception
	{
		int n, d;

		n = numerador * r.numerador;
		d = denominador * r.denominador;

		Racional resultado = new Racional(n, d);



		return resultado;

	}

	void imprimir()
	{
		System.out.println(numerador + " / " + denominador);
	}

	
	public static void main(String args[]) 
	{
		Racional racional1, racional2;

		try 
		{
			racional1 = new Racional(1, 2);
			racional2 = new Racional(2, 3);

			racional1.imprimir();
			racional2.imprimir();

			System.out.print("Resultado: ");
			racional1.multiplicar(racional2).imprimir();

		} catch(Exception e) {
			System.out.println("\n Deu erro e ignorei!");
		}

	}








}
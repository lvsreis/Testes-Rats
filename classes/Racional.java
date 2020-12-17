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

	void simplificar()
	{
		if((numerador > denominador)&& (numerador % denominador) == 0)
		{
			numerador = numerador / denominador;
			denominador = 1;
		} 

		else if((denominador > numerador)&& (denominador % numerador) == 0)
		{
			denominador = denominador / numerador;
			numerador = 1;
		}

		else if(numerador == denominador)
		{
			numerador = 1;
			denominador = 1;
		}

	}

	Racional multiplicar(Racional r) throws Exception
	{
		int n, d;

		n = numerador * r.numerador;
		d = denominador * r.denominador;

		Racional resultado = new Racional(n, d);

		//resultado.simplificar();

		return resultado;
	}

	Racional dividir(Racional r) throws Exception
	{
		int n, d;

		if(r.numerador == 0)
		{
			throw new Exception("Erro! denominador tem que ser diferente de 0, seu incompetente!!");
		}

		n = numerador * r.denominador;
		d = denominador * r.numerador;

		Racional resultado = new Racional(n, d);

		//resultado.simplificar();

		return resultado;		

	}
 
	Racional somar(Racional r) throws Exception
	{
		int n, d;

		if(r.numerador == 0)
		{
			Racional resultado = new Racional(numerador, denominador);

			//resultado.simplificar();
			return resultado;
		}

		else if(numerador == 0)
		{
			Racional resultado = new Racional(r.numerador, r.denominador);

			//resultado.simplificar();
			return resultado;
		}
		else if(denominador == r.denominador)
		{

			n = numerador + r.numerador;
			d = denominador;
		
			Racional resultado = new Racional(n, d);

			//resultado.simplificar();
			return resultado;
		}
		else
		{
			n = numerador * r.denominador + r.numerador * denominador;
			d = denominador * r.denominador;
		
			Racional resultado = new Racional(n, d);

			//resultado.simplificar();
			return resultado;
		}
	}

	Racional subtrair(Racional r) throws Exception
	{
		int n, d;

		if(r.numerador == 0)
		{
			Racional resultado = new Racional(numerador, denominador);
			//resultado.simplificar();
			return resultado;
		}

		else if(numerador == 0)
		{
			Racional resultado = new Racional((r.numerador * -1), r.denominador);

			//resultado.simplificar();
			return resultado;
		}

		else if(denominador == r.denominador)
		{

			n = numerador - r.numerador;
			d = denominador;
		
			Racional resultado = new Racional(n, d);

			//resultado.simplificar();
			return resultado;
		}

		else
		{

			n = numerador * r.denominador - r.numerador * denominador;
			d = denominador * r.denominador;
		
			Racional resultado = new Racional(n, d);

			//resultado.simplificar();
			return resultado;
		}

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

			System.out.print("Resultado da multiplicacao: ");
			racional1.multiplicar(racional2).imprimir();

			System.out.print("Resultado da divisao: ");
			racional1.dividir(racional2).imprimir();

			System.out.print("Resultado da soma: ");
			racional1.somar(racional2).imprimir();

			System.out.print("Resultado da subtracao: ");
			racional1.subtrair(racional2).imprimir();

		} catch(Exception e) {
			System.out.println("\n Deu erro e ignorei!");
		}

	}
}
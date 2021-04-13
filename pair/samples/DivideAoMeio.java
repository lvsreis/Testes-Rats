import pair.Sugar;
import java.util.ArrayList;

	public class DivideAoMeio {

	    public (int, int) dividirVetor(int vet[])
	    {
	    	List <int> lista1 = new ArrayList();
	    	List <int> lista2 = new ArrayList();
	    	
	    	for(int i = 0; i < vet.length; i++)
	    	{
	    		if(i % 2 == 0)
	    		{
	    			lista1.add(vet[i]);
	    		}
	    		else
	    		{
	    			lista2.add(vet[i]);
	    		}
	    	}

	    	return (lista1, lista2);
	    }

	     public static void main(String[] args) {
	     	int vet[] = new int [10];

	     	for(int i = 0; i < vet.length; i++)
	     	{
	     		vet[i] = (int)(Math.random() * (100));
	     	}
	     	
	     	(List <int>, List <int>) metade = (new ArrayList(), new ArrayList());
	     	metade = dividirVetor(vet);	    	
	    }


	}
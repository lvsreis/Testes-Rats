import pair.Sugar;

	public class MaiorMenorElemento {

	    public (int, int) vetor(int vet[])
	    {
	    	(int, int) mM =(vet[0],vet[0]);

	    	for(int i = 1; i < vet.length; i++)
	    	{
	    		 if(vet[i] > mM.fst)
	    		{
	    			mM.fst=vet[i];
	    		}

	    		else if(vet[i] < mM.snd)
	    		{
	    			mM.snd=vet[i];
	    		}
	    	}
	    	return mM;
	    }

	     public static void main(String[] args) {
	     	
	     	int vet[] = new int [10];

	     	for(int i = 0; i < vet.length; i++)
	     	{
	     		vet[i] = (int)(Math.random() * (100));
	     	}
	     	
	     	(int, int) maiorMenor = vetor(vet);	    	
	    }


	}
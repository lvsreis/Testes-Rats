import pair.Sugar;

	public class MaiorMenorElemento {

	    public (int, int) vetor(int vet[])
	    {
	    	(int, int) mM;

	    	for(int i = 0; i < vet.length; i++)
	    	{
	    		if(mM == null)
	    		{
	    			mM = (vet[i], vet[i]);
	    		}

	    		else if(i > mM.getFst())
	    		{
	    			mM.setFst(vet[i]);
	    		}

	    		else if(i < mM.getSnd())
	    		{
	    			mM.setSnd(vet[i]);
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
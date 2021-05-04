import pair.Sugar;
import java.util.ArrayList;

	public class DivideAoMeio {

	   public void dividirVetor(List<Integer> n, (List<Integer>  , List<Integer> ) l){

	    	if(n.isEmpty())
	    		return;

	    	l.fst.add(n.remove());

	    	(List <Integer>, List <Integer>) aux = (l.snd,l.fst);

	    	return dividirVetor(n, aux);

	    }

	     public static void main(String[] args) {
	     	int vet[] = new int [10];

	     	for(int i = 0; i < vet.length; i++)
	     	{
	     		vet[i] = (int)(Math.random() * (100));
	     	}
	     	
	     	(List <Integer>, List <Integer>) metade = (new ArrayList(), new ArrayList());
	     	metade = dividirVetor(vet);	    	
	    }
	}
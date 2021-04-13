import pair.Sugar;

	public class Racional {

	    public (int, int) numRacionais(int n, int d)
	    {
	    	return (n / d, d / n);
	    }

	     public static void main(String[] args) {
	     	(float, float) rac = numRacionais(100, 9);	    	
	    }


	}
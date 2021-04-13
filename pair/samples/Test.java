	import pair.Sugar;

	public class Test {
	    private (String, Integer) p = ("12", 34+10);

	    public (int,int) divMod ( int n , int q) {
		    return(n/q,n%q);
	    }
	    
	     public static void main(String[] args) {
	     	divMod(100,9);	    	
	    }
	}
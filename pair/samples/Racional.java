import pair.Sugar;

	public class Racional {

		public (int, int) racional;

		public Racional((int, int)n ) throws Exception {

			if(n.snd == 0)
			{
				throw new Exception("Erro! Denominador tem que ser diferente de 0, sua anta!!");
			}

			racional = n;
		}

	    public void multiplicar( (int, int) nd) {
	    	
	    		if(nd.fst == 0)
	    		{
	    			nd = (0, 0);
	    			return;
	    		}
	    		nd = ((nd.fst * racional.fst), (nd.snd * racional.snd));
	    		return;

	    }

	    public void dividir( (int, int) nd) {
	    	
	    		if(nd.fst == 0)
	    		{
	    			nd = (0, 0);
	    			return;
	    		}
	    		nd = ((nd.snd * racional.fst), (nd.fst * racional.snd));
	    		return;

	    }

	    public void soma( (int, int) nd) {
	    	
	    		if(nd.fst == 0)
	    		{
	    			nd = (0, 0);
	    			return;
	    		}
	    		nd = ((nd.fst * racional.snd + racional.fst * nd.snd), (nd.snd * racional.snd));
	    		return;
	    }

	    public void subtracao( (int, int) nd) {
	    	
	    		if(nd.fst == 0)
	    		{
	    			nd = (0, 0);
	    			return;
	    		}
	    		nd = ((nd.fst * racional.snd - racional.fst * nd.snd), (nd.snd * racional.snd));
	    		return;
	    }

	    public static void main(String[] args) {
	    	Racional r1, r2;

	    	try {
	    		
	    		r1 = new Racional(1, 2);
	     	 	r2 = new Racional(2, 3);

	     	 	r1.multiplicar(r2);
	     	 	r1.soma(r2);
	     	 	r1.subtracao(r2);
	     	 	r1.dividir(r2);

	    	} catch(Exception e) {
	    		System.out.println("\n Deu erro e ignorei!");
			}
	     	   	
	    }

	}
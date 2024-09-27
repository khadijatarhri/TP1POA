package Exercice1V2;

public class AfficherAlphabetMinV2 implements Runnable {

	@Override
	public void run() {
		 for (char lettre = 'r'; lettre <= 'z'; lettre++) {
	         System.out.print(lettre + " ");
	     }		
	}

}

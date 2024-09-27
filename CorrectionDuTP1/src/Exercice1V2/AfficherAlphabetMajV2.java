package Exercice1V2;

public class AfficherAlphabetMajV2 implements Runnable{

	@Override
	public void run() {
		for (char lettre = 'A'; lettre <= 'Q'; lettre++) {
	         System.out.print(lettre + " ");
	     }		
	}

}

package Exercice1DT;

public class AfficherAlphabetMaj extends Thread {
	public void run() {
	     for (char lettre = 'A'; lettre <= 'Q'; lettre++) {
	         System.out.print(lettre + " ");
	     }
}
}

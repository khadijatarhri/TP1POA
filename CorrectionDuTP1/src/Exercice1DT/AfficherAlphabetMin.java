package Exercice1DT;

public class AfficherAlphabetMin extends Thread{
	public void run() {
	     for (char lettre = 'r'; lettre <= 'z'; lettre++) {
	         System.out.print(lettre + " ");
	     }

}
}


package Exercice1DT;

public class main {

	public static void main(String[] args) {
		AfficherAlphabetMaj thread1 = new AfficherAlphabetMaj();
		thread1.start();  // Démarre le thread
		AfficherAlphabetMin thread2 = new AfficherAlphabetMin();
		thread2.start();  // Démarre le thread
		NbrPaire thread3 = new NbrPaire();
		thread3.start();  // Démarre le thread

	}

}

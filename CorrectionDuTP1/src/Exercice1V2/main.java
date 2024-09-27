package Exercice1V2;

import Exercice1DT.AfficherAlphabetMaj;
import Exercice1DT.AfficherAlphabetMin;
import Exercice1DT.NbrPaire;

public class main {

	public static void main(String[] args) {
		AfficherAlphabetMinV2 Alphabetmin = new AfficherAlphabetMinV2();
		Thread thread1 = new Thread(Alphabetmin);
		thread1.start();  // Démarre le thread
		AfficherAlphabetMajV2 Alphabetmaj = new AfficherAlphabetMajV2();
		Thread thread2 = new Thread(Alphabetmaj);
		thread2.start();  // Démarre le thread
		AfficherNombresPaires NbrPaires = new AfficherNombresPaires();
		Thread thread3 = new Thread(NbrPaires);
		thread3.start();  // Démarre le thread
		
	}

}

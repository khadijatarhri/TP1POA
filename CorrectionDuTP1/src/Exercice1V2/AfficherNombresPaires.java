package Exercice1V2;

public class AfficherNombresPaires implements Runnable {

	@Override
	public void run() {
		 for (int i = 2; i <= 60; i += 2) {
	         System.out.print(i + " ");
	     }		
	}

}

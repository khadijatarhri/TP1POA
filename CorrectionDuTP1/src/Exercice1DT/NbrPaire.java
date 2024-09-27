package Exercice1DT;

public class NbrPaire extends Thread {
	public void run() {
	     for (int i = 2; i <= 60; i += 2) {
	         System.out.print(i + " ");
	     }
}
}


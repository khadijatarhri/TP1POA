package Exercice3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Création des threads pour chaque animal
        Course lievre = new Course("Lievre", 10, 5);   // Vitesse rapide, avance de 5 mètres par "step"
        Course tortue = new Course("Tortue", 1, 1);    // Vitesse lente, avance de 1 mètre par "step"

        // Démarrage des threads
        lievre.start();
        tortue.start();
	}

}

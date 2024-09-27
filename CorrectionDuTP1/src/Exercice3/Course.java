package Exercice3;
public class Course extends Thread {
    int distanceParcourue = 0;
    String nomDeLAnimal;
    int vitesse;   // Vitesse en mètres par seconde
    static int distanceTotale = 100;   // Distance totale de la course en mètres
    static boolean vainqueur = false;  // Indique si un vainqueur a déjà été déclaré
    int pas;       // Nombre de mètres parcourus par "step" de la boucle

    // Constructeur
    public Course(String nomDeLAnimal, int vitesse, int pas) {
        this.nomDeLAnimal = nomDeLAnimal;
        this.vitesse = vitesse;
        this.pas = pas;
    }

    // La méthode run est exécutée lorsque le thread démarre
    public void run() {
        courir();
    }

    private void courir() {
        while (distanceParcourue < distanceTotale && !vainqueur) {
            // Avancer de 'pas' mètres
            distanceParcourue += pas;
            System.out.println(nomDeLAnimal + " a parcouru : " + distanceParcourue + " m");
            
            // Le lièvre fait une pause après 25 mètres
            if (nomDeLAnimal.equals("Lievre") && distanceParcourue == 25) {
                System.out.println(nomDeLAnimal + " DORT !!!");
                try {
                    Thread.sleep(10000);  
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Vérifier si l'animal a gagné
            if (distanceParcourue >= distanceTotale) {
                System.out.println(nomDeLAnimal + " a gagné la course !");
                vainqueur = true;
            }

            // Faire une pause pour simuler la vitesse de chaque animal
            try {
                Thread.sleep(100 / vitesse);  // La vitesse affecte la pause (plus la vitesse est élevée, plus l'attente est courte)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    
}
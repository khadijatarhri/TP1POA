package Exercice2;
public class Aff implements Runnable {
      private Vecteur vecteur;
      private HorlogeGraph hg;
	public Aff(Vecteur vecteur, HorlogeGraph hg) {
		super();
		this.vecteur = vecteur;
		this.hg = hg;
	}
	public Vecteur getVecteur() {
		return vecteur;
	}
	public void setVecteur(Vecteur vecteur) {
		this.vecteur = vecteur;
	}
	@Override
	public void run() {
       while (true) {
    	   try {
    		   Thread.sleep(1000);
    	   }catch(InterruptedException e) {
    		   return ;
    	   }
    	   vecteur.setSec(vecteur.getSec()+1);
    	   if ( vecteur.getSec() == 60) {
    		   vecteur.setSec(0);
    		   vecteur.setMin(vecteur.getMin()+1);
    	   }
    	   if (vecteur.getMin() == 60) {
    		   vecteur.setMin(0);
    	   }
    	   //System.out.println(vecteur + "\n");
    	   hg.setText(vecteur.toString());
       }
	}
}
// Pourquoi le try-catch est nécessaire :

// Gestion des interruptions : La méthode Thread.sleep() est sujette aux interruptions. Si tu fais simplement un Thread.sleep(1000); sans le try-catch, le programme ne pourra pas gérer une éventuelle interruption, et cela pourrait causer un crash ou un comportement inattendu.

// Le return dans le catch : Lorsque l'exception InterruptedException est capturée, le return force la sortie du thread. Cela arrête l'exécution du thread en cours si une interruption se produit. Le fait de ne rien retourner directement n'a pas d'impact, car l'important est de sortir de la méthode run() proprement.

// Tu ne peux pas écrire simplement Thread.sleep(1000); sans le try-catch, car Thread.sleep() lance une exception vérifiée (checked exception). En Java, pour toute exception vérifiée, il est nécessaire d'ajouter un bloc try-catch ou de propager l'exception avec le mot-clé throws.

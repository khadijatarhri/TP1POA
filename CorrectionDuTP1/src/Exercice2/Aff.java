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

package Exercice2;

public class Vecteur {
     private int sec;
     private int min;
     private int heure;
	public Vecteur(int sec, int min, int heure) {
		super();
		this.sec = sec;
		this.min = min;
		this.heure = heure;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getHeure() {
		return heure;
	}
	public void setHeure(int heure) {
		this.heure = heure;
	}
     @Override
     public String toString() {
		return sec + "s , " + min + "min , " + heure + " H , ";
     }
}

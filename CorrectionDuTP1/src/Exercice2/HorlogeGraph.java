package Exercice2;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class HorlogeGraph extends JLabel {	
	public HorlogeGraph() {
		  this.setHorizontalAlignment(JLabel.CENTER);
		  Vecteur vect = new Vecteur(0,0,0);
		  Thread Hor1 = new Thread (new Aff(vect , this), "Horloge");
		  Hor1.start();
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Horloge Graphique");
		frame.setSize(200, 200);
		frame.setContentPane(new HorlogeGraph());
		frame.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE );
		frame.setVisible(true);
		}
		}


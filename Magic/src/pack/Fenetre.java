package pack;

import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Fenetre extends JFrame {
	private static final long serialVersionUID = 1L;
	
public Fenetre(){          
	   
    this.setTitle("Magic");
    this.setSize(700, 700);
    this.setLocationRelativeTo(null);   
 
    //Instanciation d'un objet JPanel
    JPanel pan = new JPanel();
    //Définition de sa couleur de fond
    pan.setBackground(Color.GRAY);
    //On prévient notre JFrame que notre JPanel sera son content pane
   this.setContentPane(new Panneau());               
    this.setVisible(true);
  }       
}
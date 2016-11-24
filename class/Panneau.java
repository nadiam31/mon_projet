package pack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
 
public class Panneau extends JPanel { 
	private static final long serialVersionUID = 1L;

	  public void paintComponent(Graphics g){  
		    g.setColor(Color.BLACK); 
		    g.drawRoundRect(10, 10, 50, 80, 10, 10);
		    
		    Font font = new Font("Comic Sans MS", Font.ITALIC, 10);
		    Font font2 = new Font("Comic Sans MS", Font.BOLD, 20);
		    g.setFont(font);
		    
		    g.setColor(Color.WHITE);		    
		  //  g.drawString(""+Creatures.ID_1.getName()+"", 20, 20);

		    g.setFont(font2);

		    g.setColor(Color.RED);  
		//    g.drawString(""+Creatures.ID_1.getVie()+"", 55, 95);
		    
		    g.setColor(Color.YELLOW);  
	//	    g.drawString(""+Creatures.ID_1.getForce()+"", 5, 95); 
		    
		    //x1, y1, width, height, arcWidth, arcHeight
  }               
}
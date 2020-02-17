package bucky;

import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Calculatlet extends JApplet{
	private double sum;
	  
	public void init() {
		String fn = JOptionPane.showInputDialog("Enter First Num:");
		String sn = JOptionPane.showInputDialog("Enter Second Num:");
		
 
		
		double n1 = Double.parseDouble(fn);
		double n2 = Double.parseDouble(sn);
		
		sum = n1 + n2;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawString("The sum is: " + sum, 25, 30);
	
	}

}

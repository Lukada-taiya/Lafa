package bucky;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
 

import javax.swing.JPanel;

public class Graphic extends JPanel {
	private int d;
	
	public void paintComponent(Graphics g) {
		
		
		super.paintComponent(g);
		//not needed in gui tutorial 2  
		this.setBackground(Color.WHITE);
		
		//Gui Tutorial 2
		/*g.fillOval(10, 10, d, d);*/
		
		
		
		//Graphic Tutorial 1
		g.setColor(Color.BLUE);
		g.fillRect(25, 25, 100, 45);
		
		g.setColor(Color.GREEN);
		g.fillRect(25, 70, 100, 45);
		
		g.setColor(new Color(123, 35, 215));
		g.drawString("Have fun, will you?", 25, 145);
	}
	
	public void newD(int dim) {
		d = (dim >= 0 ? dim: 10);
		repaint();
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(200,200);
	}
	
	public Dimension getMinimumSize() {
		return getPreferredSize();
	}
       
}

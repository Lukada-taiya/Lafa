package bucky;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GraGui extends JFrame{
     private JSlider slider;
     private Graphic graph;
     
     public GraGui() {
    	 
    	 super("Graphic Tutorial");
    	 graph = new Graphic();
    	 graph.setBackground(Color.YELLOW);
    	 
    	 slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
    	 slider.setMajorTickSpacing(10);
    	 slider.setPaintTicks(true);
    	 
    	 slider.addChangeListener(new ChangeListener() {
    		 @Override
			public void stateChanged(ChangeEvent event) {
				 graph.newD(slider.getValue());
				
			}
    		 
    	 });
    	 
    	 add(slider, BorderLayout.SOUTH);
    	 add(graph, BorderLayout.CENTER);
    	 
     }
}

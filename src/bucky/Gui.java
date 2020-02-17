package bucky;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JScrollPane;

 
public class Gui extends JFrame{
    
   private JTextField item1;
   private JTextField item2;
   private JTextField item3;
   private JLabel item4;
   private JPasswordField password;
   private JButton ori;
   private JButton custom;
   private JButton left;
   private JCheckBox bold;
   private JCheckBox italic;
   private Font pf;
   private Font bf;
   private Font itf;
   private Font bif;
   private JRadioButton pb;
   private JRadioButton ib;
   private JRadioButton bb;
   private JRadioButton bib;
   private ButtonGroup group;
   private JComboBox box;
   private JList list;
   private JList list1;
   private JPanel pane;
   private String details;
   private Container con;
   private FlowLayout layout;
   private Color colour;
   private JEditorPane pan;
   
   private static String[] str = {"k.png","p.png"};
   private Icon[] icon = {new ImageIcon(getClass().getResource(str[0])), new ImageIcon(getClass().getResource(str[1]))};
   private String[] names = {"Blue", "Black", "Red", "Green", "White", "Cyan"};
   private Color[] color = {Color.BLUE,Color.BLACK, Color.RED, Color.GREEN, Color.WHITE, Color.CYAN};
   
  
    public Gui() {
    	super("Gui Tutorial");
  	    //Not needed in Gui Tutorial 10 and above, 
    	//setLayout(new FlowLayout());
  	    
    	//Gui Tutorial 14
    	/*item3 = new JTextField("ENTER A URL");
    	item3.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			loadBrowse(e.getActionCommand());
    		}
    	});
    	
    	add(item3, BorderLayout.NORTH);
    	
    	pan = new JEditorPane();
    	pan.setEditable(false);
    	pan.addHyperlinkListener(new HyperlinkListener() {

			@Override
			public void hyperlinkUpdate(HyperlinkEvent arg0) {
			   if(arg0.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
				  loadBrowse(arg0.getURL().toString());
			}
    	
    	});
    	
    	add(new JScrollPane(pan));*/
    	
    	
    	//Gui Tutorial 13 using the JColorChooser
    	/*pane = new JPanel();
    	colour = (Color.WHITE);
    	pane.setBackground(colour);
    	
    	ori = new JButton("Choose color");
    	ori.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent event) {
    			colour = JColorChooser.showDialog(null, "Colors", colour);
    			
    			if(colour == null)
    				colour = (Color.WHITE);
    			
    			pane.setBackground(colour);
    		}
    	});
    
    	add(pane, BorderLayout.CENTER);
    	add(ori, BorderLayout.SOUTH);*/
    	
    	//Gui Tutorial 12
    	/*layout = new FlowLayout();
    	setLayout(layout);
    	con = getContentPane();
    	
    	left = new JButton("Left");
    	add(left);
    	left.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent event) {
    			layout.setAlignment(FlowLayout.LEFT);
    			layout.layoutContainer(con);
    		}
    	});
     
    	custom = new JButton("Center");
    	add(custom);
    	custom.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent event) {
    			layout.setAlignment(FlowLayout.CENTER);
    			layout.layoutContainer(con);
    		}
    	});
    	
    	ori = new JButton("Right");
    	add(ori);
    	ori.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent event) {
    			layout.setAlignment(FlowLayout.RIGHT);
    			layout.layoutContainer(con);
    		}
    	});
    	
    	*/
    	//Gui Tutorial 11
    	/*item4 = new JLabel("Default");
    	add(item4, BorderLayout.SOUTH);
    	
    	pane = new JPanel();
    	add(pane, BorderLayout.CENTER);
    	addMouseListener(new Mouseevent());*/
    	
    	//Gui Tutorial 10
    	/*pane = new JPanel();
    	pane.setBackground(Color.WHITE);
    	add(pane, BorderLayout.CENTER);
    	
    	item4 = new JLabel("Default");
    	add(item4, BorderLayout.SOUTH);
    	
    	Handel handler = new Handel();
    	pane.addMouseListener(handler);
    	pane.addMouseMotionListener(handler);
    	*/
  	    //Gui Tutorial 9
  	   /* list = new JList(names);
  	    list.setVisibleRowCount(3);
  	// this selection mode is the default, therefore no need to set itlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
  	    add(new JScrollPane(list));
  	    
  	    custom = new JButton("Move -->");
  	    custom.addActionListener(new ActionListener() {
  	    	public void actionPerformed(ActionEvent event) {
  	             list1.setListData(list.getSelectedValues()); 
  	    	}
  	    });
  	    
  	    add(custom);
  	    list1 = new JList();
  	    list1.setVisibleRowCount(3);
  	    list1.setFixedCellWidth(85);
  	    list1.setFixedCellHeight(15);
  	   // this selection mode is the default, therefore no need to set it list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
  	    add(new JScrollPane(list1));
  	    /
  	    //Gui Tutorial 8
  	    /*list = new JList(names);
  	    list.setVisibleRowCount(2);
  	    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
  	    add(new JScrollPane(list));
  	    
  	    list.addListSelectionListener(new ListSelectionListener() {
  	    	public void valueChanged(ListSelectionEvent event) {
  	    		getContentPane().setBackground(color[list.getSelectedIndex()]);
  	    	}
  	    });*/
  	    
  	   //Gui Tutorial 7
  	  /*  box = new JComboBox(str);
  	    
  	    
  	    box.addItemListener(new ItemListener() {
  	    	public void itemStateChanged(ItemEvent event) {
  	    		if(event.getStateChange() == ItemEvent.SELECTED)
  	    			item4.setIcon(icon[box.getSelectedIndex()]);
  	    	}
  	    });
  	    
  	    add(box);
  	    item4 = new JLabel(icon[0]);
  	   
  	    add(item4);*/
    	
    	//Gui Tutoria 6
  	    /*item1 = new JTextField("My name is ambomagye bakoe", 25);
  	    add(item1);
  	    
    	pb = new JRadioButton("Plain", true);
    	bb = new JRadioButton("Bold");
    	ib = new JRadioButton("Italic");
    	bib = new JRadioButton("Bold and Italic");
    	
    	add(pb);
    	add(bb);
    	add(ib);
    	add(bib);
    	
    	group = new ButtonGroup();
    	group.add(pb);
    	group.add(bb);
    	group.add(ib);
    	group.add(bib);
    	
    	pf = new Font("Serif", Font.PLAIN, 14);
    	bf = new Font("Serif", Font.BOLD, 14);
    	itf = new Font("Serif", Font.ITALIC, 14);
    	bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
    	
    	pb.addItemListener(new HandleClass(pf));
    	ib.addItemListener(new HandleClass(itf));
    	bb.addItemListener(new HandleClass(bf));
    	bib.addItemListener(new HandleClass(bif));*/
    
      //Gui Tutorial 2
	 /* item1 = new JTextField("Enter Text Here!", 20);
	  item1.setFont(new Font("Serif", Font.PLAIN, 14));
	  add(item1);
	  
	  bold = new JCheckBox("Bold");
	  italic = new JCheckBox("Italic");
	  add(bold);
	  add(italic);
	  
	  HandleClass hand = new HandleClass();
	  
	  bold.addItemListener(hand);
	  italic.addItemListener( hand);
	  */
	  
  
   
   //Gui Tutorial 4
    /*   ori = new JButton("Original");
	   add(ori);
	   
	  Icon k = new ImageIcon(getClass().getResource("k.png"));
	  Icon p = new ImageIcon(getClass().getResource("p.png"));
	  
	  custom = new JButton(k);
	  custom.setRolloverIcon(p);
	  add(custom);
	  
	  Handler handle = new Handler();
	  
	  ori.addActionListener(handle);
	  custom.addActionListener(handle);*/
	   
	   
   
 
	
	   //Gui Tutorial 5
	     
		/*item4 = new JLabel("Yh, Nigga!! Ya feel me!!");
		item4.setToolTipText("My life");
		
		add(item4);
	  */
	
	
	 // Gui Tutorial 1
//	 
//	   item1 = new JTextField(10);
//	   add(item1);
//	   
//	   item2 = new JTextField("Enter name please");
//	   add(item2);
//	   
//	   item3 = new JTextField("Uneditable", 20);
//	   item3.setEditable(false);
//	   add(item3);
//	   
//	   password = new JPasswordField("mypass");
//	   add(password);
//	   
//	   Handler handle = new Handler();
//	   
//	   item1.addActionListener(handle);
//	   item2.addActionListener(handle);
//	   item3.addActionListener(handle);
//	   password.addActionListener(handle);
	   
	   
	   
    
	
    }
   
   
   private class Handler implements ActionListener{
	  
	   
	  // Method 1 for Gui Tutorial 1
	/*    public void actionPerformed(ActionEvent event) {
		   String string="";
		   
		   if(event.getSource()== item1)
			   string = String.format("Item 1: %s", event.getActionCommand());
		   
		   else if(event.getSource()== item2)
			   string = String.format("Item 2: %s", event.getActionCommand());
		   
		   else if(event.getSource()== item3)
			   string = String.format("Item 3: %s", event.getActionCommand());
		   
		   else if(event.getSource()== password)
			   string = String.format("Password is: %s", event.getActionCommand());
		   
		   JOptionPane.showMessageDialog(null, string);
	   }*/
	   
	   //Method for Gui Tutorial 4
	   public void actionPerformed(ActionEvent event) {
		   if(event.getSource() == ori)
			   JOptionPane.showMessageDialog(null, event.getActionCommand()+ "\n Original button was clicked.");
		   else if(event.getSource() == custom)
			   JOptionPane.showMessageDialog(null, event.getActionCommand()+ "\nCustom button was clicked.");
	   }
	   
   }
   
   private class HandleClass implements ItemListener {
	   //Gui Tutorial 6 Constructor applicable to only Tutorial 6
	   private Font font;
	   public HandleClass(Font f) {
		   font = f;
	   }
	   
	   public void itemStateChanged(ItemEvent event) {
		   item1.setFont(font);
	   }
	   //Gui Tutorial 2
	   /*public void itemStateChanged(ItemEvent event) {
		   Font f;
		   
		   if(bold.isSelected() && italic.isSelected())
			   f = new Font("Serif", Font.BOLD+Font.ITALIC, 14);
		   else if(italic.isSelected())
			   f = new Font("Serif", Font.ITALIC, 14);
		   else if(bold.isSelected())
			   f = new Font("Serif", Font.BOLD, 14);
		   else 
			   f = new Font("Serif", Font.PLAIN, 14);
		   
		   item1.setFont(f);
	   
		   
	   }*/
	   
   }
   
   private class Handel implements MouseListener, MouseMotionListener {
	   //Gui Tutorial 10
	   public void mouseClicked(MouseEvent event) {
		   item4.setText(String.format("Mouse has been clicked at %d,%d ", event.getX(), event.getY()));
	   }
	   public void mousePressed(MouseEvent event) {
		   item4.setText("Mouse has been pressed!");
	   }
	   public void mouseReleased(MouseEvent event) {
		   item4.setText("Mouse has been released!");
	   }
	   public void mouseEntered(MouseEvent event) {
		   item4.setText("Mouse has entered the area!");
		   pane.setBackground(Color.YELLOW);
	   }
	   public void mouseExited(MouseEvent event) {
		   item4.setText("Mouse has left the area!");
		   pane.setBackground(Color.WHITE);
	   }
	   
	   public void mouseDragged(MouseEvent event) {
		   item4.setText("Mouse is been dragged!");
	   }
	   public void mouseMoved(MouseEvent event) {
		   item4.setText("Mouse is moving!");
	   }
   }
   
   private class Mouseevent extends MouseAdapter {
	   //Gui Tutorial 11
	   public void mouseClicked(MouseEvent event) {
		   details = String.format("Mouse has been clicked %d", event.getClickCount());
		   
		   if(event.isMetaDown())
			   details += " with the right button";
		   else if(event.isAltDown())
			   details += " with the center button";
		   else 
			   details += " with the left mouse button";
		 item4.setText(details);  
	   }
	   
   }
	
	 //Gui Tutorial 3
	public static void joption() {
		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter second number");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The answer is: " +sum, "Sum", JOptionPane.PLAIN_MESSAGE);
		
	}
	
	//Gui Tutorial 14
	private void loadBrowse(String s) {
		try {
			pan.setPage(s);
			item3.setText(s);
		}catch(Exception r) {
		  JOptionPane.showMessageDialog(null, "No internet connection");
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

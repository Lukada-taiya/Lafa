package chatroom;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Chat extends JFrame{
	private JTextField textfield;
	private JTextArea textarea;
	private ObjectInputStream input;
	private ObjectOutputStream output;
	private ServerSocket server;
	private Socket connection;
	
	
	public Chat() {
		super("Adam's Messenger");
		
		textfield = new JTextField();
		textfield.setEditable(false);
		textfield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				sendMessage(event.getActionCommand());
				textfield.setText("");
			}
		});
		
		add(textfield, BorderLayout.SOUTH);
		
		textarea = new JTextArea();
		add(new JScrollPane(textarea));
		setSize(400, 525);
		setVisible(true);
	}
	
	public void startRunning() {
		try{
			server = new ServerSocket(6789, 100);
			 while(true) {
				try {
					 waitingConn();
					 setupStreams();
					 whileChatting();
				 }catch(EOFException eof) {
						showMessage("\nServer has lost connection!");
					}finally {
						closeConn();
					}
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		} 
	}
	
	private void waitingConn() throws IOException {
		showMessage(" Waiting for connection.... \n");
		connection = server.accept();
		showMessage(" You have successfully connected to " + server.getInetAddress().getHostName());
	}
	
	private void setupStreams() throws IOException {
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Streams has been set up successfully \n");
	}
	
	private void whileChatting() throws IOException {
	   String  message = ("\n You are now connected!! ");
	   sendMessage(message);
	   ableToType(true);
	   
	   do {
		   try {
			   message = (String) input.readObject();
			   showMessage(message);
			   
		   }catch(ClassNotFoundException cnfe) {
			   showMessage("Didn't see what was sent.");
		   }
		   
	   }while(!message.equals("CLIENT - END"));
	   
		
	}
	
	private void closeConn(){
		showMessage("Closing Connections...");
		ableToType(false);
		
		try {
			input.close();
			output.close();
			connection.close();
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	private void sendMessage(String message) {
		try{
			output.writeObject("SERVER - " + message);
			output.flush();
			showMessage("\nSERVER - " + message);
		}catch(IOException e) {
			textarea.append("Can't send message \n");
		}
	}
	
	private void showMessage(final String text) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				textarea.append(text);
			}
		});
	}
	
	private void ableToType(final boolean t) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				 textfield.setEditable(t);
			}
		});
	}
	

}




















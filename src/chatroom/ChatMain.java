package chatroom;

import javax.swing.JFrame;

public class ChatMain {

	public static void main(String[] args) {
		Chat nepa = new Chat();
		nepa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nepa.startRunning();

	}

}

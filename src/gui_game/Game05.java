package gui_game;

import javax.swing.JFrame;

public class Game05 {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		
		frame.setSize(1000, 800);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		ButtonArray ba=new ButtonArray();
		frame.add(ba);
		frame.revalidate();
	}
}

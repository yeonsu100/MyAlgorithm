package gui_game;

import javax.swing.JFrame;

public class Game02 {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setTitle("From 1 to 50");
		frame.setSize(1000, 800);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		From1To50 ft=new From1To50();
		frame.add(ft);
		frame.revalidate();
	}
}

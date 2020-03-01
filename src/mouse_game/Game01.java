package mouse_game;

import javax.swing.JFrame;

public class Game01 {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setTitle("From 1 to 50 game using Mouse!!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 800);
		frame.setLocation(100, 0);
		From1To50 ft=new From1To50();
		frame.setContentPane(ft);
		frame.setVisible(true);
	}
}

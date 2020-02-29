package gui_game;

import javax.swing.JFrame;

public class Game01 {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setTitle("Slide Game");
		frame.setSize(1000, 800);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		NumberSlidePuzzle nsp=new NumberSlidePuzzle();
		frame.add(nsp);
		frame.revalidate();
	}
}
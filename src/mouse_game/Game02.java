package mouse_game;

import javax.swing.JFrame;

public class Game02 {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setTitle("Rect Move");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 800);
		frame.setLocation(100, 0);
		RectMove rm=new RectMove();
		frame.setContentPane(rm);
		frame.setVisible(true);
	}
}

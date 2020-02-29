package gui_game;

import javax.swing.JFrame;

public class Game03 {
	static public JFrame frame=new JFrame();
	static final int WIDTH=1200;
	static final int HEIGHT=800;
	
	public static void main(String[] args) {
		frame.setTitle("Omock");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.add(new Omock());
		frame.revalidate();
	}
}

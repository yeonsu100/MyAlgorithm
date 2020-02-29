package gui_game;

import javax.swing.JFrame;

public class Game04 {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setTitle("Tic Tac Toe");
		frame.setSize(1000, 800);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		TicTacToe ttt=new TicTacToe();
		frame.add(ttt);
		frame.revalidate();
	}
}

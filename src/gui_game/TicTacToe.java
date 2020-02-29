package gui_game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class TicTacToe extends JPanel implements ActionListener {
	JButton ttt[][];
	int data[][];
	boolean turn;
	TicTacToe(){
		this.setLayout(null);
		basic_set();
	}
	
	public void basic_set() {
		turn=true;
		ttt=new JButton[3][3];
		data=new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int n=0; n<3; n++) {
				ttt[i][n]=new JButton();
				ttt[i][n].setSize(100, 100);
				ttt[i][n].setLocation(i*100, n*100);
				ttt[i][n].addActionListener(this);
				add(ttt[i][n]);
				data[i][n]=0;
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<3; i++) {
			for(int n=0; n<3; n++) {
				if(e.getSource() == ttt[i][n]) {
					if(turn == true) {
						if(data[i][n] == 0) {
							ttt[i][n].setText("O");
							turn = !turn;
						}
					}else {
						if(data[i][n] == 0) {
							ttt[i][n].setText("X");
							turn = !turn;
						}
					}
				}
			}
		}	
	}
}

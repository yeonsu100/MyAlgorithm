package gui_game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class ButtonArray extends JPanel implements ActionListener {
	JButton btn_arr[];
	
	ButtonArray(){
		this.setLayout(null);
		
		btn_arr=new JButton[5];
		for(int i=0; i<5; i++) {
			btn_arr[i]=new JButton();
			btn_arr[i].setText((i+1)+"");
			btn_arr[i].setSize(100, 100);
			btn_arr[i].setLocation(100+i*100, 100);
			btn_arr[i].addActionListener(this);
			add(btn_arr[i]);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<5; i++) {
			if(e.getSource() == btn_arr[i]) {
				btn_arr[i].setText("!!!");
			}
		}
	}
}

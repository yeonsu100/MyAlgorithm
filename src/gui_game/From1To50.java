package gui_game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

class From1To50 extends JPanel implements ActionListener {
	JButton btn;
	JButton btn_arr[];
	int game_num;
	int [] front;
	int [] back;
	Random ran;
	
	From1To50() {
		this.setLayout(null);
		game_num=1;
		ran=new Random();
		basic_set();
		num_shuffle();
		btn_shuffle();
	}
	
	public void basic_set() {
		btn=new JButton();
		btn.setText("NEXT Number : "+game_num);
		btn.setSize(300, 100);
		btn.setLocation(50, 50);
		add(btn);
		
		btn_arr=new JButton[5];
		front=new int[5];
		back=new int[5];
		for(int i=0; i<5; i++) {
			btn_arr[i]=new JButton();
			btn_arr[i].setText("0");
			btn_arr[i].setSize(100, 100);
			btn_arr[i].setLocation(100+i*100, 200);
			btn_arr[i].addActionListener(this);
			add(btn_arr[i]);
			
			front[i]=i+1;
			back[i]=i+6;
		}
	}
	
	public void num_shuffle() {
		for(int i=0; i<1000; i++) {
			int r=ran.nextInt(5);
			int temp=front[r];
			front[r]=front[0];
			front[0]=temp;
			
			r=ran.nextInt(5);
			temp=back[r];
			back[r]=back[0];
			back[0]=temp;
		}
	}
	
	public void btn_shuffle() {
		for(int i=0; i<5; i++) {
			btn_arr[i].setText(front[i]+"");
		}
	}
	
		
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<5; i++) {
			if(e.getSource() == btn_arr[i]) {
				if(btn_arr[i].getText().equals(game_num+"")) {
					if(game_num < 6) {
						btn_arr[i].setText(back[i]+"");
						game_num += 1;
						btn.setText("NEXT Number : "+game_num);
					}else {
						btn_arr[i].setText("");
						game_num += 1;
						if(game_num > 10) {
							btn.setText("GAME OVER");
						}else {
							btn.setText("NEXT Number : "+game_num);
						}
					}
				}
			}
		}
	}
}

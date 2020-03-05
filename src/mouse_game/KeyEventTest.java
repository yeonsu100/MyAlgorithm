package mouse_game;

import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyEventTest {
	public static void main(String[] args) {
		new KeyEventFrame();
	}
}

class KeyEventPanel extends JPanel implements KeyListener {
	
	private int x=100;
	private int y=100;
	private char keyChar='A';
	public KeyEventPanel() {
		addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent ke) {}

	@Override
	public void keyReleased(KeyEvent ke) {}
	
	@Override
	public void keyPressed(KeyEvent ke) {
		keyChar=ke.getKeyChar();
		repaint();			// paintComponent()
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
		g.drawString(String.valueOf(keyChar), x, y);
	}
}

class KeyEventFrame extends JFrame {
	public KeyEventFrame() {
		Container ct=getContentPane();
		KeyEventPanel kep=new KeyEventPanel();
		kep.setFocusable(true);
		ct.add(kep);
		setTitle("KeyEvent Test");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
package mouse_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

class MouseEventPanel extends Panel implements MouseListener {
	
	public MouseEventPanel() {
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEvent");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");
	}

}

class MouseEventFrame extends JFrame {
	public MouseEventFrame() {
		Container ct=getContentPane();
		ct.add(new MouseEventPanel());
		setTitle("MouseEvent Test");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class MouseEventTest {
	public static void main(String[] args) {
		new MouseEventFrame();
	}
}
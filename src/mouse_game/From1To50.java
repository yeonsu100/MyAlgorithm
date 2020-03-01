package mouse_game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

class Rect{int x; int y; int size; int num; Color color; int back;}

class From1To50 extends JPanel implements MouseListener, MouseMotionListener {
	Rect [] rect=new Rect[25];
	int a=0;
	From1To50(){
		addMouseListener(this);
		addMouseMotionListener(this);
		int i=0;
		for(int y=0; y<5; y++) {
			for(int x=0; x<5; x++) {
				rect[i]=new Rect();
				rect[i].size=50;
				rect[i].x=400+x*rect[i].size;
				rect[i].y=200+y*rect[i].size;
				rect[i].num=i;
				rect[i].color=Color.BLACK;
				rect[i].back=24+i;
			}
		}
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			Thread.sleep(10);
			repaint();
		}catch(Exception e) {}
		g.drawString("Next number : ", 100, 100);
		
		for(int i=0; i<25; i++) {
			g.setColor(rect[i].color);
			g.fillRect(rect[i].x, rect[i].y, rect[i].size, rect[i].size);
			g.setColor(Color.black);
			g.drawRect(rect[i].x, rect[i].y, rect[i].size, rect[i].size);
			g.drawString(rect[i].num+"", rect[i].x+20, rect[i].y+20);
		}
	}
	
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x=e.getX();
		int y=e.getY();
		System.out.println(x+" "+y);
		for(int i=0; i<25; i++) {
			if(rect[i].x<x && x<rect[i].x+rect[i].size 
					&& rect[i].y<y && y<rect[i].y+rect[i].size) {
				rect[i].color=Color.PINK;
			}else {
				rect[i].color=Color.WHITE;
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x=e.getX();
		int y=e.getY();
		System.out.println(x+" "+y);
		for(int i=0; i<25; i++) {
			if(rect[i].x<x && x<rect[i].x+rect[i].size) {
				if(rect[i].y<y && y<rect[i].y+rect[i].size) {
					rect[i].num=rect[i].back;
				}
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

//package mouse_game;
//
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;
//
//import javax.swing.JPanel;
//
//class Rect{
//	int x;
//	int y;
//	int w;
//	int h;
//	String text;
//	Color color;
//	Rect(){};
//	Rect(int x, int y, int w, int h){
//		this.x=x;
//		this.y=y;
//		this.w=w;
//		this.h=h;
//		color=Color.black;
//	}
//}
//
//class RectMove extends JPanel implements MouseListener, MouseMotionListener {
//
//	Rect arrow[]=new Rect[4];
//	int state=-1;
//	int speed=1;
//	Rect rc=new Rect(100, 100, 100, 100);
//	Rect rc2=new Rect(400, 100, 100, 100);
//	boolean press=false;
//	int pressX;
//	int pressY;
//	
//	RectMove(){
//		addMouseListener(this);
//		addMouseMotionListener(this);
//		rc.x=100;
//		rc.y=100;
//		for(int i=0; i<4; i++) {
//			arrow[i]=new Rect();
//			arrow[i].w=50;
//			arrow[i].h=50;
//			arrow[i].text="";
//			arrow[i].color=Color.white;
//		}
//		arrow[0].x=800; arrow[0].y=500; arrow[0].text="↑";
//		arrow[1].x=850; arrow[1].y=550; arrow[1].text="→";
//		arrow[2].x=800; arrow[2].y=550; arrow[2].text="↓";
//		arrow[3].x=750; arrow[3].y=550; arrow[3].text="←";
//	}
//	
//	void update() {
//		if(state==0) {
//			rc.y -= speed;
//		}else if(state == 1) {
//			rc.x += speed;
//		}else if(state == 2) {
//			rc.y += speed;
//		}else if(state == 3) {
//			rc.x -= speed;
//		}
//	}
//	
//	protected void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		try {Thread.sleep(10);repaint();} catch (Exception e) {}
//		update();
//		for(int i=0; i<4; i++) {
//			g.setColor(arrow[i].color);
//			g.fillRect(arrow[i].x, arrow[i].y, arrow[i].w, arrow[i].h);
//			g.setColor(Color.black);
//			g.drawRect(arrow[i].x, arrow[i].y, arrow[i].w, arrow[i].h);
//			g.drawString(arrow[i].text, arrow[i].x+20, arrow[i].y+30);
//		}	
//		g.drawRect(rc.x, rc.y, rc.w, rc.h);
//		g.drawRect(rc2.x, rc2.y, rc2.w, rc2.h);
//	}
//
//	
//	@Override
//	public void mouseDragged(MouseEvent e) {
//		int x=e.getX();
//		int y=e.getY();
//	}
//
//	@Override
//	public void mouseMoved(MouseEvent e) {
//		int x=e.getX();
//		int y=e.getY();		
//	}
//	
//	@Override
//	public void mousePressed(MouseEvent e) {
//		int x=e.getX();
//		int y=e.getY();	
//		for(int i=0; i<4; i++) {
//			if(x>arrow[i].x && x<arrow[i].x+arrow[i].w
//					&& y>arrow[i].y && y<arrow[i].y+arrow[i].h) {
//				arrow[i].color=Color.lightGray;
//				state=i;
//			}
//		}
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		int x=e.getX();
//		int y=e.getY();	
//		for(int i=0; i<4; i++) {
//			arrow[i].color=Color.white;
//			state=-1;
//		}
//	}
//
//	@Override
//	public void mouseClicked(MouseEvent e) {}
//	
//	@Override
//	public void mouseEntered(MouseEvent e) {}
//
//	@Override
//	public void mouseExited(MouseEvent e) {}
//
//}

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class EventApple extends Applet implements MouseListener,MouseMotionListener,KeyListener
{
	String msg=" ";
	int x=0,y=0;
	public void init()
	{	addKeyListener(this);
		addMouseMotionListener(this);
		addMouseListener(this);
		setBackground(Color.red);
		setForeground(Color.black);
	}

	public void paint(Graphics g) 
	{
		showStatus("("+x+","+y+")");
		g.drawString(msg,x,y);
	}

	public void mouseClicked(MouseEvent me)
	{
		msg="mouse clicked";
		x=me.getX();
		y=me.getY();
		  repaint();
	}

	public void mouseEntered(MouseEvent me)
	{
		msg="mouse entered";
		x=me.getX();
		y=me.getY();
		repaint();
		//showStatus("("+(me.getX())+","+(me.getY())+")");
	}

	public void mouseExited(MouseEvent me)
	{
		msg="mouse exited";
		x=me.getX();
		y=me.getY();
		repaint();
	}
	
	public void mousePressed(MouseEvent me)
	{
		msg = "mouse pressed";
		x=me.getX();
		y=me.getY();
		repaint();
	}
	
	public void mouseReleased(MouseEvent me)
	{
		msg = "mouse released";
		x=me.getX();
		y=me.getY();
		repaint();
	}

	public void mouseMoved(MouseEvent me)
	{
		msg="mouse moved";
		x=me.getX();
		y=me.getY();
		repaint();	
	}

	public void mouseDragged(MouseEvent me)
	{
		msg="mouse dragged";
		x=me.getX();
		y=me.getY();
		repaint();
	}

	public void keyReleased(KeyEvent ke)
	{
		msg="key released "+ ke.getKeyCode();
		
		repaint();	
	}

	public void keyPressed(KeyEvent ke)
	{
		msg="key Pressed "+ke.getKeyCode();
		
		repaint();	
	}

	public void keyTyped(KeyEvent ke)
	{
		msg="key typed "+ke.getKeyChar();
		
		repaint();	
	}
	
}

/*
<applet code="EventApple" width="300" height="300"></applet>
*/
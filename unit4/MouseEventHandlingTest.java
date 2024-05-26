import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MouseEventHandlingTest extends JFrame implements MouseListener
{
	int x = 200, y = 200;
	public MouseEventHandlingTest(String title)
	{
		super(title);
		setSize(400,400);
		this.addMouseListener(this);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
    public void mouseClicked(MouseEvent k){
        x = k.getX();
        y = k.getY();
    }
	public void mouseReleased(MouseEvent k){}
	public void mouseEntered(MouseEvent k){}
    public void mouseExited(MouseEvent k){}
	public static void main(String[] args) {
		MouseEventHandlingTest k1 = new MouseEventHandlingTest("Mouse-Event Testing!!!");
	}
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }
}
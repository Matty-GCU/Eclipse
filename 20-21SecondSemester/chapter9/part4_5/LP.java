package part4_5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LP extends JLayeredPane implements MouseListener, MouseMotionListener {
	JButton button;
	int x, y, a, b, x0, y0;
	LP() {
		button = new JButton("用鼠标拖动我");
		button.addMouseListener(this);
		button.addMouseMotionListener(this);
		setLayout(new FlowLayout());
		add(button, JLayeredPane.DEFAULT_LAYER);
	}
	
	public void mousePressed(MouseEvent e) {
		JComponent com = null;
		com = (JComponent) e.getSource();
//		setLayer(com, JLayeredPane.DRAG_LAYER);
//		a = com.getBounds().x;	//a, b是最初在组件上按下鼠标时，组件的左上角在容器坐标系中的位置
//		b = com.getBounds().y;
		x0 = e.getX();			//x0, y0是最初在组件上按下鼠标时，鼠标指针在组件坐标系中的位置坐标
		y0 = e.getY();
	}
	public void mouseReleased(MouseEvent e) {
//		JComponent com = null;
//		com = (JComponent) e.getSource();
//		setLayer(com, JLayeredPane.DEFAULT_LAYER);
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mouseClicked(MouseEvent e) {
	}
	
	public void mouseDragged(MouseEvent e) {
		JComponent com = null;
		if(e.getSource() instanceof Component) {
			com = (JComponent) e.getSource();
			a = com.getBounds().x;
			b = com.getBounds().y;
			x = e.getX();
			y = e.getY();
			com.setLocation(a+x-x0, b+y-y0);
		}
	}
	public void mouseMoved(MouseEvent e) {
	}
}

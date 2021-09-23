package part2;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class WindowMenu extends JFrame {
	JMenuBar menubar;
	JMenu menu1, menu2, subMenu;
	JMenuItem item1, item2;
	public WindowMenu() {
	}
	public WindowMenu(String s, int x, int y, int w, int h) {
		init(s);
		setLocation(x, y);
		setSize(w, h);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	//���в���API
	void init(String s) {
		setTitle(s);
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		menu1 = new JMenu("�˵�1");
		menu2 = new JMenu("�˵�2");
		menubar.add(menu1);
		menubar.add(menu2);
		item1 = new JMenuItem("Java����", new ImageIcon("a.gif"));
		item2 = new JMenuItem("��Ӱ����", new ImageIcon("b.gif"));
		subMenu = new JMenu("��Ϸ����");
		menu1.add(item1);
		menu1.addSeparator();
		menu1.add(item2);
		menu1.addSeparator();
		menu1.add(subMenu);
		item1.setAccelerator(KeyStroke.getKeyStroke('A'));
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		subMenu.add(new JMenuItem("QQũ��", new ImageIcon("c.gif")));
		subMenu.addSeparator();
		subMenu.add(new JMenuItem("QQ����", new ImageIcon("d.gif")));
	}
}

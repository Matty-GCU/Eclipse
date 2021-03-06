package part11;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import part11.HuaRongRoad;
import part11.Person;

public class HuaRongRoad extends JFrame implements MouseListener, KeyListener, ActionListener {
	Person[] person = new Person[10];			//????
	JButton left, right, below, above;			//?߽?
	JButton restart = new JButton("???¿?ʼ");	//??Ϸ?ؿ???ť
	public HuaRongRoad() {
		init();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 500);
		validate();
		setVisible(true);
	}
	public void init() {
		setLayout(null);
		add(restart);
		restart.setBounds(100, 320, 120, 35);
		restart.addActionListener(this);
		String[] name = {"?ܲ?","????","??","??","??","??","??","??","??","??"};
		for(int i = 0; i < name.length; i++) {
			person[i] = new Person(i, name[i]);
			person[i].addMouseListener(this);
			person[i].addKeyListener(this);
			add(person[i]); 
		}
		person[0].setBounds(104, 54, 100, 100);		//?ܲ?
		person[1].setBounds(104, 154, 100, 50);		//????
		person[2].setBounds(54, 154, 50, 100);		//??
		person[3].setBounds(204, 154, 50, 100);		//??
		person[4].setBounds(54, 54, 50, 100);		//??
		person[5].setBounds(204, 54, 50, 100);		//??
		person[6].setBounds(54, 254, 50, 50);		//??1
		person[7].setBounds(204, 254, 50, 50);		//??2
		person[8].setBounds(104, 204, 50, 50);		//??3
		person[9].setBounds(154, 204, 50, 50);		//??4
		person[9].requestFocus();
		left = new JButton();
		right = new JButton();
		below = new JButton();
		above = new JButton();
		left.setBounds(49, 49, 5, 260);
		right.setBounds(254, 49, 5, 260);
		below.setBounds(49, 49, 210, 5);
		above.setBounds(49, 304, 210, 5);
		add(left);
		add(right);
		left.setEnabled(false);
		add(below);
		add(above);
		validate();
	}
	
	//man??ͼ??A????ƽ?Ƶ?B????
	public void go(Person man, JButton direction) {
		boolean couldMove = true;
		Rectangle manGoing = man.getBounds();	//A??
		int x = man.getBounds().x;
		int y = man.getBounds().y;
		if(direction == above)
			y = y + 50;
		else if(direction == below)
			y = y - 50;
		else if(direction == left)
			x = x - 50;
		else if(direction == right)
			x = x + 50;
		manGoing.setLocation(x, y);				//B??
		//?ж?B???Ƿ????????Լ?֮?????????????ص?????B???Ƿ??Ѿ???????????ռ??
		for(int i = 0; i < person.length; i++) {
			Rectangle personRect = person[i].getBounds();
			if((manGoing.intersects(personRect)) && (man.number != i)) {
				couldMove = false;
				break;
			}
		}
		//?ж?B???Ƿ񳬳???Ӧ?????ı߽?
		Rectangle directionRect = direction.getBounds();
		if(manGoing.intersects(directionRect)) {
			couldMove = false;
		}
		//????һ·?ж??????????????ƶ??????????ƶ?????
		if(couldMove == true) {
			man.setLocation(x, y);
		}
	}
	
	//ʹ?ü??̷?????ƽ??????
	public void keyTyped(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyPressed(KeyEvent e) {
		Person man = (Person) e.getSource();
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
			go(man, above);
		if(e.getKeyCode() == KeyEvent.VK_UP)
			go(man, below);
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
			go(man, left);
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			go(man, right);
	}
	
	//???굥??????б???ƶ?????
	public void mouseClicked(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		Person man = (Person)e.getSource();
		//????????λ???????ڱ???????????x??y????
		int x = e.getX();
		int y = e.getY();
		//???????????ĳ?????
		int w = man.getBounds().width;
		int h = man.getBounds().height;
		//????λ?????????????¡????ϡ????ϡ?????ʱ??ִ?в?ͬ????
		//?ϰ벿??
		if(y > h/2) {
			go(man, above);
		}
		//?°벿??
		if(y < h/2) {
			go(man, below);
		}
		//???벿??
		if(x < w/2) {
			go(man, left);
		}
		//?Ұ벿??
		if(x > w/2) {
			go(man, right);
		}
	}
	
	//??Ϸ?ؿ???ť
	public void actionPerformed(ActionEvent e) {
		dispose();
		new HuaRongRoad().setTitle("???ݵ?");
	}
}

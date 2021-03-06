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
	Person[] person = new Person[10];			//人物
	JButton left, right, below, above;			//边界
	JButton restart = new JButton("重新开始");	//游戏重开按钮
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
		String[] name = {"曹操","关羽","张","刘","周","黄","兵","兵","兵","兵"};
		for(int i = 0; i < name.length; i++) {
			person[i] = new Person(i, name[i]);
			person[i].addMouseListener(this);
			person[i].addKeyListener(this);
			add(person[i]); 
		}
		person[0].setBounds(104, 54, 100, 100);		//曹操
		person[1].setBounds(104, 154, 100, 50);		//关羽
		person[2].setBounds(54, 154, 50, 100);		//张
		person[3].setBounds(204, 154, 50, 100);		//刘
		person[4].setBounds(54, 54, 50, 100);		//周
		person[5].setBounds(204, 54, 50, 100);		//黄
		person[6].setBounds(54, 254, 50, 50);		//兵1
		person[7].setBounds(204, 254, 50, 50);		//兵2
		person[8].setBounds(104, 204, 50, 50);		//兵3
		person[9].setBounds(154, 204, 50, 50);		//兵4
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
	
	//man试图从A区域平移到B区域
	public void go(Person man, JButton direction) {
		boolean couldMove = true;
		Rectangle manGoing = man.getBounds();	//A区
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
		manGoing.setLocation(x, y);				//B区
		//判断B区是否与除了自己之外的其他人物重叠，即B区是否已经被其他人物占据
		for(int i = 0; i < person.length; i++) {
			Rectangle personRect = person[i].getBounds();
			if((manGoing.intersects(personRect)) && (man.number != i)) {
				couldMove = false;
				break;
			}
		}
		//判断B区是否超出对应方向的边界
		Rectangle directionRect = direction.getBounds();
		if(manGoing.intersects(directionRect)) {
			couldMove = false;
		}
		//如果一路判断下来都满足可移动条件，就移动人物
		if(couldMove == true) {
			man.setLocation(x, y);
		}
	}
	
	//使用键盘方向键平移组件
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
	
	//鼠标单击可以斜向移动组件
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
		//鼠标点击位置相对于被监视组件的x、y坐标
		int x = e.getX();
		int y = e.getY();
		//被监视组件的长、宽
		int w = man.getBounds().width;
		int h = man.getBounds().height;
		//点击位置在组件的左下、左上、右上、右下时会执行不同方法
		//上半部分
		if(y > h/2) {
			go(man, above);
		}
		//下半部分
		if(y < h/2) {
			go(man, below);
		}
		//左半部分
		if(x < w/2) {
			go(man, left);
		}
		//右半部分
		if(x > w/2) {
			go(man, right);
		}
	}
	
	//游戏重开按钮
	public void actionPerformed(ActionEvent e) {
		dispose();
		new HuaRongRoad().setTitle("华容道");
	}
}

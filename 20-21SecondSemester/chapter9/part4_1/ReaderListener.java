package part4_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ReaderListener implements ActionListener{		//负责创建监视器的类，实现Java规定的接口，该接口中有专门用于处理事件的方法
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());		//获取封装在事件中的command字符串
	}
}

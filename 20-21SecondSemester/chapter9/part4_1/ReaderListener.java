package part4_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ReaderListener implements ActionListener{		//���𴴽����������࣬ʵ��Java�涨�Ľӿڣ��ýӿ�����ר�����ڴ����¼��ķ���
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());		//��ȡ��װ���¼��е�command�ַ���
	}
}

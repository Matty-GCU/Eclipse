package part04;

interface ShowMessage {
	void showMess(String s);		//��ʾ�̱�
}

class TV implements ShowMessage {
	public void showMess(String s) {
		System.out.println(s);
	}
}

class PC implements ShowMessage {
	public void showMess(String s) {
		System.out.println(s);
	}
}

public class Example6_2 {

	public static void main(String[] args) {
		ShowMessage sm;								//�����ӿڱ���
		sm = new TV();									//�ӿڱ�����Ŷ��������
		sm.showMess("����Ӱ�����ӻ�");		//�ӿڻص�
		sm = new PC();
		sm.showMess("��������");
	}

}
//20210121
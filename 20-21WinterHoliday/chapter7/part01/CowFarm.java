package part01;

public class CowFarm {
	static String farmName;
	RedCow redCow;		//�ڲ�����������
	CowFarm() {
	}
	CowFarm(String s) {
		redCow = new RedCow(150, 112, 5000);
		farmName = s;
	}
	void showMess() {
		redCow.speak();
	}
	static class RedCow {		//�ڲ��������
		String cowName = "��ţ";
		int height, weight, price;
		RedCow(int h, int w, int p) {
			height = h;
			weight = w;
			price = p;
		}
		void speak() {
			System.out.println("����"+cowName+",���"+height+",����"+weight+",������"+farmName);
		}
	}			//�ڲ������
}				//��Ƕ�����

package practice4;

class TV {
	int channel;
	void setChannel(int m) {
		if(m>=1) {
			channel = m;
		}
	}
	int getChannel() {
		return channel;
	}
	void showProgram() {
		switch(channel) {
		case 1 : System.out.println("�ۺ�Ƶ��");
					break;
		case 2 : System.out.println("����Ƶ��");
					break;
		case 3 : System.out.println("����Ƶ��");
					break;
		case 4 : System.out.println("����Ƶ��");
					break;
		case 5 : System.out.println("����Ƶ��");
					break;
		}
	}
}

class Family {
	TV homeTV;
	void buyTV(TV tv) {
		homeTV = tv;
	}
	void remoteControl(int m) {
		homeTV.setChannel(m);
	}
	void seeTV() {
		homeTV.showProgram();
	}
}

public class Experiment2_H5_TV {
	public static void main(String[] args) {
		TV greeTV = new TV();
		greeTV.setChannel(5);
		System.out.println("greeTV��Ƶ����" + greeTV.getChannel());
		Family mattyFamily = new Family();
		mattyFamily.buyTV(greeTV);
		System.out.println("mattyFamily��ʼ�����ӽ�Ŀ");
		mattyFamily.seeTV();
		int m = 2;
		System.out.println("mattyFamily�����Ӹ�����" + m + "Ƶ��");
		mattyFamily.remoteControl(m);
		System.out.println("greeTV��Ƶ����" + greeTV.getChannel());
		System.out.println("mattyFamily�ڿ����ӽ�Ŀ");
		mattyFamily.seeTV();
	}
}
//20201207
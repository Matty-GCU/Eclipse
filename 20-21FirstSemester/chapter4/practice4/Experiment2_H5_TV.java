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
		case 1 : System.out.println("综合频道");
					break;
		case 2 : System.out.println("经济频道");
					break;
		case 3 : System.out.println("文艺频道");
					break;
		case 4 : System.out.println("国际频道");
					break;
		case 5 : System.out.println("体育频道");
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
		System.out.println("greeTV的频道是" + greeTV.getChannel());
		Family mattyFamily = new Family();
		mattyFamily.buyTV(greeTV);
		System.out.println("mattyFamily开始看电视节目");
		mattyFamily.seeTV();
		int m = 2;
		System.out.println("mattyFamily将电视更换到" + m + "频道");
		mattyFamily.remoteControl(m);
		System.out.println("greeTV的频道是" + greeTV.getChannel());
		System.out.println("mattyFamily在看电视节目");
		mattyFamily.seeTV();
	}
}
//20201207
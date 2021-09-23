package part11;

import java.util.Random;

public class RandomRedEnvelope extends RedEnvelope {
	double minMoney;			//�û�������������С���
	Random random = new Random();
	RandomRedEnvelope(double remainMoney, int remainPeople) {
		minMoney = 0.01;
		this.remainMoney = remainMoney;
		this.remainPeople = remainPeople;
		if(remainMoney < remainPeople*minMoney) {
			System.out.println("�������С������ʧ��");
			System.exit(0);
		}
	}
	public double giveMoney() {
		if(remainPeople<=0) {
			return 0;
		}
		if(remainPeople==1) {
			money = remainMoney;
			remainPeople--;
			return money;
		}
		money = random.nextDouble()*remainMoney;
		if(remainMoney<minMoney) {
			money = minMoney;
		}
		double leftOtherPeopleMoney = remainMoney-money;		//��ǰ�û����������˵Ľ��
		double otherPeopleNeedMoney = remainPeople*minMoney;	//��֤�����û����ܼ����������ٽ��
		if(leftOtherPeopleMoney < otherPeopleNeedMoney) {
			money -= (otherPeopleNeedMoney-leftOtherPeopleMoney);
		}
		remainMoney -= money;
		remainPeople--;
		return money;
	}
}

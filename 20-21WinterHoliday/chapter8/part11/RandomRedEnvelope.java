package part11;

import java.util.Random;

public class RandomRedEnvelope extends RedEnvelope {
	double minMoney;			//用户可以抢到的最小金额
	Random random = new Random();
	RandomRedEnvelope(double remainMoney, int remainPeople) {
		minMoney = 0.01;
		this.remainMoney = remainMoney;
		this.remainPeople = remainPeople;
		if(remainMoney < remainPeople*minMoney) {
			System.out.println("红包金额过小，发送失败");
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
		double leftOtherPeopleMoney = remainMoney-money;		//当前用户留给其他人的金额
		double otherPeopleNeedMoney = remainPeople*minMoney;	//保证其他用户还能继续抢的最少金额
		if(leftOtherPeopleMoney < otherPeopleNeedMoney) {
			money -= (otherPeopleNeedMoney-leftOtherPeopleMoney);
		}
		remainMoney -= money;
		remainPeople--;
		return money;
	}
}

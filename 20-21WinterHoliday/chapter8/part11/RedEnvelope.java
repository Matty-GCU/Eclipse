package part11;

public abstract class RedEnvelope {
	public double remainMoney;		//待抢红包余额
	public int remainPeople;		//待抢红包人数
	public double money;			//待抢小红包金额
	public abstract double giveMoney();		//抢一次红包
}

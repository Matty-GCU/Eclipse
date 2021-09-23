package part11;
public class Example8_23 {

	public static void main(String[] args) {
		RedEnvelope redEnvelope = new RandomRedEnvelope(5.20, 6);
		System.out.println(
			"以下用循环输出"+redEnvelope.remainPeople+"个人抢"+redEnvelope.remainMoney+"元红包的过程：");
		showProcess(redEnvelope);
	}
	public static void showProcess(RedEnvelope redEnvelope) {
		double sum = 0;
		while(redEnvelope.remainPeople > 0) {
			double money = redEnvelope.giveMoney();
			String str = String.format("%.2f", money);
			money = Double.parseDouble(str);
			System.out.println(money);
			sum += money;
		}
		String str = String.format("%.2f", sum);
		sum = Double.parseDouble(str);
		System.out.println(sum+"元的红包被抢完");
	}
}

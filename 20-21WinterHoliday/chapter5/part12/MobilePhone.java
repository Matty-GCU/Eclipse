package part12;

public class MobilePhone {
	SIM card;
	public void useSIM(SIM card) {
		this.card = card;
	}
	public void showInfo() {
		System.out.println("使用的卡是" + card.getCorpName() + "提供的");
		System.out.println("手机号码是" + card.getNumber());
	}
}
//20210119
package part12;

public class MobilePhone {
	SIM card;
	public void useSIM(SIM card) {
		this.card = card;
	}
	public void showInfo() {
		System.out.println("ʹ�õĿ���" + card.getCorpName() + "�ṩ��");
		System.out.println("�ֻ�������" + card.getNumber());
	}
}
//20210119
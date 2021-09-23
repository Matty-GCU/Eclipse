package part12;

public class Application {

	public static void main(String[] args) {
		MobilePhone phone = new MobilePhone();
		SIM card;
		card = new SIMOfChinaMobile();
		card.setNumber("13417143272");
		phone.useSIM(card);
		phone.showInfo();
		card = new SIMOfChinaUnicom();
		card.setNumber("123456789");
		phone.useSIM(card);
		phone.showInfo();
	}

}
//20210119
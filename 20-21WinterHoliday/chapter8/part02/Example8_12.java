package part02;

public class Example8_12 {

	public static void main(String[] args) {
		String shoppingReceipt = "ţ�̣�8.5Ԫ���㽶��3.6Ԫ��2.8Ԫ";
		PriceToken checkPriceMess = new PriceToken();
		System.out.println(shoppingReceipt);
		double sum = checkPriceMess.getPriceSum(shoppingReceipt);
		System.out.printf("�����ܼ۸�%-7.2f", sum);
		int amount = checkPriceMess.getGoodsAmount(shoppingReceipt);
		double aver = checkPriceMess.getAverPrice(shoppingReceipt);
		System.out.printf("\n��Ʒ��Ŀ��%d��ƽ���۸�%-7.2f", amount, aver);
	}

}

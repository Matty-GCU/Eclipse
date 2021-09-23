package part02;

public class Example8_12 {

	public static void main(String[] args) {
		String shoppingReceipt = "牛奶：8.5元，香蕉：3.6元：2.8元";
		PriceToken checkPriceMess = new PriceToken();
		System.out.println(shoppingReceipt);
		double sum = checkPriceMess.getPriceSum(shoppingReceipt);
		System.out.printf("购物总价格：%-7.2f", sum);
		int amount = checkPriceMess.getGoodsAmount(shoppingReceipt);
		double aver = checkPriceMess.getAverPrice(shoppingReceipt);
		System.out.printf("\n商品数目：%d，平均价格：%-7.2f", amount, aver);
	}

}

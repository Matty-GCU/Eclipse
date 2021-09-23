package part02;
import java.util.StringTokenizer;

public class PriceToken {
	public double getPriceSum(String shoppingReceipt) {
		String regex = "[^0123456789]";
		//String regex = "\\D+";
		shoppingReceipt = shoppingReceipt.replaceAll(regex, "#");
		StringTokenizer stringTokenizer = new StringTokenizer(shoppingReceipt, "#");
		double sum = 0;
		while(stringTokenizer.hasMoreTokens()) {
			String item = stringTokenizer.nextToken();
			double price = Double.parseDouble(item);
			sum += price;
		}
		return sum;
	}
	public double getAverPrice(String shoppingReceipt) {
		double priceSum = getPriceSum(shoppingReceipt);
		int goodsAmount = getGoodsAmount(shoppingReceipt);
		double aver = priceSum/goodsAmount;
		return aver;
	}
	public int getGoodsAmount(String shoppingReceipt) {
		String regex = "[^0123456789]";
		shoppingReceipt = shoppingReceipt.replaceAll(regex, "#");
		StringTokenizer stringTokenizer = new StringTokenizer(shoppingReceipt, "#");
		int amount = stringTokenizer.countTokens();
		return amount;
	}
}

package part03;

public class Example8_13 {

	public static void main(String[] args) {
		String cost = "市话：76.80元，长途：167.38元，短信：12.68";
		double priceSum = GetPrice.getPriceSum(cost);
		System.out.printf("%s\n总价：%.2f元\n", cost, priceSum);
		cost = "牛奶：8.5元，香蕉3.6元，酱油2.8元";
		priceSum = GetPrice.getPriceSum(cost);
		System.out.printf("%s\n总价：%.2f元\n", cost, priceSum);
	}

}

package part03;

public class Example8_13 {

	public static void main(String[] args) {
		String cost = "�л���76.80Ԫ����;��167.38Ԫ�����ţ�12.68";
		double priceSum = GetPrice.getPriceSum(cost);
		System.out.printf("%s\n�ܼۣ�%.2fԪ\n", cost, priceSum);
		cost = "ţ�̣�8.5Ԫ���㽶3.6Ԫ������2.8Ԫ";
		priceSum = GetPrice.getPriceSum(cost);
		System.out.printf("%s\n�ܼۣ�%.2fԪ\n", cost, priceSum);
	}

}

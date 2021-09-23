package part03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GetPrice {

	public static double getPriceSum(String cost) {
		Scanner sc = new Scanner(cost);
		sc.useDelimiter("[^0123456789.]+");
		//сп.
		double sum = 0;
		while(sc.hasNext()) {
			try {
				double price = sc.nextDouble();
				sum = sum+price;
			}
			catch (InputMismatchException e) {
				String str = sc.next();
			}
		}
		return sum;
	}

}

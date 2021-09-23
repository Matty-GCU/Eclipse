package chapter4;
import static java.lang.System.out;

public class H2_Test {

	public static void main(String[] args) {
		H2_Lader lader = new H2_Lader();
		lader.setAbove(1.4);
		lader.setBottom(2.9);
		lader.setHeight(3.0);
		double area = lader.Area();
		out.println(area);
	}

}
//20201124
package chapter4;
import static java.lang.System.*;

public class H1_Test {

	public static void main(String[] args) {
		H1_MathExample m = new H1_MathExample();
		if(m.isNarcissus(137) == true)
			out.println("137是水仙花数");
		else
			out.println("137不是水仙花数");
		if(m.isPrimeNumber(23) == true)
			out.println("23是素数");
		else
			out.println("23不是素数");
		
	}

}
//20201124
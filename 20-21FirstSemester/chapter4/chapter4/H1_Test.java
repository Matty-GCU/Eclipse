package chapter4;
import static java.lang.System.*;

public class H1_Test {

	public static void main(String[] args) {
		H1_MathExample m = new H1_MathExample();
		if(m.isNarcissus(137) == true)
			out.println("137��ˮ�ɻ���");
		else
			out.println("137����ˮ�ɻ���");
		if(m.isPrimeNumber(23) == true)
			out.println("23������");
		else
			out.println("23��������");
		
	}

}
//20201124
package chapter4;

public class H1_MathExample {

	boolean result;
	boolean isNarcissus(int a) {
		int a1 = a/100,a2 = a/10%10,a3 = a%10;
		int b = a1*a1*a1 + a2*a2*a2 + a3*a3*a3;
		if(b == a)
			result = true;
		else
			result = false;
		return result;
	}
	boolean isPrimeNumber(int a) {
		int divisor;
		for(divisor = 2; divisor <= a/2; divisor++) {
			if(a%divisor==0) {
				break;	
			}
		}
		if(divisor>a/2 )
			result = true;
		else
			result = false;
		return result;
	}

}
//20201124

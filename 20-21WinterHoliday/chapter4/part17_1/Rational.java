package part17_1;

public class Rational {
	int numerator = 1;
	int denominator = 1;
	//setter
	void setNumerator(int a) {
		int b = f(Math.abs(a), denominator);
		numerator = a/b;
		denominator = denominator/b;
		if(numerator<0&&denominator<0) {
			numerator = -numerator;
			denominator = -denominator;
		}
	}
	void setDenominator(int a) {
		int b = f(Math.abs(a), numerator);	
		numerator = numerator/b;
		denominator = a/b;
		if(numerator<0&&denominator<0) {
			numerator = -numerator;
			denominator = -denominator;
		}
	}
	//getter
	int getNumerator() {
		return numerator;
	}
	int getDenominator() {
		return denominator;
	}
	//求最大公约数
	int f(int a, int b) {
		if(a==0)
			return 1;
		if(a<b) {
			int t = a;
			a = b;
			b = t;
		}
		int t = a%b;
		while(t!=0) {
			a = b;
			b = t;
			t = a%b;
		}
		return b;
	}
	//加法运算
	Rational add(Rational r) {
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator*b + a*denominator;
		int newDenominator = denominator*b;
		Rational result = new Rational();
		result.setNumerator(newNumerator);
		result.setDenominator(newDenominator);
		return result;
	}
	//减法运算
	Rational sub(Rational r) {
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator*b - a*denominator;
		int newDenominator = denominator*b;
		Rational result = new Rational();
		result.setNumerator(newNumerator);
		result.setDenominator(newDenominator);
		return result;
	}
	//乘法运算
	Rational muti(Rational r) {
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator*a;
		int newDenominator = denominator*b;
		Rational result = new Rational();
		result.setNumerator(newNumerator);
		result.setDenominator(newDenominator);
		return result;
	}
	//除法运算
	Rational div(Rational r) {
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator*b;
		int newDenominator = denominator*a;
		Rational result = new Rational();
		result.setNumerator(newNumerator);
		result.setDenominator(newDenominator);
		return result;
	}
	
}
//20210113
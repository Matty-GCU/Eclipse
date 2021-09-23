package part17_1;
import static myUtil.Printer.*;

public class Example4_23 {

	public static void main(String[] args) {
		Rational r1 = new Rational();
		r1.setNumerator(1);
		r1.setDenominator(5);
		Rational r2 = new Rational();
		r2.setNumerator(3);
		r2.setDenominator(2);
		//四则运算
		Rational result = r1.add(r2);
		int a = result.getNumerator();
		int b = result.getDenominator();
		p("1/5+3/2 = "+a+"/"+b);
		result = r1.sub(r2);
		a = result.getNumerator();
		b = result.getDenominator();
		p("1/5-3/2 = "+a+"/"+b);
		result = r1.muti(r2);
		a = result.getNumerator();
		b = result.getDenominator();
		p("1/5*3/2 = "+a+"/"+b);
		result = r1.div(r2);
		a = result.getNumerator();
		p(a);
		b = result.getDenominator();
		p("1/5/÷3/2 = "+a+"/"+b);
		//前n项和
		int n = 10, k = 1;
		p("计算2/1+3/2+5/3+8/5+13/8+..."+"的前"+n+"项和");
		Rational sum = new Rational();
		sum.setNumerator(0);
		Rational item = new Rational();
		item.setNumerator(2);
		item.setDenominator(1);
		while(k<=n) {
			sum = sum.add(item);
			k++;
			int N = item.getNumerator();
			int D = item.getDenominator();
			item.setNumerator(N+D);
			item.setDenominator(N);
		}
		a = sum.getNumerator();
		b = sum.getDenominator();
		p("用分数表示");
		p(a+"/"+b);
		double doubleResult = (a*1.0)/b;
		p("用小数表示");
		p(doubleResult);
	}
	
}
//20210114
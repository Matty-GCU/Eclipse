package part06;

import java.util.Date;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		Date nowTime = new Date();
		String s = String.format("%tYƒÍ%tm‘¬%td»’", nowTime, nowTime, nowTime);
		System.out.println(s);
		s = String.format("%tF", nowTime);
		System.out.println(s);
		s = String.format("%tY-%tm-%td", nowTime, nowTime, nowTime);
		System.out.println(s);
		s = String.format("%tY-%tm-%<td", nowTime, nowTime);
		System.out.println(s);
		s = String.format("%ty-%<tB-%<td-%<tp", nowTime);
		System.out.println(s);
		s = String.format(Locale.FRANCE, "%ty-%<tB-%<td-%<tp", nowTime);
		System.out.println(s);
	}

}

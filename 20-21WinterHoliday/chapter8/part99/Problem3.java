package part99;

import static myUtil.Printer.*;
import java.util.Calendar;

public class Problem3 {
	public static void main(String[] s) {
		p(s);
		int y1 = Integer.parseInt(s[0]); 
		int m1 = Integer.parseInt(s[1])-1; 
		int d1 = Integer.parseInt(s[2]); 
		int y2 = Integer.parseInt(s[3]); 
		int m2 = Integer.parseInt(s[4])-1; 
		int d2 = Integer.parseInt(s[5]); 
		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(y1, m1, d1);
		long t1 = calendar1.getTimeInMillis();
		p(String.format("%tF", calendar1));
		Calendar calendar2 = Calendar.getInstance();
		calendar1.set(y2, m2, d2);
		long t2 = calendar2.getTimeInMillis();
		p(String.format("%tF", calendar2));
		long t3 = (t2-t1)/1000/60/60/24;
		p("œ‡≤Ó"+t3+"ÃÏ");
	}
}

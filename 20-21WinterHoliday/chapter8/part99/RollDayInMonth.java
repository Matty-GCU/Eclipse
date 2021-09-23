package part99;

import java.util.Calendar;
import java.util.Date;
import static myUtil.Printer.*;

public class RollDayInMonth {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		String s = String.format("%tF(%<tA)", calendar);
		p(s);
		int n = 25;
		p("�������������ڣ�"+n+"��;");
		calendar.roll(calendar.DAY_OF_MONTH, n);
		p("�������������ڣ�"+n+"��;");
		calendar.roll(calendar.DAY_OF_YEAR, n);
		s = String.format("%tF(%<tA)", calendar);
		p(s);
	}

}

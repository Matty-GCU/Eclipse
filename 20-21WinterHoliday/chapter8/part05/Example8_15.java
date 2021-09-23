package part05;
import java.util.Calendar;
import java.util.Date;
import static myUtil.Printer.*;

public class Example8_15 {

	public static void main(String[] args) {
		//Class Date
		Date nowTime = new Date();
		p(nowTime);
		Date theTime = new Date(0);
		p(theTime);
		theTime = new Date(1000);
		p(theTime);
		theTime = new Date(-1000);
		p(theTime);
		p(System.currentTimeMillis()/(1000*60*60*24));
		//Class Date & Class Calendar
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int year = calendar.get(Calendar.YEAR),
		month = calendar.get(Calendar.MONTH)+1,
		day = calendar.get(Calendar.DAY_OF_MONTH),
		hour = calendar.get(Calendar.HOUR_OF_DAY),
		minute = calendar.get(Calendar.MINUTE),
		second = calendar.get(Calendar.SECOND);
		p("现在的时间是："+year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒");
		int y=2012, m=9, d=1;
		calendar.set(y, m-1, d);
		long time1 = calendar.getTimeInMillis();
		y=2021;
		m=2;
		d=10;
		calendar.set(y, m-1, d);
		long time2 = calendar.getTimeInMillis();
		long subDay = (time2-time1)/(1000*60*60*24);
		p(new Date(time2));
		p("与"+new Date(time1));
		p("相隔"+subDay+"天");
	}

}

package part05;

public class Example8_16 {

	public static void main(String[] args) {
		CalendarBean cb = new CalendarBean();
		cb.setYear(2077);
		cb.setMonth(11);
		String[] a = cb.getCalendar();
		char[] str = "日一二三四五六".toCharArray();
		for(char c: str) {
			//System.out.printf("%-3c", c);
			System.out.print(c+"\t");
		}
		for(int i=0; i<a.length; i++) {
			if(i%7==0) {
				System.out.println();
			}
			//System.out.printf("%-4d", i);
			System.out.print(a[i]+"\t");
		}
	}

}

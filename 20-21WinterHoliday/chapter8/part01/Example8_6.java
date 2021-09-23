package part01;

public class Example8_6 {

	public static void main(String[] args) {
		char[] a,c;
		String s = "1945年8月15日是抗战纪念日";
		a = new char[4];
		s.getChars(11, 15, a, 0);
		System.out.println(a);
		c = "十一长假期间，学校都放假了".toCharArray();
		System.out.println(c);
	}

}

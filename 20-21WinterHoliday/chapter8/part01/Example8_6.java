package part01;

public class Example8_6 {

	public static void main(String[] args) {
		char[] a,c;
		String s = "1945��8��15���ǿ�ս������";
		a = new char[4];
		s.getChars(11, 15, a, 0);
		System.out.println(a);
		c = "ʮһ�����ڼ䣬ѧУ���ż���".toCharArray();
		System.out.println(c);
	}

}

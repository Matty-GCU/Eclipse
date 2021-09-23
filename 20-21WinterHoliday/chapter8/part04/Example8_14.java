package part04;
import static myUtil.Printer.*;

public class Example8_14 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		str.append("Good morning, ladies and gentlemen.");
		p(str);
		p(str.length());
		p(str.capacity());
		str.setCharAt(1, 'e');
		str.setCharAt(2, 'e');
		p(str);
		str.insert(1, "oo");
		p(str);
		int index = str.indexOf("gentlemen");
		str.replace(index, str.length()-1, "boys");
		p(str);
		String s = new String(str);
		p(s);
	}

}

package part99;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem5 {

	public static void main(String[] args) {
		String s = "cmp'c68d4cdns asjsx ddcm";
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher(s);
		StringBuffer sb = new StringBuffer();
		while(matcher.find()) {
			sb = sb.append(matcher.group());
		}
		System.out.println(sb);
	}

}

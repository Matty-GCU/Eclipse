package chapter8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class H4_findNumbers {
	Pattern pattern;
	Matcher matcher;
	boolean gotSum = false;
	double sum = 0;
	double quantity = 0;
	public H4_findNumbers(String str) {
		String regex = "[0123456789.]+";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(str);
	}
	public void resetMatcher(String newStr) {
		matcher = pattern.matcher(newStr);
	}
	public double sum() {
		while(matcher.find()) {
			sum += Double.parseDouble(matcher.group());
			quantity++;
		}
		gotSum = true;
		return sum;
	}
	public double avg() {
		if(! gotSum) {
			sum();
		}
		return sum / quantity;
	}
	static int y;
	public static void main(String[] args) {
		String str = "有一个字符串as，包括4数字，请将其中的数字提2出出来6，15计算所有数字的和0以及平均值";
		H4_findNumbers homework = new H4_findNumbers(str);
		System.out.println(homework.sum());
		System.out.println(homework.avg());
	}
}

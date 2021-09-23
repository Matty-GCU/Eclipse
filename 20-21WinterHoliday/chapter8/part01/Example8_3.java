package part01;
import java.util.Arrays;

public class Example8_3 {

	public static void main(String[] args) {
		String[] a = {"melon","apple","pear","banana","peach"};
		String[] b = {"melon","apple","pear","banana","peach"};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		SortString.sort(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}
	
}

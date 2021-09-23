package practice2;
import static java.lang.System.out;
import java.util.Arrays;
public class Experiment3_CopyArray {
	public static void main(String[] args) {
		int[] b,c,d;
		
		int[] a = {1,2,3,4,500,600,700,800};
		out.println(Arrays.toString(a));
		
		b = Arrays.copyOf(a,a.length);
		out.println(Arrays.toString(b));
		
		c = Arrays.copyOf(a,4);
		out.println(Arrays.toString(c));
		
		d = Arrays.copyOfRange(a,4,a.length);
		
		c[c.length-1] = -100;
		out.println(Arrays.toString(c));
		
		d[d.length-1] = -200;
		out.println(Arrays.toString(d));
	}
}
//20.10.??
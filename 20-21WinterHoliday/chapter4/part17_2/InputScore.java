package part17_2;
import java.util.Scanner;

public class InputScore {
	DelScore del;
	InputScore(DelScore del) {
		this.del = del;
	}
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入评委数");
		int count = sc.nextInt();
		System.out.println("请输入各个评委的分数");
		double[] a = new double[count];
		for(int i = 0; i < count; i++) {
			a[i] = sc.nextDouble();
		}
		sc.close();
		del.doDelete(a);
	}
	
}
//20210114
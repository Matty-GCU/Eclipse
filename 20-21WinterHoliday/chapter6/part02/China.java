package part02;

public class China implements Computable {
	int number;
	public int f(int x) {
		int sum = 0;
		for(int i = 1; i <= x; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
//20210121
package algorithm;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.Random;

public class BubbleSortV3 {
	public static void main(String[] args) {
		//�����ֵ����
		Random r = new Random();
		int[] a = new int[10];
		for(int i = 0; i < a.length; i++) {
			int x = r.nextInt(30)+1;
			a[i] = x;
		}
		out.println(Arrays.toString(a));
		//ð�����������
		boolean isSorted = true;		//��������
		int lastExchangeIndex = 0;
		int sortBorder = a.length-1;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < sortBorder; j++) {
				if(a[j] > a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
					isSorted = false;
					lastExchangeIndex = j;		//�������Ƚ�
				}
			}
			sortBorder = lastExchangeIndex;
			if(isSorted) {
				break;
			}
		}
		out.println(">>>");
		out.println(Arrays.toString(a));
	}

}
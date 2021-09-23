package chapter2;
import static java.lang.System.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_RandomArraySort {
	//��ҵ3�������ֵ+ð������+��ѯ����+����±�
	public static void main(String[] args) {
		
		int n = 10;
		int[] a = new int[n];
		int[] b = new int[n];
		Random r = new Random();
		for(int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(30)+1;
			b[i] = i;
		}
		out.println(Arrays.toString(a));
		
		boolean isSorted = true;
		int lastExchangeIndex = 0;
		int sortBorder = a.length-1;
		int tmp = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < sortBorder; j++) {
				if(a[j] > a[j+1]) {
					tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
					tmp = b[j];
					b[j] = b[j+1];
					b[j+1] = tmp;
					isSorted = false;
					lastExchangeIndex = j;
				}
			}
			sortBorder = lastExchangeIndex;
			if(isSorted) {
				break;
			}
		}
		out.println(Arrays.toString(a));
		out.println(Arrays.toString(b));
		
		System.out.println("����������ѯ�������Ƿ��������У�");
		Scanner reader = new Scanner(in);
		int x = reader.nextInt();
		int start = 0;
		int end = a.length;
		int middle = (start+end)/2;
		int count = 0;
		while(x != a[middle]) {
			if(x > a[middle]){
				start = middle;
			}
			else if(x < a[middle]) {
				end = middle;
			}
			middle = (start+end)/2;
			count++;
			if(count > a.length/2) {
				break;
			}
		}
		if(count > a.length/2) {
			out.print(x + "����������");
		}
		else {
			out.print(x + "�������У����±�Ϊ" + b[middle]);
		}
		reader.close();
	}
	
}
//2020.11.21
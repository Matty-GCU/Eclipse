package chapter2;
import java.util.Scanner;
//ʹ���۰뷨�ж�һ�������Ƿ���һ��������
public class Example2_5 {
	public static void main(String args[]) {
		int start = 0,end,middle;
		int a[] = {12,45,67,898,123,-45,67};
		int N = a.length;
		for(int i=0; i<N; i++) {		//ѡ���������飨��С����
			for(int j=i+1; j<N; j++) {
				if(a[j] < a[i]) {
					int t = a[j];		//��ֵ����
					a[j] = a[i];
					a[i] = t;	
				}
			}
		}
		System.out.println("���������������жϸ������Ƿ���������");
		Scanner reader = new Scanner(System.in);
		int x = reader.nextInt();
		int count = 0;
		end = N;
		middle = (start+end)/2;
		while(x != a[middle]) {		//�ж�x�ڷ�Χ��ǰһ�뻹�Ǻ�һ��
			if(x > a[middle]){		//��С��Χ
				start = middle;
			}
			else if(x < a[middle]) {
				end = middle;
			}
			middle = (start+end)/2;
			count++;
			if(count > N/2) {		//�����Ҳ�����ӦԪ��ʱ����ѭ��
				break;
			}
		//����ѭ���壺Ҫôx == a[middle]��Ҫô count > N/2
		}
		if(count > N/2) {
			System.out.printf("%d����������.\n",x);		//��ʽ�����������д��
		}
		else {
			System.out.printf("%d��������.\n", x);
		}
		//��������N��Ԫ�أ������������������һ��Ԫ�أ������ֻ��N/2�Ρ��԰���ҡ����۰뷨�������ҵ�
		reader.close();
	}
}
//20.10.16
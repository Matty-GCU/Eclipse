package chapter2;
import java.util.Scanner;
//使用折半法判断一个数据是否在一个数组中
public class Example2_5 {
	public static void main(String args[]) {
		int start = 0,end,middle;
		int a[] = {12,45,67,898,123,-45,67};
		int N = a.length;
		for(int i=0; i<N; i++) {		//选择法排序数组（从小到大）
			for(int j=i+1; j<N; j++) {
				if(a[j] < a[i]) {
					int t = a[j];		//数值互换
					a[j] = a[i];
					a[i] = t;	
				}
			}
		}
		System.out.println("输入整数，程序判断该整数是否在数组中");
		Scanner reader = new Scanner(System.in);
		int x = reader.nextInt();
		int count = 0;
		end = N;
		middle = (start+end)/2;
		while(x != a[middle]) {		//判断x在范围的前一半还是后一半
			if(x > a[middle]){		//缩小范围
				start = middle;
			}
			else if(x < a[middle]) {
				end = middle;
			}
			middle = (start+end)/2;
			count++;
			if(count > N/2) {		//避免找不到对应元素时无限循环
				break;
			}
		//结束循环体：要么x == a[middle]，要么 count > N/2
		}
		if(count > N/2) {
			System.out.printf("%d不在数组中.\n",x);		//格式控制输出的新写法
		}
		else {
			System.out.printf("%d在数组中.\n", x);
		}
		//该数组有N个元素，若输入的数等于其中一个元素，则最多只需N/2次“对半查找”（折半法）即可找到
		reader.close();
	}
}
//20.10.16
package chapter3;

public class Example3_7 {
	public static void main(String args[]) {
		int sum=0, j=1, i;
		//计算1+3+5+7+9
		for(i=1; i<=10; i++) {
			if(i%2==0) {
				continue;
			}
			//int sum;
			sum=sum+i;
		}
		System.out.println("sum="+sum);
		//求100以内素数
		for(j=2; j<=100; j++) {			//j从2刷到100
			for(i=2;i<=j/2;i++) {				//i从2刷到j/2
				if(j%i==0) {							//证明为非素数
					break;
				}
			}
			if(i>j/2) {								//排除break结束的情况，只有自然结束上一个循环才会触发本条件
				System.out.println(j+"是素数");
			}
		}
	}
}
//20.10.18
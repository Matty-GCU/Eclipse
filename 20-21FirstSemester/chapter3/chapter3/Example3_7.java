package chapter3;

public class Example3_7 {
	public static void main(String args[]) {
		int sum=0, j=1, i;
		//����1+3+5+7+9
		for(i=1; i<=10; i++) {
			if(i%2==0) {
				continue;
			}
			//int sum;
			sum=sum+i;
		}
		System.out.println("sum="+sum);
		//��100��������
		for(j=2; j<=100; j++) {			//j��2ˢ��100
			for(i=2;i<=j/2;i++) {				//i��2ˢ��j/2
				if(j%i==0) {							//֤��Ϊ������
					break;
				}
			}
			if(i>j/2) {								//�ų�break�����������ֻ����Ȼ������һ��ѭ���Żᴥ��������
				System.out.println(j+"������");
			}
		}
	}
}
//20.10.18
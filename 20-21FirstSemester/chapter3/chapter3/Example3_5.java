package chapter3;
//����8+88+888+...��ǰ12���
//forѭ���������������������
public class Example3_5 {
	public static void main(String args[]) {
		long sum = 0, a = 8, item = a, n = 12, i;
		for(i=1; i<=n;i++) {
	//���ʽ1��2��д��i=0; i<n;����������ͬ
	//���ʽ3��д��++i����������ͬ
			sum = sum + item;
			item = item*10+a;
		}
	}
}
//20.10.17
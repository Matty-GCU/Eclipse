package part17_2;

public class ComputerAver {
	public void giveAver(double[] a) {
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		double aver = sum / a.length;
		System.out.println("ѡ�����÷�" + aver);
	}
	
} 
//20210114
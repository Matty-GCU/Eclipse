package part03;

public class Example7_4 {

	public static void main(String[] args) {
		int n = 0, m = 0, t = 1000;
		try {
			m = Integer.parseInt("8888");
			n = Integer.parseInt("ab88");		//�����쳣��ת��catch
			t = 7777;											//tû�л��ᱻ��ֵ
		}
		catch(NumberFormatException e) {
			System.out.println("�����쳣");
			System.out.println(e.getMessage());
		}
		System.out.println("m="+m+", n="+n+", t="+t);
		try {
			System.out.println("���������׳�I/O�쳣");
			throw new java.io.IOException("���ǹ���ģ�");
			//System.out.println("������û�л���ִ�У�����ע�ͣ�����������");
		}
		catch(java.io.IOException e) {
			System.out.println("�����쳣��");
			System.out.println(e.getMessage());
		}
	}

}

package questionSolved;
//λ���������
public class QS_BitwiseOperation {
	public static void main(String args[]) {
		byte a = 12;		//0 000 1100//12
		byte b = (byte)(~a);	//1 111 0011//-115
							  //��ȡ������1 000 1100//-12		//����1����  1 111 0010//-114
							  //����1����  1 000 1101//-13		//��ȡ������1 000 1101//-13		
		System.out.println(b);
	}
}
//20.10.16
package questionSolved;
//��̬����java.lang(package)��System(class)��out��̬����
import static java.lang.System.out;
import java.util.*;
//���Ұ���ˮ�ɻ�����ҵ
public class LJA_LeapYear {
	public static void main(String[] args) {
		
		Scanner type = new Scanner(System.in);
		//��ʼ�������еľֲ�����x
		int x=0,a,b,c;
		//ʵ�ý���ϸ��
		String line = "========================";
		out.println(line);
		out.println("[��������λ�����鿴�Ƿ�Ϊˮ�ɻ���]");
		
		//����ѭ�����ƣ�ֻ�������ʽ��ȷ���ܴ���break����ѭ��
		while(1==1) {
			//String���ַ����������ͣ������������������е�һ����
			String T = type.next();
			//����ִ�п��ܳ����쳣�Ĵ���
			try {
				//ʹ��Integer���е�parseInt��������String���͵�����ת����int��
				x = Integer.parseInt(T);
				if (x<1000&&x>99) {
					break;
				}
				else {
					out.println(line);
					out.println("[��Χ����,��������λ����]");
				}
				//�����쳣�������쳣�ִ࣬���쳣����
			}
			catch(Exception abc) {
				out.println(line);
				out.println(abc);
				out.println("[����������������λ����]");
			}
		}
		
		/*
		 * �����ʼ������x��ԭ�����£�
		 * ��ǰ���ǳ���ļƴ�����ѭ�����ҵ�ȷ���ִ������룬��ô��try��x���޷�����ֵ
		 * ��int�ͱ���Ĭ�ϳ�ʼֵΪ0�������´������������
		 * ����������Ϊ����λ���֣����ջ��ӡ�����ֲ���ˮ�ɻ���
		 * ����������Ϊ�����֣����ջ��ӡ0����ˮ�ɻ���
		 *
		*/
		a = x/100;
		b = x/10%10;
		c = x%10;
		/*
		 * ������Math.pow(a,b)
		 * ���ã�����a��b����
		 * ������	a:����
		 * 				b:ָ��
		 * �������ͣ�double��
		 * ����ֵ��a��b���ݵ�ֵ
		 */
		double flower1 = Math.pow(a, 3);
		double flower2 = Math.pow(b, 3);
		double flower3 = Math.pow(c, 3);
		int FLOWER = (int)(flower1+flower2+flower3);
		if(x == FLOWER) {
		out.println(x+"��ˮ�ɻ���");
		}
		else {
		out.println(x+"����ˮ�ɻ���");
		}
	}
}
//20.10.18
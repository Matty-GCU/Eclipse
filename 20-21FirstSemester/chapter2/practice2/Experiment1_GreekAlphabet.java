package practice2;
//ʵ��1�����ϣ����ĸ��
public class Experiment1_GreekAlphabet {
	public static void main(String[] args) {
		char cStart = '��',cEnd = '��';
		int start = (int)cStart;
		int end = (int)cEnd;
		System.out.println("ϣ����ĸ'��'��unicode���е�˳��λ�ã�"+start);
		System.out.println("ϣ����ĸ'��'��unicode���е�˳��λ�ã�"+end);
		for(int i = start; i<=end; i++)  {
			char c = (char)i;
			System.out.print("  "+c);
			if((i-start+1)%10==0) {
			System.out.println("  ");
			}
		}
	}
}
//20.10.13
package practice2;
//实验1：输出希腊字母表
public class Experiment1_GreekAlphabet {
	public static void main(String[] args) {
		char cStart = 'α',cEnd = 'ω';
		int start = (int)cStart;
		int end = (int)cEnd;
		System.out.println("希腊字母'α'在unicode表中的顺序位置："+start);
		System.out.println("希腊字母'ω'在unicode表中的顺序位置："+end);
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
package part99;

import static myUtil.Printer.*;

public class ClassRuntimeLearning {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		long free = runtime.freeMemory();
		p("Java��������ÿ����ڴ�"+free+"bytes");
		long total = runtime.totalMemory();
		p("Java����ռ�����ڴ�"+total+"bytes");
		long n1 = System.currentTimeMillis();
		for(int i=1; i<=100; i++) {
			int j = 2;
			for(;j<=i/2;j++) {
				if(i%j==0)	break;
			}
			if(j>i/2) {
				p("  "+i);
			}
		}
		long n2 = System.currentTimeMillis();
		p("ѭ����ʱ"+(n2-n1)+"����");
	}

}

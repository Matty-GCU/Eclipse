package part02;

public class Example6_1 {
	public static void main(String[] args) {
		China zhang = new China();
		Japan henlu = new Japan();
		zhang.number = 32 + Computable.MAX;		//�ýӿ������ʽӿ��еĳ���
		henlu.number = 32 + Computable.MAX;
		System.out.println("zhang��ѧ��" + zhang.number + "zhang��ͽ��" + zhang.f(100));
		System.out.println("henlu��ѧ��" + henlu.number + "henlu��ͽ��" + henlu.f(100));
	}
}
//20210121
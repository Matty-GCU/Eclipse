package chapter5;

public class H1_Example {

	public static void main(String[] args) {
		Teacher mr = new Teacher();
		Student matty = new Student();
		mr.setDepartment("���ʵ����");
		mr.setName("����ʦ");
		mr.setPassword("123456789");
		mr.printAll();
		matty.setDepartment("���������ѧԺ");
		matty.setName("��");
		matty.setPassword("111111111");
		matty.printAll();
	}

}

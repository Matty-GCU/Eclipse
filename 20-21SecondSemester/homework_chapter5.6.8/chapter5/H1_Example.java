package chapter5;

public class H1_Example {

	public static void main(String[] args) {
		Teacher mr = new Teacher();
		Student matty = new Student();
		mr.setDepartment("软件实验室");
		mr.setName("吴老师");
		mr.setPassword("123456789");
		mr.printAll();
		matty.setDepartment("计算机工程学院");
		matty.setName("我");
		matty.setPassword("111111111");
		matty.printAll();
	}

}

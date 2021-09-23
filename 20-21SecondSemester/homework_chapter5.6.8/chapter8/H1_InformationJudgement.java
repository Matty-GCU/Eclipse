package chapter8;

public class H1_InformationJudgement {
	public static void main(String[] args) {
	Student2 student = new Student2("Matty", "202010098037", "15876597212", "CE", "123@qq.com");
	System.out.println(student.isIdLegal());
	System.out.println(student.isPhoneNumberLegal());
	System.out.println(student.isEmailLegal());
	}
}

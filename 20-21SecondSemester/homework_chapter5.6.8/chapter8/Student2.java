package chapter8;

public class Student2 {
	String name, id, phoneNumber, college, email;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setColllege(String college) {
		this.college = college;
	}
	public String getCollege() {
		return college;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public Student2(String name, String id, String phoneNumber, String college, String email) {
		setName(name);
		setId(id);
		setPhoneNumber(phoneNumber);
		setColllege(college);
		setEmail(email);
	}
	public boolean isIdLegal() {
		//要求学号是12位数字，必须以20开头
		return getId().matches("20[0123456789]{10}");
	}
	public boolean isPhoneNumberLegal() {
		//要求电话是11位数字，必须以13或15或16或17或18或19开头
		return getPhoneNumber().matches("1[356789]{1}[0123456789]{9}");
	}
	public boolean isEmailLegal() {
		//要求判断@不是第一个，也不是最后一个字符
		//@后有“."符号，并且@与”."不能直接相邻，"."也不是最后一个字符
		//如"aaa@qq.com"位合法的电子邮箱，“qq@.com"不是合法的电子邮箱
		return getEmail().matches("[^@][\\w]+@[\\w]+[.][\\w]+[^@]");		//终于写出来了！！20210404
//		return !email.contains("@.") && !email.startsWith("@") && !email.endsWith("@"); 
//		return email.indexOf("@")!=0 && email.lastIndexOf("@")!=email.length()-1 && !email.contains("@.");
	}
	public String toString() {
		return getName() + "; " + getId() + "; " + getPhoneNumber() + ";" + getCollege() + "; " + getEmail();
	}
}

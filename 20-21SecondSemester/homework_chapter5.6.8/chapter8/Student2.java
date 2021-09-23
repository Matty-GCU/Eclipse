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
		//Ҫ��ѧ����12λ���֣�������20��ͷ
		return getId().matches("20[0123456789]{10}");
	}
	public boolean isPhoneNumberLegal() {
		//Ҫ��绰��11λ���֣�������13��15��16��17��18��19��ͷ
		return getPhoneNumber().matches("1[356789]{1}[0123456789]{9}");
	}
	public boolean isEmailLegal() {
		//Ҫ���ж�@���ǵ�һ����Ҳ�������һ���ַ�
		//@���С�."���ţ�����@�롱."����ֱ�����ڣ�"."Ҳ�������һ���ַ�
		//��"aaa@qq.com"λ�Ϸ��ĵ������䣬��qq@.com"���ǺϷ��ĵ�������
		return getEmail().matches("[^@][\\w]+@[\\w]+[.][\\w]+[^@]");		//����д�����ˣ���20210404
//		return !email.contains("@.") && !email.startsWith("@") && !email.endsWith("@"); 
//		return email.indexOf("@")!=0 && email.lastIndexOf("@")!=email.length()-1 && !email.contains("@.");
	}
	public String toString() {
		return getName() + "; " + getId() + "; " + getPhoneNumber() + ";" + getCollege() + "; " + getEmail();
	}
}

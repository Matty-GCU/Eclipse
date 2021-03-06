package project002;

//MVC: MODEL
public class User {
	String name;
	String phoneNumber;
	String password;
	public User() {}
	public User(String name, String phoneNumber, String password) {
		setName(name);
		setPhoneNumber(phoneNumber);
		setPassword(password);
	}
	public void checkInfo() {
		System.out.println("查看用户个人信息：\n用户名：" + getName() + "\n电话号码：" + getPhoneNumber());
	}
	public void changePassword(String newPassword) {
		password = newPassword;
	}
	
	//Getters&Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

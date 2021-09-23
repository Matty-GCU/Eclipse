package chapter8;

public class People {
	String name, password, department;
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void printAll() {
		System.out.println("department: " + department);
		System.out.println("name: " + name);
		System.out.println("password: " + password);
	}
}

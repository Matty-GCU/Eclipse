package chapter5;

public class EmployeeEmployee {
	public String name;
	private double salary;
	EmployeeEmployee(){
		name = null;
		salary = 0;
	}
	EmployeeEmployee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public double calSalary(double n) {
		return salary - n;
	}
}

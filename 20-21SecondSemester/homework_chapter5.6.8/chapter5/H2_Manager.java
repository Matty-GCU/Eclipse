package chapter5;

public class H2_Manager extends EmployeeEmployee{
	private String allowance;
	H2_Manager(String name, double salary, String allowance) {
		super(name, salary);
		this.allowance = allowance;
	}
	public double calSalary(double n) {
		return super.calSalary(n) + Double.parseDouble(allowance);
	}
	public static void main(String[] args) {
		EmployeeEmployee e1, e2;
		e1 = new EmployeeEmployee("employee1", 5000);
		e2 = new H2_Manager("employee2", 8000, "1000");
		System.out.println(e1.calSalary(200));
		System.out.println(e2.calSalary(200));
	}

}

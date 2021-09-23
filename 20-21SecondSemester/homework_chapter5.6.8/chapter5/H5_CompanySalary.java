package chapter5;

abstract class Employee {
	public abstract double earnings();
}

class YearWorker extends Employee {
	public double earnings() {
		return 12*8100;
	}
}

class MonthWorker extends Employee {
	public double earnings() {
		return 4*2100;
	}
}

class WeekWorker extends Employee {
	public double earnings() {
		return 7*300;
	}
}

class Company {
	Employee[] employees;
	double salaries = 0;
	Company(Employee[] employees) {
		this.employees = employees;
	}
	public double salariesPay() {
		salaries = 0;
		for(Employee e: employees) {
			salaries += e.earnings();
		}
		return salaries;
	}
}
public class H5_CompanySalary {
	public static void main(String[] args) {
		Employee[] employees = new Employee[29];
		for(int i = 0; i < employees.length; i++) {
			if(i%3 == 0)
				employees[i] = new WeekWorker();
			else if(i%3 == 1)
				employees[i] = new MonthWorker();
			else if(i%3 == 2)
				employees[i] = new YearWorker();
		}
		Company company = new Company(employees);
		System.out.println("公司薪水总额:" + company.salariesPay());
	}
}
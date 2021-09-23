package chapter5;

import chapter8.People;

public class Teacher extends People {
	static final int num = 10, days = 90;
	public void printAll() {
		super.printAll();
		System.out.println("num: " + num);
		System.out.println("days: " + days);
	}
}

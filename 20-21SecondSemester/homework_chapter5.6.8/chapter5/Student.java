package chapter5;

import chapter8.People;

public class Student extends People {
	static final int num = 8, days = 60;
	public void printAll() {
		super.printAll();
		System.out.println("num: " + num);
		System.out.println("days: " + days);
	}
}

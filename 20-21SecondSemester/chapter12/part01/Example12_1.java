package part01;

public class Example12_1 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.start();
		b.start();
		for(int i = 0; i < 21; i++) {
			System.out.println("         " + "Main" + i);
		}
		System.out.println("----------------------");
	}
}

class A extends Thread {
	public void run() {
		for(int i = 0; i < 21; i++) {
			System.out.println("A" + i);
		}
	}
}


class B extends Thread {
	public void run() {
		for(int i = 0; i < 21; i++) {
			System.out.println("   " + "B" + i);
		}
	}
}
package part02;

interface SpeakHello {
	void speak();
}

class HelloMachine {
	public void turnOn(SpeakHello speakHello) {
		speakHello.speak();
	}
}
public class Example7_3 {

	public static void main(String[] args) {
		HelloMachine machine = new HelloMachine();
		machine.turnOn(new SpeakHello() {
						public void speak() {
							System.out.println("Hello. You're welcome!");
						}
					}
				);
		machine.turnOn(new SpeakHello() {
			public void speak() {
				System.out.println("ƒ„∫√£¨ª∂”≠π‚¡Ÿ£°");
						}
					}
				);
	}
	
}

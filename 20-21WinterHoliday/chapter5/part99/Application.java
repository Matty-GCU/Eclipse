package part99;


public class Application {

	public static void main(String[] args) {
		Simulator simulator = new Simulator();
		Dog dog = new Dog();
		simulator.playSound(dog);
		System.out.println(simulator.animal.getName());
		simulator.playSound(new Cat());
		System.out.println(simulator.animal.getName());
	}

}
//20210120
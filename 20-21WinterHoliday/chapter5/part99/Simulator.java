package part99;


public class Simulator {
	AnimalAbstract animal;
	void playSound(AnimalAbstract a) {
		animal = a;
		animal.cry();
	}
}
//20210120
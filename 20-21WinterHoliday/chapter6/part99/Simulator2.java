package part99;

public class Simulator2 {
	AnimalInterface animalInterface;		
	public void playSound(AnimalInterface a) {
		animalInterface = a;
		System.out.print(animalInterface.getAnimalName() + "�Ľ���:");
		animalInterface.cry();
	}
}
//20210121
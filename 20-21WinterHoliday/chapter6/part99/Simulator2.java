package part99;

public class Simulator2 {
	AnimalInterface animalInterface;		
	public void playSound(AnimalInterface a) {
		animalInterface = a;
		System.out.print(animalInterface.getAnimalName() + "µÄ½ÐÉù:");
		animalInterface.cry();
	}
}
//20210121
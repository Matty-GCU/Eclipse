package part07;

import java.util.Random;

public class GetRandomNumber {
	public static int[] get(int max, int amount) {
		int[] result = new int[amount];
		int index = 0;
		Random random = new Random();
		while(index<amount) {
			int randomNumber = random.nextInt(max)+1;
			for(int m: result) {
				if(m==randomNumber)
					continue;
			}
			result[index] = randomNumber;
			index++;
		}
		return result;
	}
}

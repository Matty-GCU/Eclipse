package chapter4;
import java.util.Scanner;
public class H3_Test {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double a = reader.nextInt();
		double b = reader.nextInt();
		H3_Cylinder cylinder = new H3_Cylinder(a, b);
		System.out.println(cylinder.getVolume());
		reader.close();
	}

}
//20201127
package part01;

public class Example8_4 {

	public static void main(String[] args) {
		double sum = 0;
		double item = 0;
		boolean computable = true;
		for(String s: args) {
			try {
				item = Double.parseDouble(s);
				sum += item;
			}
			catch(NumberFormatException e) {
				System.out.println("您输入了非数字字符（串）"+e);
				computable = false;
			}
		}
		if(computable==true) {
			System.out.println(sum);
		}
	}

}

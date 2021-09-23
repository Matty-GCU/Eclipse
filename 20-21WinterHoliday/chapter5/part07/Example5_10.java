package part07;

class Monkey {
	void cry(String s) {
		System.out.println(s);
	}
}
class People extends Monkey {
	void Computer(int a, int b) {
		int c = a*b;
		System.out.println(c);
	}
	void cry(String s) {
		System.out.println("***" + s + "***");
	}
}
public class Example5_10 {

	public static void main(String[] args) {
		Monkey monkey;
		People geng = new People();
		monkey = geng;		//monkey是People对象geng的上转型对象
		//错误：geng = monkey;
		monkey.cry("Ahhhh");		//等价于geng.cry("Ahhhh");
		//错误：monkey.computer(10, 11);
		People people = (People)monkey;
		people.Computer(10, 11);
	}

}

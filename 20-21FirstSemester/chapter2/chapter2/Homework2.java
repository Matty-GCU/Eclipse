package chapter2;
//�������Լ������������
public class Homework2 {
	public static void main(String[] args) {
		int x = 5,y = 6,z;
		z = ++x + y++;	//6+6=12
		System.out.println("x="+x+",y="+y+",z="+z);
		x = ++x + x++;	//7+7=14
		System.out.println("x="+x+",y="+y+",z="+z);
		z = ++x + x++;	//15+15=30
		System.out.println("x="+x+",y="+y+",z="+z);
	}
}
//20.10.13
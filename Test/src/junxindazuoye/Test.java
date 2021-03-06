package junxindazuoye;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Set A=new Set("{2,3,4,6,8,24}");
		Relation R1=new Relation("((2,2),(3,3),(4,4),(6,6),(8,8),(24,24))");
		Relation R2=new Relation("((2,2),(3,3),(4,8),(8,4),(8,24),(24,24))");
		Relation R3=new Relation("((2,2),(3,3),(4,4),(6,6),(8,8),(24,24),(2,4),(4,2),(2,8),(8,2),(4,8),(8,4),(3,6),(6,3))");
		Relation R4=new Relation("((2,2),(3,3),(4,4),(6,6),(8,8),(24,24),(2,4),(2,6),(2,8),(2,24),(3,6),(3,24),(4,8),(4,24),(6,24),(8,24))");
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入0终止,输入1判定关系的重要性质及闭包,输入2判定等价类,输入3判定偏序关系及其极值与最值");
		int i=scanner.nextInt();
		while(i!=0){
			switch(i){
			case 1:
				System.out.println("自反性"+R1.Zifan()+",反自反性"+R1.FanZifan()+",自反闭包"+R1.ZifanBibao());
				System.out.println("对称性"+R1.Duichen()+",反对称性"+R1.FanDuichen()+",对称闭包"+R1.DuichenBibao());
				System.out.println("传递性"+R1.Chuandi()+"传递闭包"+R1.ChuandiBibao());
				break;
			case 2:
				System.out.println("等价类"+A.Dengjialei(R3,"8"));
				break;
			case 3:
				System.out.println("偏序关系"+R4.Pianxu());
				System.out.println("极值:"+A.Jizhi(R4));
				System.out.println("最值:"+A.Zuizhi(R4));
				break;
			default: System.out.println("请输入正确数字");
			}
			i=scanner.nextInt();
		}
		System.out.println("已终止");
	}
}
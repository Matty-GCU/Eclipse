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
		System.out.println("����0��ֹ,����1�ж���ϵ����Ҫ���ʼ��հ�,����2�ж��ȼ���,����3�ж�ƫ���ϵ���伫ֵ����ֵ");
		int i=scanner.nextInt();
		while(i!=0){
			switch(i){
			case 1:
				System.out.println("�Է���"+R1.Zifan()+",���Է���"+R1.FanZifan()+",�Է��հ�"+R1.ZifanBibao());
				System.out.println("�Գ���"+R1.Duichen()+",���Գ���"+R1.FanDuichen()+",�ԳƱհ�"+R1.DuichenBibao());
				System.out.println("������"+R1.Chuandi()+"���ݱհ�"+R1.ChuandiBibao());
				break;
			case 2:
				System.out.println("�ȼ���"+A.Dengjialei(R3,"8"));
				break;
			case 3:
				System.out.println("ƫ���ϵ"+R4.Pianxu());
				System.out.println("��ֵ:"+A.Jizhi(R4));
				System.out.println("��ֵ:"+A.Zuizhi(R4));
				break;
			default: System.out.println("��������ȷ����");
			}
			i=scanner.nextInt();
		}
		System.out.println("����ֹ");
	}
}
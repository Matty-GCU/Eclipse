package part15_3;

class A {
    private static int numA;
    private int numA2;
    
    static {
        System.out.println("A�ľ�̬�ֶ� : " + numA);
        System.out.println("A�ľ�̬�����");
    }
    
    {
        System.out.println("A�ĳ�Ա����  : " + numA2);
        System.out.println("A�ķǾ�̬�����");
    }
 
    public A() {
        System.out.println("A�Ĺ�����");
    }
}
 
class B extends A {
    private static int numB;
    private int numB2;
 
    static {
        System.out.println("B�ľ�̬�ֶ� : " + numB);
        System.out.println("B�ľ�̬�����");
    }
    
    {
        System.out.println("B�ĳ�Ա���� : " + numB2);
        System.out.println("B�ķǾ�̬�����");
    }
 
    public B() {
        System.out.println("B�Ĺ�����");
    }
}
 
public class Box {
    public static void main(String[] args) {
        A ab;
        System.out.println("---");
        ab = new B();
        System.out.println("---");
        ab = new B();
    }
}

package part05;

public class Example7_7 {

	public static void main(String[] args) {
		CargoBoat boat = new CargoBoat();
		boat.setMaxContent(5000);
		int m = 600;
		try {
			boat.loading(m);
			m = 1504;
			boat.loading(m);
			m = 3548;
			boat.loading(m);
			m = 944;
			boat.loading(m);
		}
		catch(DangerException e) {
			System.out.println(e.warnMess());
			System.out.println("�޷���װ��������"+m+"�ļ�װ��");
		}
		finally {
			
			System.out.println("��������������");
		}
	}

}

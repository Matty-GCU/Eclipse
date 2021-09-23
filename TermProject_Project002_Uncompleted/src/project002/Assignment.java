package project002;

//MVC: MODEL
public class Assignment {
	String message;		//��������
	String time;		//ʱ����Ϣ
	String place;		//�ص���Ϣ
	String note;		//����ע
	public Assignment() {}
	public Assignment(String message, String time, String palce) {
		setMessage(message);
		setTime(time);
		setPlace(palce);
	}
	public Assignment(String message, String time, String palce, String note) {
		setMessage(message);
		setTime(time);
		setPlace(palce);
		setNote(note);
	}
	public void checkInfo() {
		System.out.println("================");
		System.out.println("�鿴�������飺");
		System.out.println("�������ƣ�" + getMessage());
		System.out.println("ʱ����Ϣ��" + getTime());
		System.out.println("�ص���Ϣ" + getPlace());
		System.out.print("����ע��");
		System.out.println(getNote()==null ? "����" : getNote());
	}
	//Getters&Setters
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}

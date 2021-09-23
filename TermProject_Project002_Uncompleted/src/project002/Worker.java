package project002;

//MVC: MODEL
public class Worker extends User {
	Assignment assignmentTaken;		//���ֵ�����
	int grade;						//��������
	String progress;				//�������
	//������ȳ���
	static final String PREPARING = "׼����";
	static final String COMING = "������";
	static final String ARRIVED = "�ѵ���";
	static final String STARTED = "�ѿ�ʼ";
	static final String ACCOMPLISHED = "�����";
	public Worker() {}
	public Worker(String name, String phoneNumber, String password) {
		super(name, phoneNumber, password);
		setProgress(PREPARING);
	}
	public Worker(String name, String phoneNumber, String password, Assignment assignmentTaken) {
		super(name, phoneNumber, password);
		setAssignmentTaken(assignmentTaken);
 	}
	@Override
	public void checkInfo() {
		super.checkInfo();
		System.out.print("���֣�");
		System.out.println(getGrade()==0 ? "����" : getGrade());
	}
	public void checkAssignmentTaken() {
		System.out.println("================");
		System.out.println("�鿴�����������飺");
		if(assignmentTaken == null) {
			System.out.println("�޽�������");
			return;
		}
		Assignment a = getAssignmentTaken();
		System.out.println("�������ƣ�" + a.getMessage());
		System.out.println("ʱ����Ϣ��" + a.getTime());
		System.out.println("�ص���Ϣ" + a.getPlace());
		System.out.print("����ע��");
		System.out.println(a.getNote()==null ? "����" : a.getNote());
	}
	public void addAssignment(Assignment assignment) {
		assignmentTaken = assignment;
	}
	public void showaAssignmentProgress() {
		if(assignmentTaken == null) {
			System.out.println("�޽�������");
			return;
		}
		System.out.println(getProgress());
		
	}
	
	//Getters&Setters
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Assignment getAssignmentTaken() {
		return assignmentTaken;
	}
	public void setAssignmentTaken(Assignment assignmentTaken) {
		this.assignmentTaken = assignmentTaken;
	}
	public String getProgress() {
		return progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}
	
}

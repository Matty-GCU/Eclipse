package project002;

public class Test {
	//��Ŀ001���Դ�github��
	//��GITHUB
	//�汾1������̨����
	public static void main(String[] args) {
		Client wu = new Client("Mr. Wu", "13417143272", "123");
		wu.checkInfo();
		wu.changePassword("122");
		Butler jarvis = new Butler("Jarvis", "13415178252", "JJJJJJJavis");
		jarvis.checkInfo();
		wu.addButler(jarvis);
		Assignment cleaning = new Assignment("��ɨ��", "��ǰ���������", "��������");
		cleaning.checkInfo();
		wu.changeAssignmentTime(cleaning, "��ǰ����֮�����");
		wu.addAssignmentNote(cleaning, "��������������Ҫ�ص��ɨ");
		cleaning.checkInfo();
		wu.releaseAssignment(cleaning);
		Cleaner li = new Cleaner("Uncle Li", "11122223333", "234");
		li.checkInfo();
		li.checkAssignmentTaken();
		jarvis.assign(li);
		li.checkAssignmentTaken();
		li.setProgress(Worker.ACCOMPLISHED);
		wu.isAssignmentCompleted();
		wu.evaluate(3);
		li.checkInfo();
	}
}

package part03;

public class BankException extends Exception {
	String message;
	public BankException(int m, int n) {		//constructor
		message = "�����ʽ�"+m+"�Ǹ�����֧���ʽ�"+n+"��������������ϵͳҪ��";
	}
	public String warnMess() {
		return message;
	}
}

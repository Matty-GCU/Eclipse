package project002;

public class Cleaner extends Worker {
	public Cleaner() {}
	public Cleaner(String name, String phoneNumber, String password) {
		super(name, phoneNumber, password);
	}
	public Cleaner(String name, String phoneNumber, String password, Assignment assignmentTaken) {
		super(name, phoneNumber, password, assignmentTaken);
	}
}

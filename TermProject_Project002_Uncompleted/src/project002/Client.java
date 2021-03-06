package project002;

//MVC: MODEL
public class Client extends User {
	Butler butler;
	public Client(String name, String phoneNumber, String password) {
		super(name, phoneNumber, password);
	}
	public Client(String name, String phoneNumber, String password, Butler butler) {
		super(name, phoneNumber, password);
		setButler(butler);
	}
	public void addButler(Butler butler) {
		setButler(butler);
	}
	public void releaseAssignment(Assignment assignment) {
		butler.setAssignmentsReleased(assignment);
	}
	public void releaseAssignment(String message, String time, String place) {
		butler.setAssignmentsReleased(new Assignment(message, time, place));
	}
	public void releaseAssignment(String message, String time, String place, String note) {
		butler.setAssignmentsReleased(new Assignment(message, time, place, note));
	}
	public void changeAssignmentTime(Assignment assignment, String time) {
		assignment.setTime(time);
	}
	public void addAssignmentNote(Assignment assignment, String note) {
		assignment.setNote(note);
	}
	public void isAssignmentCompleted() {
		butler.checkProgress();
	}
	public void evaluate(int grade) {
		butler.evaluteWorker(grade);
	}
	
	//Getters&Setters
	public Butler getButler() {
		return butler;
	}
	public void setButler(Butler butler) {
		this.butler = butler;
	}
}

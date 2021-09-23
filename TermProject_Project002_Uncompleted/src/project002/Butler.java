package project002;

//MVC: MODEL
public class Butler extends User {
	Assignment assignmentsReleased;
	Worker worker;
	public Butler() {}
	public Butler(String name, String phoneNumber, String password) {
		super(name, phoneNumber, password);
	}
	public Assignment getAssignmentsReleased() {
		return assignmentsReleased;
	}
	public void setAssignmentsReleased(Assignment assignmentsReleased) {
		this.assignmentsReleased = assignmentsReleased;
	}
	public void assign(Worker worker) {
		this.worker = worker;
		worker.addAssignment(assignmentsReleased);
	}
	public void checkProgress() {
		System.out.println("================");
		if(worker.getProgress() == Worker.ACCOMPLISHED) {
			System.out.println("任务" + worker.getProgress());
		}
		else {
			System.out.println("任务进度" + worker.getProgress());
		}
	}
	public void evaluteWorker(int grade) {
		worker.setGrade(grade);
	}
}

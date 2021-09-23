package project002;

//MVC: MODEL
public class Worker extends User {
	Assignment assignmentTaken;		//接手的任务
	int grade;						//工人评分
	String progress;				//任务进度
	//任务进度常量
	static final String PREPARING = "准备中";
	static final String COMING = "赶来中";
	static final String ARRIVED = "已到达";
	static final String STARTED = "已开始";
	static final String ACCOMPLISHED = "已完成";
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
		System.out.print("评分：");
		System.out.println(getGrade()==0 ? "暂无" : getGrade());
	}
	public void checkAssignmentTaken() {
		System.out.println("================");
		System.out.println("查看接手任务详情：");
		if(assignmentTaken == null) {
			System.out.println("无接手任务");
			return;
		}
		Assignment a = getAssignmentTaken();
		System.out.println("任务名称：" + a.getMessage());
		System.out.println("时间信息：" + a.getTime());
		System.out.println("地点信息" + a.getPlace());
		System.out.print("任务备注：");
		System.out.println(a.getNote()==null ? "暂无" : a.getNote());
	}
	public void addAssignment(Assignment assignment) {
		assignmentTaken = assignment;
	}
	public void showaAssignmentProgress() {
		if(assignmentTaken == null) {
			System.out.println("无接手任务");
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

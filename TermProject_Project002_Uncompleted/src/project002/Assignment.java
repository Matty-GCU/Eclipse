package project002;

//MVC: MODEL
public class Assignment {
	String message;		//任务名称
	String time;		//时间信息
	String place;		//地点信息
	String note;		//任务备注
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
		System.out.println("查看任务详情：");
		System.out.println("任务名称：" + getMessage());
		System.out.println("时间信息：" + getTime());
		System.out.println("地点信息" + getPlace());
		System.out.print("任务备注：");
		System.out.println(getNote()==null ? "暂无" : getNote());
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

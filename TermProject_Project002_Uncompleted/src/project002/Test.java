package project002;

public class Test {
	//项目001可以传github了
	//传GITHUB
	//版本1：控制台交互
	public static void main(String[] args) {
		Client wu = new Client("Mr. Wu", "13417143272", "123");
		wu.checkInfo();
		wu.changePassword("122");
		Butler jarvis = new Butler("Jarvis", "13415178252", "JJJJJJJavis");
		jarvis.checkInfo();
		wu.addButler(jarvis);
		Assignment cleaning = new Assignment("大扫除", "年前三天内完成", "整栋别墅");
		cleaning.checkInfo();
		wu.changeAssignmentTime(cleaning, "年前两天之内完成");
		wu.addAssignmentNote(cleaning, "厨房和卫生间需要重点打扫");
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

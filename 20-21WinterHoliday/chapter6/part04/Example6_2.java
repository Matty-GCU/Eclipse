package part04;

interface ShowMessage {
	void showMess(String s);		//显示商标
}

class TV implements ShowMessage {
	public void showMess(String s) {
		System.out.println(s);
	}
}

class PC implements ShowMessage {
	public void showMess(String s) {
		System.out.println(s);
	}
}

public class Example6_2 {

	public static void main(String[] args) {
		ShowMessage sm;								//声明接口变量
		sm = new TV();									//接口变量存放对象的引用
		sm.showMess("暴风影音电视机");		//接口回调
		sm = new PC();
		sm.showMess("炫龙电脑");
	}

}
//20210121
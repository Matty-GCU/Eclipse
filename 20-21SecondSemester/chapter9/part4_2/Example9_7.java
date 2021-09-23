package part4_2;

public class Example9_7 {

	public static void main(String[] args) {
		WindowActionEventSourceTwo win = new WindowActionEventSourceTwo();
		PoliceListener listener = new PoliceListener();
		win.setCommandListener(listener);
		win.setBounds(100, 100, 600, 600);
		win.setTitle("处理ActionEvent事件");
	}

}

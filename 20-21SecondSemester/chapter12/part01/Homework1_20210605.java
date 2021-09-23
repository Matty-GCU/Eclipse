package part01;

public class Homework1_20210605 {

	public static void main(String[] args) {
		Thread myThread = new Thread(new MyThread());
		myThread.start();
	}

}

class MyThread implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("Running!");
			try {
				Thread.sleep((long)3000);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
}
package part05;

public class CargoBoat {
	int realContent;
	int maxContent;
	public void setMaxContent(int max) {
		maxContent = max;
	}
	public void loading(int m) throws DangerException {
		realContent += m;
		if(realContent > maxContent) {
			realContent -= m;
			throw new DangerException();
		}
		System.out.println("目前装载了" + realContent + "吨货物");
	}
		

}

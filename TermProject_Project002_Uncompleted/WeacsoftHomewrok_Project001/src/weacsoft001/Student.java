package weacsoft001;

import static myUtil.Printer.*;

public class Student {
	String id, name;
	String otherInfo = "нч";
	
	public Student(String idOrName) {
		if(idOrName.length() == 12) {
			id = idOrName;
		}
		else if(idOrName.length() <= 4) {
			name = idOrName;
		}
	}
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public void showMessage() {
		p("ID: " + id + "; Name: " + name + "; OtherInfo: " + otherInfo);
	}
	
}

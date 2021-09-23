package chapter4;

public class H7_Student {
	String ID, name, majoy; 
	H7_Student(String str1, String str2) {
		ID = str1;
		name = str2;
	}
	H7_Student(String str1, String str2, String str3) {
		ID = str1;
		name = str2;
		majoy = str3;
	}
	boolean search(String str1) {
		if(str1.equals(name)) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean search(String str1, String str2) {
		if(str1.equals(name) && str2.equals(majoy)) {
			return true;
		}
		else {
			return false;
		}
	}
}
//20201209
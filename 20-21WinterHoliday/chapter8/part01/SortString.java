package part01;

public class SortString {
	public static void sort(String[] s) {		//��С��������
		for(int i=0; i<s.length-1; i++) {
			for(int j=i+1; j<s.length; j++) {
				if(s[i].compareTo(s[j]) > 0) {
					String tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
				}
			}
		}
	}
}

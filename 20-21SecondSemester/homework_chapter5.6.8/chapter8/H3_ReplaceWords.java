package chapter8;

public class H3_ReplaceWords {
	String[] sensitiveWords = {"���ֹ�", "����������̳", "������ǹ"};
	
	public static void main(String[] args) {
		H3_ReplaceWords homework = new H3_ReplaceWords();
		String str = "��ʾҪ����������дʣ��硰���ֹ�����������������̳������������ǹ����";
		System.out.println(homework.check(str));
	}
	
	public String check(String str) {
		for(String word: sensitiveWords) {
			if(str.contains(word)) {
				str = str.replaceAll(word, "****");
			}
		}
		return str;
	}
}

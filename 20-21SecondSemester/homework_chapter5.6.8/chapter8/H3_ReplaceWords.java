package chapter8;

public class H3_ReplaceWords {
	String[] sensitiveWords = {"法轮功", "自由民主论坛", "自制手枪"};
	
	public static void main(String[] args) {
		H3_ReplaceWords homework = new H3_ReplaceWords();
		String str = "表示要被处理的敏感词，如“法轮功”，“自由民主论坛”，“自制手枪”等";
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

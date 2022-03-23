package test01;
import java.util.*;

public class LC720 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] words = new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"};
		System.out.println(solution.longestWord(words));
	}

}

class Solution {
    public String longestWord(String[] words) {
        //默认的排序是，依次比较两个字符串的同下标的字符，遇到不一样的，就决定字符串的大小，并不会先考虑长度的事情。
        //而我们要的是，优先考虑长度，再看
        Arrays.sort(words, (o1, o2) -> o1.length() != o2.length() ? o1.length() - o2.length(): o2.compareTo(o1));
        System.out.println(Arrays.toString(words));
        String ans = "";
        //保存所有前缀
        Set<String> hashSet = new HashSet<>();
        //遍历所有字符串
        for(String word: words) {
            int len = word.length();
            //若word的长度比ans的长，那么word只要合法，它就是新的ans
            if(len > ans.length()) {
                //检查该字符串是否合法（它的少一位的前缀存在，并且这个前缀的少一位的前缀也存在）
                boolean hasPrefix = true;
                //注意substring(startIndex, endIndex)取的子串是[startIndex, endIndex)，所以i从1到len-1没问题
                for(int i = 1; i < len; i++) {
                    if(! hashSet.contains(word.substring(0, i))) {
                        hasPrefix = false;
                        break;
                    }
                }
                if(hasPrefix) {
                    ans = word;
                }
                hashSet.add(word);
            }
            //由于排序时会把两个长度相同的字符串中的ascii值较小的那个排在前面
            //所以若word的长度等于ans，那么不管它合不合法，都不可能更新ans
            //else if(len == ans.length()) {}
            //若word的长度小于ans，那么不管它合不合法，都不可能更新ans
            //else {}
        }
        return ans;
    }
}

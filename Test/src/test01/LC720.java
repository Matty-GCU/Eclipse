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
        //Ĭ�ϵ������ǣ����αȽ������ַ�����ͬ�±���ַ���������һ���ģ��;����ַ����Ĵ�С���������ȿ��ǳ��ȵ����顣
        //������Ҫ���ǣ����ȿ��ǳ��ȣ��ٿ�
        Arrays.sort(words, (o1, o2) -> o1.length() != o2.length() ? o1.length() - o2.length(): o2.compareTo(o1));
        System.out.println(Arrays.toString(words));
        String ans = "";
        //��������ǰ׺
        Set<String> hashSet = new HashSet<>();
        //���������ַ���
        for(String word: words) {
            int len = word.length();
            //��word�ĳ��ȱ�ans�ĳ�����ôwordֻҪ�Ϸ����������µ�ans
            if(len > ans.length()) {
                //�����ַ����Ƿ�Ϸ���������һλ��ǰ׺���ڣ��������ǰ׺����һλ��ǰ׺Ҳ���ڣ�
                boolean hasPrefix = true;
                //ע��substring(startIndex, endIndex)ȡ���Ӵ���[startIndex, endIndex)������i��1��len-1û����
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
            //��������ʱ�������������ͬ���ַ����е�asciiֵ��С���Ǹ�����ǰ��
            //������word�ĳ��ȵ���ans����ô�������ϲ��Ϸ����������ܸ���ans
            //else if(len == ans.length()) {}
            //��word�ĳ���С��ans����ô�������ϲ��Ϸ����������ܸ���ans
            //else {}
        }
        return ans;
    }
}

package leetCodeString;

import java.util.ArrayList;
import java.util.List;
/*
给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。键盘如下图所示。

美式键盘 中：

第一行由字符 "qwertyuiop" 组成。
第二行由字符 "asdfghjkl" 组成。
第三行由字符 "zxcvbnm" 组成。

示例 1：

输入：words = ["Hello","Alaska","Dad","Peace"]
输出：["Alaska","Dad"]
示例 2：

输入：words = ["omk"]
输出：[]
示例 3：

输入：words = ["adsdf","sfd"]
输出：["adsdf","sfd"]

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/keyboard-row
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindWords {
    public String[] findWords(String[] words) {
        if(words.length==0) return words;
        List<String> res = new ArrayList<>();
        
        String s = "12210111011122000010020202";

        for(int i=0;i<words.length;i++){
            int temp = words[i].toLowerCase().charAt(0)-'a';
            char ctemp = s.charAt(temp);
            int j=0;
            for(j=0;j<words[i].length();j++){
                int index = words[i].toLowerCase().charAt(j)-'a';
                char stemp = s.charAt(index);
                if(stemp==ctemp) continue;
                else break;
            }
            if(j==words[i].length()) res.add(words[i]);
        }

        String[] ans = new String[res.size()];
        for(int i = 0; i<res.size();i++){
            ans[i] = res.get(i);
        }

        
        return ans;
    }
    public static void main(String[] args) {
        String[] words = {"adsdf","sfd"};
        FindWords res = new FindWords();
        System.out.println(res.findWords(words));
    }
}

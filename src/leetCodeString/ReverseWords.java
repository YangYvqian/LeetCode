package leetCodeString;
/*
给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

示例 1：

输入：s = "Let's take LeetCode contest"
输出："s'teL ekat edoCteeL tsetnoc"
示例 2:

输入： s = "God Ding"
输出："doG gniD"

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/reverse-words-in-a-string-iii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] strs = s.split(" ");
        for(int i=0;i<strs.length;i++){
            res.append(reverse(strs[i]));
            res.append(" ");
        }
        return res.substring(0,res.length()-1).toString();
    }
    public String reverse(String s){
        StringBuilder str = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            str.append(s.charAt(i));
        }
        return str.toString();
    }
    
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        ReverseWords res = new ReverseWords();
        System.out.println(res.reverseWords(s));
    }
}

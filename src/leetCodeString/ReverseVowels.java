package leetCodeString;
/*
给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。

元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现。

 

示例 1：

输入：s = "hello"
输出："holle"
示例 2：

输入：s = "leetcode"
输出："leotcede"

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/reverse-vowels-of-a-string
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class ReverseVowels {
    public String reverseVowels(String s) {
        if(s.length()<2) return s;
        char[] charArray = s.toCharArray();
        String c = "aeiouAEIOU";
        
        
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(!(c.indexOf(charArray[left])>=0)) left++;
            if(!(c.indexOf(charArray[right])>=0)) right--;
            if(c.indexOf(charArray[left])>=0 && c.indexOf(charArray[right])>=0){
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }


        }

        return new String(charArray);
    }
    public static void main(String[] args) {
        String s = "a.b,.";
        ReverseVowels r = new ReverseVowels();
        System.out.println(r.reverseVowels(s));
    }
    
}

package leetCodeString;

import java.util.HashMap;
import java.util.Map;

/*
给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。

示例 1:
输入: s = "anagram", t = "nagaram"
输出: true
示例 2:
输入: s = "rat", t = "car"
输出: false

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/valid-anagram
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() > t.length()){
            return false;
        }

        Map<Character,Integer> table = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            table.put(s.charAt(i), table.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i = 0; i<t.length();i++){
            if(!table.containsKey(t.charAt(i))){
                return false;
            }else{
                if(table.get(t.charAt(i))<=0){
                    return false;
                }else{
                    table.put(t.charAt(i), table.get(t.charAt(i))-1);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "aacc";
        String t = "ccac";
        IsAnagram res = new IsAnagram();
        System.out.println(res.isAnagram(s, t));
    }
    
}

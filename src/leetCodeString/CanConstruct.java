package leetCodeString;

import java.util.HashMap;
import java.util.Map;

/*
给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。

如果可以，返回 true ；否则返回 false 。

magazine 中的每个字符只能在 ransomNote 中使用一次。

 

示例 1：

输入：ransomNote = "a", magazine = "b"
输出：false
示例 2：

输入：ransomNote = "aa", magazine = "ab"
输出：false
示例 3：

输入：ransomNote = "aa", magazine = "aab"
输出：true

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/ransom-note
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

*/


public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        
        Map<Character,Integer> table = new HashMap<>();
        for(int i = 0; i<magazine.length();i++){
            table.put(magazine.charAt(i), table.getOrDefault(magazine.charAt(i), 1)+1);
        }

        for(int i = 0; i<ransomNote.length();i++){
            if(!table.containsKey(ransomNote.charAt(i)) || table.get(ransomNote.charAt(i))<=0) return false;
            if(table.containsKey(ransomNote.charAt(i)) && table.get(ransomNote.charAt(i))>0){
                table.put(ransomNote.charAt(i), table.get(ransomNote.charAt(i))-1);
            }
        }

        return true;

    }
    
}

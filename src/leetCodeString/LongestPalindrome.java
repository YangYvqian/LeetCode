package leetCodeString;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        if(map.size()==1) return s.length();
        int count = 0;
        int ans = 0;
        for (Character k : map.keySet()) {
            if(map.get(k)== 1) ans = 1;
            if(map.get(k)>1) count += map.get(k)/2 * 2;
            
        }

        return count+ans;
    }
}

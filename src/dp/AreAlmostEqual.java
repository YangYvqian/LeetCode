package dp;
import java.util.*;

public class AreAlmostEqual {

    public boolean areAlmostEqual(String s1, String s2) {


        // 字符串为空，返回false
        if(s1.length()==0 || s2.length()==0) return false;
        
        // 两个字符串长度不相等返回false
        if(s1.length()!=s2.length()) return false;
        List<Integer> diff = new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                diff.add(i);
                
            }

            
        }

        if(diff.isEmpty()) return true;
        if(diff.size()>2) return false;

        return s1.charAt(diff.get(0))==s2.charAt(diff.get(1))&&s1.charAt(diff.get(1))==s2.charAt(diff.get(0));
    }

    public static void main(String[] args) {
        String s1 = "kelb";
        String s2 = "kelb";

        // 字符串为空

        // 可以交换一次的字符串

        // false 的字符串
        AreAlmostEqual res = new AreAlmostEqual();
        System.out.println(res.areAlmostEqual(s1, s2));
    }
    
}

package leetCodeString;



public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        
        int sLen = s.length();
        int tLen = t.length();

        int i = 0;
        int j = 0;
        while(i < sLen && j < tLen){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }

        if(i==sLen) return true;
        else return false;

        
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        IsSubsequence res = new IsSubsequence();
        System.out.println(res.isSubsequence(s, t));
    }
}

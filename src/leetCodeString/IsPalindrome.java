package leetCodeString;

public class IsPalindrome {

    public boolean isPalindrome(String s) {
        String strs = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<strs.length();i++){
            int c = strs.charAt(i)-0;
            if((c >= 65 && c <= 122) || c >= 48 && c <= 57){
                str.append(strs.charAt(i));
            }
        }

        int left = 0;
        int right = str.length()-1;
        char[] res = str.toString().toCharArray();

        while(left<right){
            if(res[left] == res[right]){
                left++;
                right--;
            }else{
                return false;
            }
        }
        
        
        return true;
    }

    public static void main(String[] args) {


        String s = "ab_a";
        IsPalindrome p = new IsPalindrome();
        System.out.println(p.isPalindrome(s));
        
    }

    
}

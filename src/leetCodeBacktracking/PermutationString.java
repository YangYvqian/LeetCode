package leetCodeBacktracking;

public class PermutationString {
    public String[] permutation(String S) {
        String[] result = new String[]{};
        char a =S.charAt(0);
        System.out.println(a);
        dfs(S,0,result);
  
        
        return result;
    }

    public void dfs(String s,int i,String[] result){
        if(i == s.length()){
            StringBuilder str = new StringBuilder();
            for(int j=0;j<s.length();j++){
                str.append(s.charAt(j));
            }
            
        }
    }

    public static void main(String[] args) {
        String S = "qwe";
        PermutationString p = new PermutationString();
        p.permutation(S);
    }
    
}

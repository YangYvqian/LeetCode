package leetCodeString;

public class CountSegments {
    public int countSegments(String s) {
        if(s.length()==0) return 0;
        String[] a = s.split(" ");
        
        int count=0;
        for (String str : a) {
            if(str!=""){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "Hello, my name is John";
        CountSegments res = new CountSegments();
        System.out.println(res.countSegments(s));
    }
    
}

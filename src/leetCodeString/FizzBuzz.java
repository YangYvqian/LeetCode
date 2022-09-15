package leetCodeString;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        boolean  tem =false;
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                res.add("FizzBuzz");
            }else if(i%3==0&&i%5!=0){
                res.add("Fizz");
            }else if(i%5==0&&i%3!=0){
                res.add("Buzz");
            }else{
                res.add(Integer.toString(i));
            }

            
            
        }
        return res;

    }
    public static void main(String[] args) {
        FizzBuzz res = new FizzBuzz();
        System.out.println(res.fizzBuzz(6));
    }
}

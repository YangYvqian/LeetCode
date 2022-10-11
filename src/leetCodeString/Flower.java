package leetCodeString;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Flower {
    public List<Integer> getnums(int nums, List<Integer> res ){
        
        
        int num = nums;
        
        int sum = 0;
        int len = Integer.toString(num).length();
        while(num > 0){
            if(num/(Math.pow(10, len-1))!=0){
                
                int ans = (int) (num/(Math.pow(10, len-1)));
                num = (int) (num%(Math.pow(10, len-1)));
                sum += ans*ans*ans;
                len--;
            }else{
                len--;
            }  
        }
        if(sum == nums){
            res.add(nums);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Flower flower = new Flower();
        List<Integer> res = new ArrayList<>();
      while(sc.hasNext()){
        int left = sc.nextInt();
        int right = sc.nextInt();
        for(int i=left;i<=right;i++){
            flower.getnums(i, res);
        }
        if(res.size()==0) System.out.println("no");
        int j = res.size()-1;
        for(int i=0;i<res.size();i++){
          System.out.print(res.get(i));
          if(i<j){
            System.out.print(" ");
          }else{
            System.out.println();
          }
          
        }
        res.clear();
      }
        
        
        
        
    }
}

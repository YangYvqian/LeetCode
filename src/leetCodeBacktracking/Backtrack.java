package leetCodeBacktracking;

import java.util.LinkedList;
import java.util.List;

public class Backtrack {

    public List<List<Integer>> backtrack(int[] nums){


        List<List<Integer>> result = new LinkedList<>();
        dfs(nums,0,new LinkedList<>(),result);

        return result;

    }
    public void dfs(int[] nums, int i, LinkedList<Integer> sub, List<List<Integer>> result){
        if(i == nums.length){
            result.add(new LinkedList<>(sub));
        }else if(i<nums.length){
            
             for(int j=i;j<nums.length;j++){
                
                sub.add(nums[i]);
                dfs(nums, j+1, sub, result);
                sub.removeLast();
            }
        }

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Backtrack b = new Backtrack();
        List<List<Integer>> res = b.backtrack(nums);
        System.out.println(res);
    }
    
}

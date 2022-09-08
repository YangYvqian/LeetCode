package leetCodeBacktracking;

import java.util.*;
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        dfs(nums,0,result);
        return result;
    }

    public void dfs(int[] nums,int i,List<List<Integer>> result){
        if(i == nums.length){
            List<Integer> permutation = new LinkedList<>();
            for(int num:nums){
                
                permutation.add(num);
            }
            result.add(permutation);
        }else{
            for(int j=i;j<nums.length;j++){
                swap(nums, i, j);
                dfs(nums, i+1, result);
                swap(nums, i, j);
            }
        }
    }

    public int[] swap(int[] nums,int i,int j){
        int temp = 0;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Permute res = new Permute();

        System.out.println(res.permute(nums));

    }
    
}

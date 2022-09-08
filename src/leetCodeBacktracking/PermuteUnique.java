package leetCodeBacktracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
    给定一个可包含重复数字的整数集合 nums ，按任意顺序 返回它所有不重复的全排列。
    示例 1：
    输入：nums = [1,1,2]
    输出：
    [[1,1,2],[1,2,1],[2,1,1]]
    示例 2：
    输入：nums = [1,2,3]
    输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */


public class PermuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        dfs(nums,0,result);

        return result;

    }

    public void dfs(int[] nums,int i, List<List<Integer>> result){
        if(i == nums.length){
            List<Integer> permutation = new ArrayList<>();
            for(int num : nums){
                permutation.add(num);
            }
            result.add(permutation);
        }else{
            HashSet<Integer> set = new HashSet<>();
            for(int j = i; j < nums.length; j++){
                if(!set.contains(nums[j])){
                    set.add(nums[j]);
                    swap(nums, i, j);
                    dfs(nums, i+1, result);
                    swap(nums, i, j);
                    
                }
            }
        }
    }

    public int[] swap(int[]  nums,int i,int j){
        int temp = 0;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,1};
        PermuteUnique res = new PermuteUnique();
        System.out.println(res.permuteUnique(nums));
    }
}

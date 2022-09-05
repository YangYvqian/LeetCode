package leetCodeBacktracking;

import java.util.Arrays;

public class MaximumProduct {


    public static int getMinIndex(int[] nums){

        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1]);

    }


    public static void main(String[] args) {
        int[] a = {1,2,3};
        getMinIndex(a);
    }

    
}

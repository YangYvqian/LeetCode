package leetCodeBacktracking;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Makesquare {
    public boolean makesquare(int[] matchsticks) {

        IntStream arr = Arrays.stream(matchsticks);
        int sum = arr.sum();

        int flag = 0;;
        if(sum%4==0){
            flag = sum/4;
        }else{
            return false;
        }
        Arrays.sort(matchsticks);
        
        // 降序排列
        int left = 0;
        int right = matchsticks.length-1;
        while(left<right){
            int temp = matchsticks[left];
            matchsticks[left] = matchsticks[right];
            matchsticks[right] = temp;
            left++;
            right--;
        }
        
        // 回溯遍历，直到找到一个解
        // 初始化一个数组，每个数代表每个边的大小
        int[] edge = new int[4];
        

        return dfs(matchsticks,0,flag,edge);
    }

    public boolean dfs(int[] matchsticks,int i,int flag,int[] edge){
        if(i==matchsticks.length){
            return true;
        }else if(i < matchsticks.length){
            for(int j = 0; j < edge.length; j++){
                edge[j] += matchsticks[i];
                if(edge[j] <= flag && dfs(matchsticks, i+1, flag, edge)){
                    return true;
                }
                edge[j] -= matchsticks[i];
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,10,6,5,5,5,3,3,3,2};
        Makesquare res = new Makesquare();
        System.out.println(res.makesquare(arr) );
        
    }
}

package leetCodeString;
/*
假设 Andy 和 Doris 想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。

你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设答案总是存在。

 

示例 1:

输入: list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]，list2 = ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
输出: ["Shogun"]
解释: 他们唯一共同喜爱的餐厅是“Shogun”。
示例 2:

输入:list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]，list2 = ["KFC", "Shogun", "Burger King"]
输出: ["Shogun"]
解释: 他们共同喜爱且具有最小索引和的餐厅是“Shogun”，它有最小的索引和1(0+1)。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/minimum-index-sum-of-two-lists
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<list1.length;i++){
            map.put(list1[i], i);
        }
        List<String> res = new ArrayList<>();
        for(int j = 0; j < list2.length; j++){
            if(map.containsKey(list2[j])){
                int sumIndex = map.get(list2[j])+j;
                if(sumIndex < min){
                    res.clear();
                    min = sumIndex;
                    res.add(list2[j]);  
                }
                else if(sumIndex==min){
                    res.add(list2[j]);
                }

            }
        }

        String[] ans = new String[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i] = res.get(i);
        }
        
        return ans;

    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        FindRestaurant res = new FindRestaurant();
        System.out.println(res.findRestaurant(list1, list2));
    }

}

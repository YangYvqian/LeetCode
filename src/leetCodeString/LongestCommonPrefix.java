package leetCodeString;

/*
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。
示例 1：
输入：strs = ["flower","flow","flight"]
输出："fl"
示例 2：
输入：strs = ["dog","racecar","car"]
输出：""
解释：输入不存在公共前缀。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/longest-common-prefix
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        // 获取字符串最短的长度
        int subLen = Integer.MAX_VALUE;
        for(int i=0;i<strs.length-1;i++){
            subLen = Math.min(subLen, commonPrefixTwo(strs[i], strs[i+1]));
        }
        

        if(subLen == Integer.MAX_VALUE){
            return "";
        }

        return strs[0].substring(0, subLen);

    } 

    public int commonPrefixTwo(String s1, String s2){

        
        int len =  Math.min(s1.length(), s2.length());
        int count = 0;
        for(int i = 0; i< len; i++){
            if(s1.charAt(i)==s2.charAt(i)){
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};

        LongestCommonPrefix res = new LongestCommonPrefix();
        System.out.println(res.longestCommonPrefix(strs));
    }
}

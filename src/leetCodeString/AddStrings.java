package leetCodeString;
/*
给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。

你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。

 

示例 1：

输入：num1 = "11", num2 = "123"
输出："134"
示例 2：

输入：num1 = "456", num2 = "77"
输出："533"
示例 3：

输入：num1 = "0", num2 = "0"
输出："0"

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/add-strings
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {

        int flag = 0;
        int s1 = num1.length();
        int s2 = num2.length();
        int i = s1;
        int j = s2;
        StringBuffer res = new StringBuffer();
        while(i>0 && j>0){
            int n = Integer.parseInt(num1.substring(i-1, i));
            int m = Integer.parseInt(num2.substring(j-1, j));
            int tem = n+m;
            res.append((tem%10+flag)%10);
            flag = tem+flag>=10? 1:0;
            i--;
            j--;
        }
        while(i>0){
            if(flag==1){
                res.append((Integer.parseInt(num1.substring(i-1, i))+flag)%10);
                flag = Integer.parseInt(num1.substring(i-1, i))+flag >=10 ?1:0;
                flag=0;
            }else{
                res.append(Integer.parseInt(num1.substring(i-1, i)));  
            }
            i--;
        }
        while(j>0){
            if(flag==1){
                res.append((Integer.parseInt(num2.substring(j-1, j))+flag)%10);
                flag = Integer.parseInt(num2.substring(j-1, j))+flag >=10 ?1:0;
            }else{
                res.append(Integer.parseInt(num2.substring(j-1, j)));  
            }
            j--;
        }
        if(flag==1) res.append(1);
        return res.reverse().toString();

    }
    public static void main(String[] args) {
        String num1 = "9";
        String num2 = "99";
        AddStrings res = new AddStrings();
        System.out.println(res.addStrings(num1, num2));
    }
    
}

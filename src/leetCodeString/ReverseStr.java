package leetCodeString;

/*
给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。

如果剩余字符少于 k 个，则将剩余字符全部反转。
如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 

示例 1：

输入：s = "abcdefg", k = 2
输出："bacdfeg"
示例 2：

输入：s = "abcd", k = 2
输出："bacd"
 

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/reverse-string-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class ReverseStr {
    public String reverseStr(String s, int k) {
        int len = s.length();
        if(s.length()<=k){
            return reverses(s,k);
        }

        if(s.length()<2*k && s.length()>k){
            StringBuilder res = new StringBuilder();
            for(int i=k-1;i>=0;i--){
                res.append(s.charAt(i));
            }
            res.append(s.substring(k, s.length()));
            return res.toString();
        }
        StringBuffer res = new StringBuffer();
        int i=0;
            
        for(i=0;i<s.length();i=i+2*k){
            if(i+2*k>s.length()) break;
            String str = s.substring(i, i+2*k);
            res.append(reverses(str,k));
            
        }

        if(s.length()-i>k){
            String str = s.substring(i, i+k);
            res.append(reverses(str,k));
            res.append(s.substring(i+k,s.length()));
        }else{
            String str = s.substring(i, s.length());
            res.append(reverses(str,k));
        }
        
        
        return res.toString();
    }

    public String reverses(String s,int k){
        int len = s.length();
        StringBuilder str = new StringBuilder();
        if(len==2*k){
            for(int i=len/2-1;i>=0;i--){
                str.append(s.charAt(i));
            }
            str.append(s.substring(k, s.length()));
        }else{
            for(int i=len-1;i>=0;i--){
                str.append(s.charAt(i));
            }
        }
        
        return str.toString();
    }
    public static void main(String[] args) {
        String s = "uxzpsogzkwgwacxxvvzlhkaahjaqagdfjkmyutvhxclzskvxckjvfgzptlzldjwhrpocfugzqkpaxexezbvggtkoxriysqivupofrcoxbrdgccvphvdtvrjtsbospmgyfduvaslnvxwuepleziodaaqmonsxjszyjwjmvgdqgowjjtwdmynvirnlujimedfyntgacntvyqujvehhvruiolfkeprqpzdvmapeukemmzxdtyolxeixatgsupvpidmeyifjyxkzudxvsunghtklzgxsjhrxgxgqcdebukrarpkpqmusempvulagashxpaisfvetrmiqiordsyjgyjmkvavxorrmnxbiikuxmezpkhgkjzmapldnmjvfxtmckskiwhdnuqpqrsrdspxuixxnibjxoyagijmlbhjtuchzbdpaxommfvlbpxfnzkkcdentdhhxracunvrtqxrbqanufaglncjqiwofanuznfmbtjalehlqidtcmqbsgppqyoaoglifareljluigqyxtveukstzepridpmdltpxjmzdvatgzmqexrauywreoslyoydmiyipyqiaihfjqncelefiaxjhdaamrvahbvoznsfvsdknlktsifioxjdsqldzlyzqkqxkwjfrehqbhlaanbcvxomxyypqfxbwmtaiegcjlzeslmpghirzsaprxdcbobflvbupwahxwjgrcqskewvjsjyyggozkvwwytrwpmuguclssmrshlwukkjapiwnkybydergdqkhttbakooghbskiqlesocfrjuxotecnhkfmwtmzcysppmffnskvfabunfzsibqrerfstonzjhtcpnscpteflsnmqqphelpngnlnczritcjxewlhftujrpaeaxylqkswaisvzgciaemvodvcnqtuwcjkmzjzkikaqifymwwlvyxndgwwlauwiyiflgoahyaavkudvemfftzwlxdltwicouwboeaddxmvind";
        int k = 22;
        ReverseStr res = new ReverseStr();
        System.out.println(res.reverseStr(s, k));

        // String ss = "asd";
        // int kk = 2;
        // System.out.println(res.reverseStr(ss, kk));

        // String sss = "s";
        // int kkk = 2;
        // System.out.println(res.reverseStr(sss, kkk));
    }
}

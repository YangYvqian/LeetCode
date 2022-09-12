package leetCodeString;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
     this.val = val;
     this.left = left;
     this.right = right;
     }
 }

public class BinaryTreePaths {
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        
        
        constructPaths(root, "", res);

        return res;

    }

    public void constructPaths(TreeNode root, String path, List<String> res){
        if(root != null){
            StringBuffer str = new StringBuffer(path);
            str.append(Integer.toString(root.val));
            if(root.left == null && root.right == null){
                res.add(str.toString());
            } else {
                str.append("->");
                constructPaths(root.left, str.toString(), res);
                constructPaths(root.right, str.toString(), res);
            }

        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,new TreeNode(2,new TreeNode(),new TreeNode(5)),new TreeNode(3,new TreeNode(),new TreeNode()));
        BinaryTreePaths res = new BinaryTreePaths();
        System.out.println(res.binaryTreePaths(root));
    }
}

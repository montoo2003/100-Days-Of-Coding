/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.left,root.right);
        
    }
    static boolean symmetric(TreeNode leftroot,TreeNode rightroot){
        if(rightroot == null && leftroot == null)
          return true;
        if(rightroot == null && leftroot != null)
          return false;
        if(rightroot != null && leftroot == null)
          return false;
        
        return (leftroot.val == rightroot.val)&&symmetric(leftroot.left,rightroot.right)&&symmetric(leftroot.right,rightroot.left);


    }
}

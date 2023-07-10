//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/submissions/990578325/
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     
     
    
        ArrayList<ArrayList<Integer>>res = new ArrayList<ArrayList<Integer>>();
        if(root==null)return new ArrayList<>(res) ;
        Deque <TreeNode> q = new ArrayDeque<>();
        boolean isfirst = true ;
        q.add(root);
        while(!q.isEmpty()){
               int size = q.size();
                 ArrayList<Integer>arr = new ArrayList<Integer>();
            if(isfirst){
              
                for(int i = 0 ;i<size;i++){
                    
                    TreeNode node = q.pollFirst();
                    arr.add(node.val);
                    if(node.left!=null)
                     q.addLast(node.left);
                     if(node.right!=null)
                        q.addLast(node.right);

                }
                System.out.println(arr);
                  res.add(new ArrayList<>(arr));
                  isfirst = false ;

            }
            else {
              
                for(int i = 0 ;i<size;i++){
                    
                    TreeNode node = q.pollLast();
                    arr.add(node.val);
                    if(node.right!=null)
                     q.addFirst(node.right);
                     if(node.left!=null)
                        q.addFirst(node.left);

                }
                  res.add(new ArrayList<>(arr));
                  isfirst = true ;

            }
        }
        
        return new ArrayList<>(res);
    }
}

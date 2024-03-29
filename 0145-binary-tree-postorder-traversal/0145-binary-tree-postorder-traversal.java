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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        
        helper(root,list);
        
        return list;
        
    }
    
    public void helper(TreeNode root , List<Integer> list){        
        if(root == null){           
            return;
        }
         helper(root.left,list);    // call the left  root
        helper(root.right,list);  // call the right  root
       
        list.add(root.val); 
       
    }
        
}
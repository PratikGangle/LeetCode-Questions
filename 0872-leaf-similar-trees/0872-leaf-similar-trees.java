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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        List<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();
        
        inOrder(root1,list1); // store all leaf node value in list1
        inOrder(root2,list2); // store all leaf node value in list2
        
        // if size is diffrent we return false
        if(list1.size() != list2.size()){
            return false;
        }
        
        // check the leaf node value
        for(int i=0; i<list1.size(); i++){            
            if(list1.get(i) != list2.get(i)){
                return false;
            }            
        }
        
        return true;

    }
    
    public void inOrder(TreeNode root,List<Integer> list ){
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }
        
        inOrder(root.left,list);
        
        inOrder(root.right,list);
    }
}
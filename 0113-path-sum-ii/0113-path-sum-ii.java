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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList();
        List<Integer> list=new ArrayList();
        path(root,targetSum,ans,list);
        return ans;
    }
    public void path(TreeNode root,int sum,List<List<Integer>> ans,List<Integer> list){
        if(root == null) return;
        list.add(root.val);
      
        if(root.left==null && root.right==null){
            sum-=root.val;
            if(sum==0){
                ans.add(new ArrayList<>(list));
            }
        }
        path(root.left,sum-root.val,ans,list);
        path(root.right,sum-root.val,ans,list);
        list.remove(list.size()-1);
    }
}
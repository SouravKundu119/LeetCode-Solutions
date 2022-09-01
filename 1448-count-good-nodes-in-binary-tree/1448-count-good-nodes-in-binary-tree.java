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
    public int goodNodes(TreeNode root) {
        return helper(root,root.val);
    }
    public int helper(TreeNode root,int current_max){
        if(root==null){
            return 0;
        }
        
        int count=0;
        if(root.val >= current_max){
            count=1;
            current_max=root.val;
        }
        
        return count+helper(root.left,current_max)+helper(root.right,current_max);
        
    }
}
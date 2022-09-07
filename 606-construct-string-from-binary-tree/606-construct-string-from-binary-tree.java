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
    public String tree2str(TreeNode root) {
        if(root==null)return "";
        StringBuilder sb=new StringBuilder();
        int val=root.val;
        
        String leftstr=tree2str(root.left);
        String rightstr=tree2str(root.right);
        
        sb.append(val+"");
        
        sb.append((leftstr.isEmpty() && rightstr.isEmpty())? "": "("+leftstr+")");
        sb.append((rightstr.isEmpty())?"": "("+rightstr+")");
        return sb.toString();
    }
}
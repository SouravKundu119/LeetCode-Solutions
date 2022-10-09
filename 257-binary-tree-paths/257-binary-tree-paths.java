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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<String>();
        traverse(root,"",list);
        return list;   
    }
    public void traverse(TreeNode root,String s,List<String> list){
        if(root!=null){
            s+=root.val+"";
            if(root.left==null && root.right==null){
                list.add(s);
            }
            s+="->";
            traverse(root.left,s,list);
            traverse(root.right,s,list);
        }
       
    }
}
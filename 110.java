/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;   //root==null||root.left==null&&root.right==null
        if(Math.abs(height(root.left)-height(root.right))>1) return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public int height(TreeNode root){
        if(root==null) return 0;    //root==null||root.left==null&&root.right==null
        return 1+Math.max(height(root.left),height(root.right));
    }
}
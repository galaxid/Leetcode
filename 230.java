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
    private int i,ans=0;
    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return ans;              
    }
    public void helper(TreeNode root,int k){
        if(root.left!=null)helper(root.left,k);
        i++;
        if(i==k) ans=root.val;
        if(root.right!=null)helper(root.right,k);
    }
}

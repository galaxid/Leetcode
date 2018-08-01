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
    public int rob(TreeNode root) {
        int[] ans = Helper(root);
		return Math.max(ans[0],ans[1]);
    }
    public int[] Helper(TreeNode root){
        int[] ans=new int[2];
		if (root==null) return ans;
		int[] ansl=Helper(root.left);
		int[] ansr=Helper(root.right);
		ans[0]=Math.max(ansl[0], ansl[1])+Math.max(ansr[0],ansr[1]);
		ans[1]=root.val + ansl[0] + ansr[0];
		return ans;
    }
}
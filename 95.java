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
    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new ArrayList<TreeNode>();
        return Helper(1, n);
    }
    public List<TreeNode> Helper(int left,int right){
        List<TreeNode>ans=new ArrayList<>();
        if(left>right) {
            ans.add(null);
            return ans;   
        }
        for(int i=left;i<=right;i++){
            List<TreeNode> l = Helper(left, i-1);
            List<TreeNode> r = Helper(i+1, right);
            for(TreeNode j:l) {
                for(TreeNode k:r) {
                    TreeNode root=new TreeNode(i);
                    root.left=j;
                    root.right=k;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}
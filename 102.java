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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root==null) return ans;
        queue.offer(root);
        while(!queue.isEmpty()){
            int num = queue.size();
            List<Integer> cur = new ArrayList<>();
            for(int i=0; i<num; i++){
              TreeNode node = queue.poll();
              cur.add(node.val);
              if(node.left != null){
                queue.offer(node.left);
              }
              if(node.right != null){
                queue.offer(node.right);
              }
            }
            ans.add(cur);
        }
        return ans;
    }
}
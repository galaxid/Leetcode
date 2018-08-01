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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> ans=new LinkedList<>();
        Queue<TreeNode> ans1=new LinkedList<>();
        int a;
        ans.add(root);
        while(true){
            a=ans.peek().val;
            while(ans.peek()!=null){
                if(ans.peek().left!=null)ans1.add(ans.peek().left);  //null also be added
                if(ans.peek().right!=null)ans1.add(ans.peek().right);
                ans.poll();
            }
            if(ans1.peek()==null)break;
            a=ans1.peek().val;
            while(ans1.peek()!=null){
                if(ans1.peek().left!=null)ans.add(ans1.peek().left);   
                if(ans1.peek().right!=null)ans.add(ans1.peek().right);
                ans1.poll();
            }
            if(ans.peek()==null)break;
        }
        return a;
    }
    
}
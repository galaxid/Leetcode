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
    List<Integer> vals=new ArrayList<>();
    int i=0;int flag=1;
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        findleft(root.left);
        findright(root.right);
        return(flag==1);
    }
    public void findleft(TreeNode root){
        if(root!=null)vals.add(root.val);
        else vals.add(null);
        if(root==null||root.left==null&&root.right==null) return;
        findleft(root.left);
        findleft(root.right);
    }
    public void findright(TreeNode root){
        if(i==vals.size()){
            flag=0;return;
        }
        if(root!=null){
            if(vals.get(i)==null)flag=0;
            else if(root.val!=vals.get(i))flag=0;
        }
        else if(vals.get(i)!=null)flag=0;
        i++;
        if(root==null||root.left==null&&root.right==null) return;
        findright(root.right);
        findright(root.left);
    }
}
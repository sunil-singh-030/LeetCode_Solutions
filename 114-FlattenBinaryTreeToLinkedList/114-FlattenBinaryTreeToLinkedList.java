// Last updated: 8/1/2025, 7:11:09 AM
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
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while (curr!=null){
            if (curr.left==null){
                curr = curr.right;
            }
            else{
                TreeNode temp = curr.left;
                while (temp.right!=null && temp.right!=curr){
                    temp = temp.right;
                }
                if (temp.right==curr){
                    TreeNode rightchild = curr.right;
                    TreeNode leftchild = curr.left;
                    curr.right = leftchild;
                    temp.right = rightchild;
                    curr.left = null;
                    curr = rightchild;
                }
                else{
                    temp.right = curr;
                    curr = curr.left;
                }  
            }
        }
    }
}
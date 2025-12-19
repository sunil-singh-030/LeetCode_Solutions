// Last updated: 12/19/2025, 12:00:17 PM
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
    public int longestUnivaluePath(TreeNode root) {
        if (root==null){
            return 0;
        }
        int maxAns = 0;
        if (root.left!=null && root.val==root.left.val){
            int maxleft = fn(root.left);
            maxAns = 1 + maxleft;
        }
        if (root.right!=null && root.val==root.right.val){
            int maxright = fn(root.right);
            if (root.left!=null && root.left.val==root.val){
                maxAns = 1 + maxAns + maxright;
            }
            else{
                maxAns = Math.max(maxAns,1 + maxright);
            }
        }
        
        return Math.max(maxAns , Math.max(longestUnivaluePath(root.left) , longestUnivaluePath(root.right)));
    }
    public int fn(TreeNode root){
        if (root==null || (root.left==null && root.right==null)){
            return 0;
        }
        int maxleft = 0;
        if (root.left!=null && root.val==root.left.val){
            maxleft = 1 + fn(root.left);
        }
        int maxright = 0;
        if (root.right!=null && root.val==root.right.val){
            maxright = 1 + fn(root.right);
        }
        return Math.max(maxleft,maxright);
    }
}
// Last updated: 8/1/2025, 7:11:14 AM
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
    public int minDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        return check(root);
    }
    public static int check(TreeNode root){
        if (root.left==null && root.right==null){
            return 1;
        }
        int currmin = Integer.MAX_VALUE;
        if (root.left!=null){
            currmin = Math.min(currmin,1+check(root.left));
        }
        if (root.right!=null){
            currmin = Math.min(currmin,1+check(root.right));
        }
        return currmin;
    }
}
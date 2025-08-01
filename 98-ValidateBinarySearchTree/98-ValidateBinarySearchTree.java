// Last updated: 8/1/2025, 7:11:30 AM
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
    public boolean isValidBST(TreeNode root) {
        return checkBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean checkBST(TreeNode root, long leftbound, long rightbound){
        if (root==null){
            return true;
        }
        if (root.val<=leftbound || root.val>=rightbound) return false;
        return checkBST(root.left,leftbound,root.val) && checkBST(root.right,root.val,rightbound);
    }
    
}
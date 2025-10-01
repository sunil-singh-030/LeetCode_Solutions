// Last updated: 10/1/2025, 1:37:28 PM
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
    public int maxAncestorDiff(TreeNode root) {
        int[] ans = new int[1];
        fn(root,root.val,root.val,ans);
        return ans[0];
    }
    public void fn(TreeNode root, int lb, int rb, int[] ans){
        if (root==null){
            return;
        }
        int currMaxDiff = Math.max(Math.abs(root.val-lb),Math.abs(root.val-rb));
        ans[0] = Math.max(ans[0],currMaxDiff);
        fn(root.left,Math.min(lb,root.val),Math.max(rb,root.val),ans);
        fn(root.right,Math.min(lb,root.val),Math.max(rb,root.val),ans);
    }
}
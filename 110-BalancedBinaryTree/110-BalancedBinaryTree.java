// Last updated: 8/1/2025, 7:11:15 AM
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
    public boolean isBalanced(TreeNode root) {
        return check(root)==-1 ? false : true;
    }
    public static int check(TreeNode currnode){
        if (currnode==null){
            return 0;
        }
        int currmax = 1;
        int lh = check(currnode.left);
        if (lh==-1) return -1;
        int rh = check(currnode.right);
        if (rh==-1) return -1;

        if (Math.abs(lh-rh)>1) return -1;
        
        return currmax + Math.max(lh,rh);
    }
}
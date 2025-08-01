// Last updated: 8/1/2025, 7:10:57 AM
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
    public int maxPathSum(TreeNode root) {
        int[] maxsum = new int[1];
        maxsum[0] = Integer.MIN_VALUE;
        maxSumHeight(root,maxsum);
        return maxsum[0];
    }
    public static int maxSumHeight(TreeNode currnode , int[] maxsum){
        if (currnode==null){
            return 0;
        }
        int currsum = currnode.val;
        int leftsum = Math.max(0,maxSumHeight(currnode.left,maxsum));
        int rightsum = Math.max(0,maxSumHeight(currnode.right,maxsum));
        maxsum[0] = Math.max(maxsum[0],currsum+leftsum+rightsum);
        return currsum + Math.max(leftsum,rightsum);
    }
}
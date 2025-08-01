// Last updated: 8/1/2025, 7:08:05 AM
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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diam = new int[1];
        maxheight(root,diam);
        return diam[0];

    }
    public static int maxheight(TreeNode node, int[] diam){
        if (node==null){
            return 0;
        } 
        int lh = maxheight(node.left,diam);
        int rh = maxheight(node.right,diam);
        diam[0] = Math.max(diam[0],lh+rh);
        return 1 + Math.max(lh,rh);
    }
    
}
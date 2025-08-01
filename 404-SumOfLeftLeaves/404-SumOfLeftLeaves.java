// Last updated: 8/1/2025, 7:08:48 AM
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
    public int sumOfLeftLeaves(TreeNode root) {
        int[] sum = new int[1];
        sumLeftLeaf(root,false,sum);
        return sum[0];
    }
    public static void sumLeftLeaf(TreeNode root, boolean canAdd, int[] sum){
        if (root.left==null && root.right==null){
            if (canAdd){
                sum[0] += root.val;
            }
            return ;
        }
        if (root.left!=null){
            sumLeftLeaf(root.left,true,sum);
        }
        if (root.right!=null){
            sumLeftLeaf(root.right,false,sum);
        }
        return ;
    }
}
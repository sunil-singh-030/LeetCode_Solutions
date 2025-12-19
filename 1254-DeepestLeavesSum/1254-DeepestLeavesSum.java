// Last updated: 12/19/2025, 11:58:48 AM
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
    public int deepestLeavesSum(TreeNode root) {
        int leftdepth = depth(root.left);
        int rightdepth = depth(root.right);
        if (leftdepth==rightdepth){
            return sumleaves(root,leftdepth+1);
        }
        else if (leftdepth>rightdepth){
            return sumleaves(root.left,leftdepth);
        }
        return sumleaves(root.right,rightdepth);
    }
    public static int sumleaves(TreeNode root, int dis){
        if (root==null){
            return 0;
        }
        if (dis==1){
            return root.val;
        }
        return sumleaves(root.left,dis-1) + sumleaves(root.right,dis-1);
    }
    public static int depth(TreeNode root){
        if (root==null){
            return 0;
        }
        return 1 + Math.max(depth(root.left),depth(root.right));
    }
}
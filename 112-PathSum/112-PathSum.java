// Last updated: 8/1/2025, 7:11:12 AM
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null){
            return false;
        }
        return check(root,targetSum,root.val);
    }
    public static boolean check(TreeNode node , int target , int sum){
        if (node.left==null && node.right==null){
            if (sum==target){
                return true;
            }
            else{
                return false;
            }
        }
        boolean f1 = false , f2 = false;
        if (node.left!=null){
            f1 = check(node.left,target,sum+node.left.val);
        }
        if (node.right!=null){
            f2 = check(node.right,target,sum+node.right.val);
        }
        return f1 || f2;
    }
}
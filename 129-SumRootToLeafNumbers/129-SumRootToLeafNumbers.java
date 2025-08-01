// Last updated: 8/1/2025, 7:10:52 AM
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
    static int sum = 0;
    public int sumNumbers(TreeNode root) {
        sum = 0;
        if (root==null){
            return 0;
        }
        fxn(root,root.val);
        return sum;
    }
    public static void fxn(TreeNode node , int num){
        if (node.left==null && node.right==null){
            sum += num;
            return;
        }
        if (node.left!=null){
            fxn(node.left,num*10+node.left.val);
        }
        if (node.right!=null){
            fxn(node.right,num*10+node.right.val);
        }
    }
}
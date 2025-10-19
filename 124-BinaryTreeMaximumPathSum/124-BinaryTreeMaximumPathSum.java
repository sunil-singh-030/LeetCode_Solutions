// Last updated: 10/19/2025, 9:36:24 AM
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
    public int maxPathSum(TreeNode curr) {
        if (curr==null){
            return 0;
        }
        
        int currSum = curr.val;
        int leftMax = MaxSum(curr.left);
        int rightMax = MaxSum(curr.right);
        if (leftMax>0){
            currSum = currSum + Math.max(leftMax,leftMax+rightMax);
        }
        else{
            currSum = Math.max(currSum,currSum+rightMax);
        }
        int left = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;
        if (curr.left!=null){
            left = maxPathSum(curr.left);
        }
        if (curr.right!=null){
            right = maxPathSum(curr.right);
        }
        return Math.max(Math.max(left,right),currSum);
    }
    public int MaxSum(TreeNode curr){
        if (curr==null){
            return 0;
        }
        int sum1 = curr.val;
        int leftSum = MaxSum(curr.left);
        int rightSum = MaxSum(curr.right);
        return Math.max(sum1,sum1 + Math.max(leftSum,rightSum));
    }

}
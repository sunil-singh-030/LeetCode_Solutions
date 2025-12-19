// Last updated: 12/19/2025, 12:00:48 PM
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
    public int pathSum(TreeNode root, int targetSum) {
        if (root==null){
            return 0;
        }
        int cntpath = 0;
        if (targetSum-root.val==0){
            cntpath++;
        }
        cntpath += checkTarget(root.left,targetSum-root.val);
        cntpath += checkTarget(root.right,targetSum-root.val);
        return cntpath + pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
    }
    public static int checkTarget(TreeNode root, long target){
        if (root==null){
            return 0;
        }
        long newtar = target-root.val;
        if (newtar==0){
            return 1 + checkTarget(root.left,0) + checkTarget(root.right,0);
        }
        else{
            return checkTarget(root.left,newtar) + checkTarget(root.right,newtar);
        } 
        
    }
}
// Last updated: 8/6/2025, 6:43:28 AM
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
    public int goodNodes(TreeNode root) {
        return cntGoodNodes(root,Integer.MIN_VALUE);
    }
    public static int cntGoodNodes(TreeNode root, int max){
        if (root==null){
            return 0;
        }
        int cnt = 0;
        if (root.val>=max){
            cnt++;
        }
        cnt += (cntGoodNodes(root.left,Math.max(root.val,max)) + cntGoodNodes(root.right,Math.max(root.val,max))); 
        return cnt ;
    }
}
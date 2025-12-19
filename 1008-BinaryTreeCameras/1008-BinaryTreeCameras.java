// Last updated: 12/19/2025, 11:59:08 AM
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
    int cnt = 0;
    public int minCameraCover(TreeNode root) {
        int state = fn(root);
        if (state==-1){
            cnt++;
        }
        return cnt;
    }
    public  int fn(TreeNode root){
        if (root==null){
            return 0;
        }
        if (root.left==null && root.right==null){
            return -1;
        }
        int left = fn(root.left);
        int right = fn(root.right);
        if (left==-1 || right==-1){
            cnt++;
            return 1;
        }
        if (left==1 || right==1){
            return 0;
        }
        return -1;
    }
    
    
}
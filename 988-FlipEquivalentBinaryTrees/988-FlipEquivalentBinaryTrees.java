// Last updated: 8/1/2025, 7:06:28 AM
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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return check(root1,root2);
    }
    public boolean check(TreeNode node1 , TreeNode node2){
        if (node1==null && node2==null){
            return true;
        }
        if (node1==null || node2==null){
            return false;
        }
        if (node1.val!=node2.val){
            return false;
        }
        boolean lef1 =  check(node1.left , node2.right);
        boolean rig1 = check(node1.right , node2.left);
        boolean lef2 =  check(node1.left , node2.left);
        boolean rig2 = check(node1.right , node2.right);
        return (lef1 && rig1) || (lef2 && rig2);
    }
}
// Last updated: 8/1/2025, 7:09:44 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==p || root==q){
            return root;
        }
        if (root==null){
            return null;
        }
        TreeNode leftcheck = lowestCommonAncestor(root.left,p,q);
        TreeNode rightcheck = lowestCommonAncestor(root.right,p,q);
        if (leftcheck!=null && rightcheck!=null){
            return root;
        }
        if (leftcheck!=null){
            return leftcheck;
        }
        return rightcheck;
    }
    
}
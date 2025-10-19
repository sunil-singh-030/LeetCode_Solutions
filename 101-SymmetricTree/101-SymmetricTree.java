// Last updated: 10/19/2025, 10:41:28 AM
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
    public boolean isSymmetric(TreeNode root) {
        return isTreeSymmetric(root,root);
    }
    public boolean isTreeSymmetric(TreeNode node1, TreeNode node2){
	
	if (node1==null && node2==null){
		return true;
	}
	if (node1.val!=node2.val){
		return false;
	}
	if ((node1.left==null && node2.right!=null) || (node1.right==null && node2.left!=null)){
		return false;
	}
    if ((node1.left!=null && node2.right==null) || (node1.right!=null && node2.left==null)){
		return false;
	}
	return isTreeSymmetric(node1.left,node2.right) && isTreeSymmetric(node1.right,node2.left);
}
    
}
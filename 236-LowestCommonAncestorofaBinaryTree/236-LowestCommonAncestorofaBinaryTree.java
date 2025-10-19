// Last updated: 10/19/2025, 1:13:11 PM
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
        if (root==null){
		return null;
	}
	if (root.val==p.val || root.val==q.val){
		return root;
	}
	
	boolean leftSubTree = checkPandQ(root.left,p,q);
	if (!leftSubTree){
		return lowestCommonAncestor(root.right,p,q);
	}
	Boolean rightSubTree = checkPandQ(root.right,p,q);
	if (rightSubTree){
		return root;
	}
	return lowestCommonAncestor(root.left,p,q);
    }
    public boolean checkPandQ(TreeNode curr, TreeNode p ,TreeNode q){
	if (curr==null){
		return false;
	}
	
	if (curr.val==p.val || curr.val==q.val){
		return true;
	}
	return checkPandQ(curr.left,p,q) || checkPandQ(curr.right,p,q);
}

}
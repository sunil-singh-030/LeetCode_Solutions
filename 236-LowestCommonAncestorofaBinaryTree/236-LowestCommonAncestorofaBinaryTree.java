// Last updated: 10/19/2025, 1:28:54 PM
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
    TreeNode ans = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return ans;
    }

    private boolean dfs(TreeNode curr, TreeNode p, TreeNode q) {
        if (curr == null) return false;

        boolean left = dfs(curr.left, p, q);
        boolean right = dfs(curr.right, p, q);
        boolean mid = (curr == p || curr == q);

        // If any two of the three flags are true, current node is LCA
        if ((mid && left) || (mid && right) || (left && right)) {
            ans = curr;
        }

        return mid || left || right;
    }
}

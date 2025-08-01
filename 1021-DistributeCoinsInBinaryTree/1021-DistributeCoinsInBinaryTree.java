// Last updated: 8/1/2025, 7:06:24 AM
class Solution {
    int moves = 0;

    public int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);

        // total moves = abs(coins surplus/deficit in left) + abs in right
        moves += Math.abs(left) + Math.abs(right);

        // return net coins to be moved to/from parent
        return node.val + left + right - 1;
    }
}

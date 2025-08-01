// Last updated: 8/1/2025, 7:06:21 AM
class Solution {
    public String smallestFromLeaf(TreeNode root) {
        String[] ans = new String[1];
        ans[0] = "~"; // "~" is lex greater than any lower-case string
        dfs(root, new StringBuilder(), ans);
        return ans[0];
    }

    public void dfs(TreeNode node, StringBuilder path, String[] ans) {
        if (node == null) return;

        path.insert(0, (char) (node.val + 'a')); // prepend current char

        if (node.left == null && node.right == null) {
            String current = path.toString();
            if (current.compareTo(ans[0]) < 0) {
                ans[0] = current;
            }
        }

        dfs(node.left, new StringBuilder(path), ans);
        dfs(node.right, new StringBuilder(path), ans);
    }
}

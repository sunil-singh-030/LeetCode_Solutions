// Last updated: 5/16/2026, 7:32:00 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    TreeNode ans = null;
12
13    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
14        dfs(root, p, q);
15        return ans;
16    }
17
18    private boolean dfs(TreeNode curr, TreeNode p, TreeNode q) {
19        if (curr == null) return false;
20
21        boolean left = dfs(curr.left, p, q);
22        boolean right = dfs(curr.right, p, q);
23        boolean mid = (curr == p || curr == q);
24
25        // If any two of the three flags are true, current node is LCA
26        if ((mid && left) || (mid && right) || (left && right)) {
27            ans = curr;
28        }
29
30        return mid || left || right;
31    }
32}
33
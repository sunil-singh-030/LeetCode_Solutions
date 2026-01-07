// Last updated: 1/7/2026, 7:42:39 PM
1class Solution {
2    long total = 0, max = 0;
3    static final int MOD = 1_000_000_007;
4
5    public int maxProduct(TreeNode root) {
6        total = sum(root);   
7        dfs(root);           
8        return (int)(max % MOD);
9    }
10
11    private long sum(TreeNode node) {
12        if (node == null) return 0;
13        return node.val + sum(node.left) + sum(node.right);
14    }
15
16    private long dfs(TreeNode node) {
17        if (node == null) return 0;
18        long s = node.val + dfs(node.left) + dfs(node.right);
19        max = Math.max(max, s * (total - s));
20        return s;
21    }
22}
23
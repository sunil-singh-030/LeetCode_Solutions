// Last updated: 1/9/2026, 10:33:40 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode lcaDeepestLeaves(TreeNode root) {
18        return dfs(root).node;
19    }
20
21    private Pair dfs(TreeNode root) {
22        if (root == null) return new Pair(null, 0);
23
24        Pair left = dfs(root.left);
25        Pair right = dfs(root.right);
26
27        if (left.depth == right.depth) {
28            return new Pair(root, left.depth + 1);
29        } else if (left.depth > right.depth) {
30            return new Pair(left.node, left.depth + 1);
31        } else {
32            return new Pair(right.node, right.depth + 1);
33        }
34    }
35
36    private static class Pair {
37        TreeNode node;
38        int depth;
39        Pair(TreeNode n, int d) {
40            node = n;
41            depth = d;
42        }
43    }
44}
45
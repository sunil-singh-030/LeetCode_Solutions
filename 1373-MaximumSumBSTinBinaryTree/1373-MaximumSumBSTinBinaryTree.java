// Last updated: 2/10/2026, 11:50:54 AM
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
17    static int ans;
18    public int maxSumBST(TreeNode root) {
19        ans = 0;
20        jaiBabaKi(root);
21        return ans;
22    }
23    public int[] jaiBabaKi(TreeNode curr){
24        if (curr == null) {
25            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
26        }
27        int[] leftSubtree = jaiBabaKi(curr.left);
28        int[] rightSubtree = jaiBabaKi(curr.right);
29
30        if (curr.val > leftSubtree[1] && curr.val < rightSubtree[0]) {
31            int currSum = leftSubtree[2] + rightSubtree[2] + curr.val;
32            ans = Math.max(ans, currSum);
33
34            int minValue = Math.min(curr.val, leftSubtree[0]);
35            int maxValue = Math.max(curr.val, rightSubtree[1]);
36
37            return new int[]{minValue, maxValue, currSum};
38        }
39
40        return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 0};
41    }
42}
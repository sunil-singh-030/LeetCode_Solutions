// Last updated: 5/17/2026, 10:47:55 AM
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
18    public int diameterOfBinaryTree(TreeNode root) {
19        ans = 0;
20        helper(root);
21        return ans;
22    }
23    public int helper(TreeNode root){
24        if (root==null){
25            return 0;
26        }
27
28        int maxLeftLen = helper(root.left);
29        int maxRightLen = helper(root.right);
30        ans = Math.max(ans,maxLeftLen+maxRightLen);
31        return Math.max(maxLeftLen,maxRightLen)+1;
32    }
33}
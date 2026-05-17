// Last updated: 5/17/2026, 9:41:25 PM
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
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> ans = new ArrayList<>();
19        helper(root,ans);
20        return ans;
21    }
22    public void helper(TreeNode root, List<Integer> ans){
23        if (root==null) return;
24        helper(root.left,ans);
25        ans.add(root.val);
26        helper(root.right,ans);
27    }
28}
// Last updated: 1/9/2026, 10:18:46 AM
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
17    public TreeNode subtreeWithAllDeepest(TreeNode root) {
18        if (root.left==null && root.right==null){
19            return root;
20        }
21        int lmaxDepth = maxDepth(root.left);
22        int rmaxDepth = maxDepth(root.right);
23        if (lmaxDepth==rmaxDepth) return root;
24        if (lmaxDepth>rmaxDepth) return subtreeWithAllDeepest(root.left);
25        return subtreeWithAllDeepest(root.right);
26    }
27    public int maxDepth(TreeNode curr){
28        if (curr==null){
29            return 0;
30        }
31        int leftDepth = maxDepth(curr.left);
32        int rightDepth = maxDepth(curr.right);
33        return 1 + Math.max(leftDepth,rightDepth);
34    }
35}
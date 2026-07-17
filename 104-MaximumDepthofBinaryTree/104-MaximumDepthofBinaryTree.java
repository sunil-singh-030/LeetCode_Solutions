// Last updated: 7/17/2026, 9:45:35 PM
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
17    public int maxDepth(TreeNode root) {
18        return helper(root);
19    }
20
21    public int helper(TreeNode currNode){
22
23        if (currNode==null){
24            return 0;
25        }
26        int leftChild = helper(currNode.left);
27        int rightChild = helper(currNode.right);
28        return Math.max(leftChild,rightChild) + 1;	
29    }
30}
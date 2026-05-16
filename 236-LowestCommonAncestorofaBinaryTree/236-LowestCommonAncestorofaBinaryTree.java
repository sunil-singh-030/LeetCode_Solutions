// Last updated: 5/16/2026, 7:13:04 AM
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
11    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
12        if (root==p || root==q){
13            return root;
14        }
15
16        boolean hasLeft = checkNode(root.left,p,q);
17        boolean hasRight = checkNode(root.right,p,q);
18
19        if (hasLeft && hasRight) return root;
20        if (hasLeft) return lowestCommonAncestor(root.left,p,q);
21        return lowestCommonAncestor(root.right,p,q);
22    }
23    public boolean checkNode(TreeNode curr, TreeNode p, TreeNode q){
24        if (curr==null){
25            return false;
26        }
27        if (curr==p || curr==q){
28            return true;
29        }
30
31        return checkNode(curr.left,p,q) || checkNode(curr.right,p,q);
32    }
33}
// Last updated: 6/2/2026, 11:51:00 AM
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
17    public List<Integer> postorderTraversal(TreeNode root) {
18        List<Integer> ls = new ArrayList<>();
19        if (root==null) return ls;
20        Stack<TreeNode> st1 = new Stack<>();
21        Stack<TreeNode> st2 = new Stack<>();
22        st1.push(root);
23        while (!st1.isEmpty()){
24            TreeNode curr = st1.pop();
25            st2.push(curr);
26            if (curr.left!=null) st1.push(curr.left);
27            if (curr.right!=null) st1.push(curr.right);
28        }
29        while (!st2.isEmpty()){
30            ls.add(st2.pop().val);
31        }
32        return ls;
33    }
34    
35}
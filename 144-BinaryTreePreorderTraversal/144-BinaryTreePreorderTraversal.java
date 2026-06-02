// Last updated: 6/2/2026, 11:30:21 AM
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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        if (root==null) return new ArrayList<>();
19        List<Integer> ls = new ArrayList<>();
20        Stack<TreeNode> st = new Stack<>();
21        st.push(root);
22        while (!st.isEmpty()){
23            TreeNode curr = st.pop();
24            ls.add(curr.val);
25            if (curr.right!=null) st.push(curr.right);
26            if (curr.left!=null) st.push(curr.left);
27        }
28        return ls;
29    }
30    
31}
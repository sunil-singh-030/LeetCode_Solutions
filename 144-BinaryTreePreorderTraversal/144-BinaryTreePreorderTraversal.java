// Last updated: 6/13/2026, 6:50:18 AM
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
18        List<Integer> ls = new ArrayList<>();
19        if (root==null){
20            return ls;
21        }
22        Stack<TreeNode> st = new Stack<>();
23        st.push(root);
24
25        while (!st.isEmpty()){
26            TreeNode curr = st.pop();
27            ls.add(curr.val);
28
29            if (curr.right!=null) st.push(curr.right);
30            if (curr.left!=null) st.push(curr.left);
31            
32        }
33
34        return ls;
35    }
36
37    
38    
39}
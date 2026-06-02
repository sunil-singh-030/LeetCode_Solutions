// Last updated: 6/2/2026, 11:40:39 AM
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
18        if (root==null) return new ArrayList<>();
19        List<Integer> ls = new ArrayList<>();
20        Stack<TreeNode> st = new Stack<>();
21        TreeNode curr = root;
22        
23
24        while (!st.isEmpty() || curr!=null){
25            while (curr!=null){
26                st.push(curr);
27                curr = curr.left;
28            }
29            TreeNode temp = st.pop();
30            ls.add(temp.val);
31            curr = temp.right;
32        }
33        return ls;
34    }
35    
36}
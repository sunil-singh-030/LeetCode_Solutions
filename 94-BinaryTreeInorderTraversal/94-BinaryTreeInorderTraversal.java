// Last updated: 6/13/2026, 8:18:20 AM
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
18        List<Integer> ls = new ArrayList<>();
19        if (root==null) return ls;
20        
21        Stack<TreeNode> st = new Stack<>();
22        TreeNode curr = root;
23        while (!st.isEmpty() || curr!=null){
24
25            while (curr!=null){
26                st.push(curr);
27                curr = curr.left;
28            }
29
30            TreeNode temp = st.pop();
31            ls.add(temp.val);
32            curr = temp.right;
33        }
34        return ls;
35    }
36
37    
38    
39}
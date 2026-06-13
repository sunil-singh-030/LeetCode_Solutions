// Last updated: 6/13/2026, 8:23:56 AM
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
20
21        Stack<TreeNode> st1 = new Stack<>();
22        Stack<TreeNode> st2 = new Stack<>();
23
24        st1.push(root);
25
26        while (!st1.isEmpty()){
27            TreeNode curr = st1.pop();
28            st2.push(curr);
29            
30            if (curr.left!=null){
31                st1.push(curr.left);
32            }
33            if (curr.right!=null){
34                st1.push(curr.right);
35            }
36
37        }
38        while (!st2.isEmpty()){
39            ls.add(st2.pop().val);
40        }
41        
42        return ls;
43    }
44    
45}
// Last updated: 5/17/2026, 9:47:39 PM
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
18        List<Integer> ans = new ArrayList<>();
19        if (root==null) return ans;
20        Stack<TreeNode> st = new Stack<>();
21        st.push(root);
22        while (!st.isEmpty()){
23            TreeNode currNode = st.pop();
24            ans.add(currNode.val);
25            if (currNode.right!=null){
26                st.push(currNode.right);
27            }
28            if (currNode.left!=null){
29                st.push(currNode.left);
30            }
31        }
32        return ans;
33    }
34    
35}
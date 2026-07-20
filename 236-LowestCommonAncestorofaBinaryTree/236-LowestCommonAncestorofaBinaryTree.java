// Last updated: 7/20/2026, 9:05:38 AM
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
11    static TreeNode lca;
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) { // O(N)
13
14            
15        helper(root,p,q);
16        
17        return lca;
18
19
20
21    }
22
23    public boolean helper(TreeNode curr, TreeNode p, TreeNode q){  // O(N)
24        
25        if (curr==null) return false;
26        if (curr==p || curr==q){
27            lca = curr;
28            return true;
29        }
30        boolean left = helper(curr.left,p,q);
31        boolean right = helper(curr.right,p,q);
32
33        if (left && right){
34            lca = curr;
35        }
36        
37        
38        return left || right;
39    }   
40
41
42}
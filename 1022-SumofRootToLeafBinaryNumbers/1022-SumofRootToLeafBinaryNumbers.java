// Last updated: 2/24/2026, 10:14:18 AM
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
17    static int ans;
18    public int sumRootToLeaf(TreeNode root) {
19        ans = 0;
20        jaiBabaKi(root,0);
21        return ans;
22    }
23    public void jaiBabaKi(TreeNode curr, int sum){
24        
25        if (curr.left==null && curr.right==null){
26            ans += sum*2+curr.val;
27            return;
28        }
29        if (curr.left!=null){
30            jaiBabaKi(curr.left,sum*2+curr.val);
31        }
32        if (curr.right!=null){
33            jaiBabaKi(curr.right,sum*2+curr.val);
34        }
35        
36    }
37}
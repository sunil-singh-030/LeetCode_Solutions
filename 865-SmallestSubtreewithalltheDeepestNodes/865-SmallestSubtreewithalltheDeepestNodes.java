// Last updated: 1/9/2026, 10:31:27 AM
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
17    TreeNode ans;
18    int currHeight;
19    public TreeNode subtreeWithAllDeepest(TreeNode root) {
20        ans = null;
21        currHeight = 0;
22        maxDepth(root,0);
23        return ans;
24    }
25    public int maxDepth(TreeNode curr, int h){
26        if (curr==null){
27            return 0;
28        }
29        int leftDepth = maxDepth(curr.left,h+1);
30        int rightDepth = maxDepth(curr.right,h+1);
31        if (leftDepth==rightDepth){
32            if (h+leftDepth>=currHeight){
33                ans = curr;
34                currHeight = h + leftDepth;
35            }
36        }
37        return 1 + Math.max(leftDepth,rightDepth);
38    }
39}
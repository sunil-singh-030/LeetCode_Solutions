// Last updated: 7/21/2026, 9:34:50 AM
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
17    public int countDominantNodes(TreeNode root) {
18        int[] ans = new int[1];
19    	maxVal(root,ans);
20    	return ans[0];
21    }
22    
23    public int maxVal(TreeNode curr, int[] ans){
24    	if (curr==null) return 0;
25    	int leftMax = maxVal(curr.left,ans);
26    	int rightMax = maxVal(curr.right,ans);
27    	
28    	if (curr.val>=Math.max(leftMax,rightMax)){
29    		ans[0]++;
30    	}
31    	
32    	return Math.max(curr.val,Math.max(leftMax,rightMax));
33    }
34
35}
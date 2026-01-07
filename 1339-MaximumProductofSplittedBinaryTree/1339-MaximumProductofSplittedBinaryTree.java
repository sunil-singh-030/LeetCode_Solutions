// Last updated: 1/7/2026, 7:43:13 PM
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
17    HashMap<TreeNode,Integer> tsumMap;
18    int tsum;
19    public int maxProduct(TreeNode root) {
20        tsumMap = new HashMap<>();
21        tsum = helper(root);
22        return (int) (maxPro(root)%1000000007);
23        
24    }
25    public long maxPro(TreeNode curr){
26        if (curr==null){
27            return 0;
28        }
29        int cSum = tsumMap.get(curr);
30        long c1 = (((long) cSum) * ((long) (tsum-cSum)));
31        long c2 = maxPro(curr.left);
32        long c3 = maxPro(curr.right);
33        return (Math.max(c1,Math.max(c2,c3)));
34    }
35
36    public int helper(TreeNode curr){
37        if (curr==null){
38            return 0;
39        }
40        int lsum = helper(curr.left);
41        int rsum = helper(curr.right);
42        tsumMap.put(curr,lsum+rsum+curr.val);
43        return lsum+rsum+curr.val;
44    }
45
46}
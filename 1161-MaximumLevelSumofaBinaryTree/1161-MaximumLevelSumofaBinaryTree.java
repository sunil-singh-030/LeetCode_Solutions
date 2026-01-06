// Last updated: 1/6/2026, 10:23:29 AM
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
17    public int maxLevelSum(TreeNode root) {
18        int ans = Integer.MIN_VALUE;
19        int level = -1;
20        int idx = 1 ; 
21        Queue<TreeNode> q = new LinkedList<>();
22        q.offer(root);
23        while (!q.isEmpty()){
24            int currsum = 0;
25            int size = q.size();
26            for (int i=0 ; i<size ; i++){
27                TreeNode currNode = q.poll();
28                currsum += currNode.val;
29                if (currNode.left!=null) q.offer(currNode.left);
30                if (currNode.right!=null) q.offer(currNode.right);
31            }
32            if (currsum>ans){
33                ans = currsum;
34                level = idx;
35            }
36            idx++;
37        }
38        return level;
39    }
40}
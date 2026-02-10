// Last updated: 2/10/2026, 10:47:57 AM
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
17    public boolean isEvenOddTree(TreeNode root) {
18        Queue<TreeNode> q = new LinkedList<>();
19        int level = 0;
20        q.add(root);
21        while (!q.isEmpty()){
22            int size = q.size();
23            int prevVal = 0;
24            if (level%2==1){
25                prevVal = Integer.MAX_VALUE;
26            }
27            for (int i=0 ; i<size ; i++){
28                TreeNode node = q.poll();
29                int val = node.val;
30                if (level%2==0){
31                    if (val%2==0 || val<=prevVal){
32                        return false;
33                    }
34                }
35                else{
36                    if (val%2==1 || val>=prevVal){
37                        return false;
38                    }
39                }
40                prevVal = val;
41                if (node.left!=null){
42                    q.add(node.left);
43                }
44                if (node.right!=null){
45                    q.add(node.right);
46                }
47            }
48            
49            level++;
50        }
51        return true;
52    }
53}
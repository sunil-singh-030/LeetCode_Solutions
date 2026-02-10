// Last updated: 2/10/2026, 10:42:38 AM
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
23            List<Integer> ls = new ArrayList<>();
24            for (int i=0 ; i<size ; i++){
25                TreeNode node = q.poll();
26                ls.add(node.val);
27                if (node.left!=null){
28                    q.add(node.left);
29                }
30                if (node.right!=null){
31                    q.add(node.right);
32                }
33            }
34            if (level%2==0){
35                for (int num : ls){
36                    if (num%2==0){
37                        return false;
38                    }
39                }
40                for (int i=1 ; i<size ; i++){
41                    if (ls.get(i)<=ls.get(i-1)){
42                        return false;
43                    }
44                }
45            }
46            else{
47                for (int num : ls){
48                    if (num%2==1){
49                        return false;
50                    }
51                }
52                for (int i=1 ; i<size ; i++){
53                    if (ls.get(i)>=ls.get(i-1)){
54                        return false;
55                    }
56                }
57            }
58            level++;
59        }
60        return true;
61    }
62}
// Last updated: 2/10/2026, 10:30:05 AM
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
17    public TreeNode reverseOddLevels(TreeNode root) {
18        Queue<TreeNode> q = new LinkedList<>();
19        TreeNode temp = root;
20        boolean swap = false;
21        q.add(temp);
22        while (!q.isEmpty()){
23            int size = q.size();
24            List<TreeNode> ls = new ArrayList<>();
25            for (int i=0 ; i<size ; i++){
26                ls.add(q.poll());
27            }
28            if (swap){
29                for (int i=0 ; i<size/2 ; i++){
30                    int tempVal = ls.get(i).val;
31                    ls.get(i).val = ls.get(size-1-i).val;
32                    ls.get(size-1-i).val = tempVal;
33                }
34            }
35            for (TreeNode node : ls){
36                if (node.left!=null){
37                    q.add(node.left);
38                }
39                if (node.right!=null){
40                    q.add(node.right);
41                }
42            }
43
44            swap = !swap;
45            
46        }
47        return root;
48    }
49}
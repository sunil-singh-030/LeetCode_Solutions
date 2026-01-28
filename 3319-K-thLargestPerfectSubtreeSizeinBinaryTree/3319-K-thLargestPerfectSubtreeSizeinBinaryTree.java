// Last updated: 1/28/2026, 2:59:57 PM
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
17    List<Integer> ls;
18    public int kthLargestPerfectSubtree(TreeNode root, int k) {
19        ls = new ArrayList<>();
20        helper(root);
21        Collections.sort(ls,(a,b)->b-a);
22        if (ls.size()>=k){
23            return ls.get(k-1);
24        }
25        return -1;
26    }
27    public int[] helper(TreeNode curr){
28        if (curr==null){
29            return new int[]{0,0};
30        }
31        if (curr.left==null && curr.right==null){
32            ls.add(1);
33            return new int[]{1,1};
34        }
35        int[] lchild = helper(curr.left);
36        int[] rchild = helper(curr.right);
37        if (lchild[0]==1 && rchild[0]==1){
38            if (lchild[1]==rchild[1]){
39                ls.add(1+(2*lchild[1]));
40                return new int[]{1,1+(2*lchild[1])};
41            }
42        }
43        return new int[]{0,1+(2*lchild[1])};
44
45    }
46}
// Last updated: 2/10/2026, 11:15:24 AM
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
18    public int maxSumBST(TreeNode root) {
19        ans = 0;
20        jaiBabaKi(root);
21        return ans;
22    }
23    public int[] jaiBabaKi(TreeNode curr){
24        if (curr.left==null && curr.right==null){
25            ans = Math.max(ans,curr.val);
26            return new int[]{curr.val,curr.val,curr.val};
27        }
28        if (curr.left!=null){
29            int[] left = jaiBabaKi(curr.left);
30            if (curr.right!=null){
31                int[] right = jaiBabaKi(curr.right);
32                if (curr.val>left[1] && curr.val<right[0]){
33                    if (left[0]<=left[1] && right[0]<=right[1]){
34                        ans = Math.max(ans,left[2]+right[2]+curr.val);
35                    }
36                    
37                    return new int[]{left[0],right[1],left[2]+right[2]+curr.val};
38                }
39                return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,left[2]+right[2]+curr.val};
40            }
41            else{
42                if (curr.val>left[1] && left[0]<=left[1]){
43                    ans = Math.max(ans,left[2]+curr.val);
44                    return new int[]{left[0],curr.val,left[2]+curr.val};
45                }
46                return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,left[2]+curr.val};
47            }
48        }
49        else{
50            int[] right = jaiBabaKi(curr.right);
51            if (curr.val<right[0] && right[0]<=right[1]){
52                ans = Math.max(ans,right[2]+curr.val);
53                return new int[]{curr.val,right[1],right[2]+curr.val};
54            }
55            return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,right[2]+curr.val};
56        }
57        
58        
59        
60        
61    }
62}
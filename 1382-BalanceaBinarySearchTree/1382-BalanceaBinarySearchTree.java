// Last updated: 2/9/2026, 10:51:26 AM
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
17    public TreeNode balanceBST(TreeNode root) {
18        List<Integer> ls = new ArrayList<>();
19        TreeNode temp = root;
20        Stack<TreeNode> st = new Stack<>();
21        while (temp!=null || !st.isEmpty()){
22            while (temp!=null){
23                st.push(temp);
24                temp = temp.left;
25            }
26            TreeNode curr = st.pop();
27            ls.add(curr.val);
28            if (curr.right!=null){
29                temp = curr.right;
30            }
31        }
32        
33        return jaiBabaKi(ls,0,ls.size()-1);
34    }
35    public TreeNode jaiBabaKi(List<Integer> ls, int st, int end){
36        if (st>end){
37            return null;
38        }
39        int idx = (st+end)/2;
40        TreeNode newNode = new TreeNode(ls.get(idx));
41        newNode.left = jaiBabaKi(ls,st,idx-1);
42        newNode.right = jaiBabaKi(ls,idx+1,end);
43        return newNode;
44    }
45    
46}
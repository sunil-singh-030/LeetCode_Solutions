// Last updated: 8/1/2025, 7:09:56 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        int cntlevel = 0;
        if (root==null){
            return 0;
        }
        TreeNode temp = root;
        while (temp!=null){
            cntlevel++;
            temp = temp.left;
        }
        int nodecnt = ((int) (Math.pow(2,cntlevel-1)))-1;
        int[] nodelastlevel = new int[1];
        nodelastlevel[0] = -1;
        check(root,nodelastlevel,0,cntlevel);
        if (nodelastlevel[0]==-1){
            nodecnt += (int) Math.pow(2,cntlevel-1);
            return nodecnt;
        }
        return nodecnt+nodelastlevel[0];
    }
    public static void check(TreeNode curr, int[] arr, int colIndex, int tlevel){
        if (arr[0]!=-1){
            return;
        }
        if (curr==null){
            return;
        }
        if (curr.left==null && curr.right==null){
            if (tlevel!=1) arr[0] = 2*(colIndex);
            return;
        }
        if (curr.left!=null && curr.right==null){
            arr[0] = 2*(colIndex) + 1;
            return;
        }
        check(curr.left,arr,colIndex*2,tlevel-1);
        check(curr.right,arr,colIndex*2+1,tlevel-1);
    }
    
}
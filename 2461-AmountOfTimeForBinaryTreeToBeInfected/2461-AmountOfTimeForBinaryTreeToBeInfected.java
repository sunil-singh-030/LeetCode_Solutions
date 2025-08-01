// Last updated: 8/1/2025, 7:03:36 AM
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
    public int amountOfTime(TreeNode root, int start) {
        int[] ans = new int[1];
        distFromStart(root,start,ans);
        return ans[0];
    }
    public static int maxheight(TreeNode currnode){
        if (currnode==null){
            return -1;
        }
        if (currnode.left==null && currnode.right==null){
            return 0;
        }
        int leftheight = 1 + maxheight(currnode.left) ;
        int rightheight = 1 + maxheight(currnode.right);
        return Math.max(leftheight,rightheight);
    }
    public static int distFromStart(TreeNode currnode , int start , int[] ans){
        if (currnode==null){
            return -1;
        }
        if (currnode.val==start){
            int maxTime = 0;
            if (currnode.left!=null){
            maxTime = 1 + maxheight(currnode.left);
            }
            if (currnode.right!=null){
            maxTime = Math.max(maxTime,1+maxheight(currnode.right));
            }
            ans[0] = Math.max(ans[0],maxTime);
            return 0;
        }
        int leftchild = distFromStart(currnode.left,start,ans);
        if (leftchild!=-1){
            int rightTreeTime = 0;
            if (currnode.right!=null){
                rightTreeTime = 1 + maxheight(currnode.right);
            }
            int maxTime = 1 + rightTreeTime + leftchild;
            ans[0] = Math.max(ans[0],maxTime);
            return 1 + leftchild;
        }
        int rightchild = distFromStart(currnode.right,start,ans);
        if (rightchild!=-1){
            int leftTreeTime = 0;
            if (currnode.left!=null){
                leftTreeTime = 1 + maxheight(currnode.left);
            }
            int maxTime = 1 + leftTreeTime + rightchild;
            ans[0] = Math.max(ans[0],maxTime);
            return 1 + rightchild;
        }
        return -1;
    }
}
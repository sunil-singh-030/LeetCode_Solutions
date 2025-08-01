// Last updated: 8/1/2025, 7:08:31 AM
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root==null){
            return null;
        }
        TreeNode curr = root;
        TreeNode prev = root;
        while (curr!=null){
            if (curr.val>key){
                prev = curr;
                curr = curr.left;
            }
            else if (curr.val<key){
                prev = curr;
                curr = curr.right;
            }
            else{
                if (curr==root){
                    if (curr.left==null){
                        root = root.right;
                    }
                    else{
                        TreeNode last = curr.left;
                        while (last.right!=null){
                            last = last.right;
                        }
                        last.right = curr.right;
                        curr.right = null;
                        root = root.left;
                    }
                }
                if (curr.left==null){
                    if (prev.left==curr){
                        prev.left = curr.right;
                    }
                    else{
                        prev.right = curr.right;
                    }
                }
                else{
                    TreeNode temp = curr.right;
                    TreeNode last = curr.left;
                    while (last.right!=null){
                        last = last.right;
                    }
                    curr.right = null;
                    last.right = temp;
                    if (prev.left==curr){
                        prev.left = curr.left;
                    }
                    else{
                        prev.right = curr.left;
                    }
                }
                break;
            }
        }
        return root;
    }
}
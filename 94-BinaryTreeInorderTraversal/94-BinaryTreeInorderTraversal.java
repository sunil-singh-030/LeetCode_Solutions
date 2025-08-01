// Last updated: 8/1/2025, 7:11:32 AM
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        TreeNode curr = root;
        while (curr!=null){
            if (curr.left==null){
                inorder.add(curr.val);
                curr = curr.right;
            }
            else{
                TreeNode temp = curr.left;
                while (temp.right!=null && temp.right!=curr){
                    temp = temp.right;
                }
                if (temp.right==curr){
                    temp.right = null;
                    inorder.add(curr.val);
                    curr = curr.right;
                }
                else{
                    temp.right = curr;
                    curr = curr.left;
                }
            }
        }
        return inorder;
    }
    
}
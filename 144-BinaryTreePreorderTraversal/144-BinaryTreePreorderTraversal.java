// Last updated: 8/1/2025, 7:10:41 AM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        TreeNode curr = root;
        while (curr!=null){
            int val = curr.val;
            if (curr.left==null){
                preorder.add(val);
                curr = curr.right;
            }
            else{
                TreeNode temp = curr.left;
                while (temp.right!=null && temp.right!=curr){
                    temp = temp.right;
                }
                if (temp.right==curr){
                    temp.right = null;
                    curr = curr.right;
                }
                else{
                    preorder.add(val);
                    temp.right = curr;
                    curr = curr.left;
                }
                
            }
        }
        return preorder;
    }
    
}
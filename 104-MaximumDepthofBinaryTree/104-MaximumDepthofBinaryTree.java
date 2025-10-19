// Last updated: 10/19/2025, 9:11:22 AM
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
    public int maxDepth(TreeNode root) {
        int cntOfLevel = 0;
        if (root==null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            cntOfLevel++;
            int size = q.size();
            for (int i=0 ; i<size ; i++){
                TreeNode currNode = q.poll();
                if (currNode.left!=null) q.offer(currNode.left);
                if (currNode.right!=null) q.offer(currNode.right);
            }	
        }
        return cntOfLevel;
    }
    
}
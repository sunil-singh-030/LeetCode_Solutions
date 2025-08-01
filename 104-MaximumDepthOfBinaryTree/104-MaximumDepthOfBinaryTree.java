// Last updated: 8/1/2025, 7:11:21 AM
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
        Queue<TreeNode> queue = new LinkedList<>();
        if (root==null){
            return 0;
        }
        int height = 0;
        queue.offer(root);
        while (!queue.isEmpty()){
            height++;
            int size = queue.size();
            for (int i=0 ; i<size ; i++){
                TreeNode currnode = queue.poll();
                if (currnode.left!=null) queue.offer(currnode.left);
                if (currnode.right!=null) queue.offer(currnode.right);
            }
        }
        return height;
    }
    
}
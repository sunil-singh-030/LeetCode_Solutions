// Last updated: 12/19/2025, 11:58:55 AM
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
    public int maxLevelSum(TreeNode root) {
        int ans = Integer.MIN_VALUE;
        int level = -1;
        int idx = 1 ; 
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int currsum = 0;
            int size = q.size();
            for (int i=0 ; i<size ; i++){
                TreeNode currNode = q.poll();
                currsum += currNode.val;
                if (currNode.left!=null) q.offer(currNode.left);
                if (currNode.right!=null) q.offer(currNode.right);
            }
            if (currsum>ans){
                ans = currsum;
                level = idx;
            }
            idx++;
        }
        return level;
    }
}
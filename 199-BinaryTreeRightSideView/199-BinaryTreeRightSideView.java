// Last updated: 8/1/2025, 7:10:12 AM
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root==null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i=0 ; i<size-1 ; i++){
                TreeNode  curr = queue.poll();
                if (curr.left!=null) queue.offer(curr.left);
                if (curr.right!=null) queue.offer(curr.right);
            }
            TreeNode  curr = queue.poll();
            if (curr.left!=null) queue.offer(curr.left);
            if (curr.right!=null) queue.offer(curr.right);
            ans.add(curr.val);
        }
        return ans;
    }
}
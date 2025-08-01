// Last updated: 8/1/2025, 7:11:22 AM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzagtrav = new ArrayList<>();
        if (root==null){
            return zigzagtrav;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;
        while (!queue.isEmpty()){
            List<Integer> currList = new ArrayList<>();
            int size = queue.size();
            if (!reverse){
                for (int i=0 ; i<size ; i++){
                    TreeNode curr = queue.poll();
                    currList.add(curr.val);
                    if (curr.left!=null) queue.offer(curr.left);
                    if (curr.right!=null) queue.offer(curr.right);
                }
            }
            else{
                for (int i=0 ; i<size ; i++){
                    TreeNode curr = queue.poll();
                    currList.add(curr.val);
                    if (curr.left!=null) queue.offer(curr.left);
                    if (curr.right!=null) queue.offer(curr.right);
                }
                Collections.reverse(currList);
            }
            zigzagtrav.add(currList);
            reverse = !reverse;
        }
        return zigzagtrav;
    }
}
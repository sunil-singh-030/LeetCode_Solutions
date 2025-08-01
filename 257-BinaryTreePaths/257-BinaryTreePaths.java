// Last updated: 8/1/2025, 7:09:36 AM
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> allways = new ArrayList<>();
        if (root==null){
            return allways;
        }
        findallWays(root,new StringBuilder(),allways);
        return allways;
    }
    public static void findallWays(TreeNode curr, StringBuilder sb, List<String> ls){
        if (curr==null){
            return;
        }
        if (curr.left==null && curr.right==null){
            sb.append(curr.val);
            ls.add(sb.toString());
            return;
        }
        sb.append(curr.val+"->");
        findallWays(curr.left,new StringBuilder(sb),ls);
        findallWays(curr.right,new StringBuilder(sb),ls);
        return;
    }
}
// Last updated: 8/1/2025, 7:11:17 AM
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        HashMap<Integer,Integer> inorderMap = new HashMap<>();
        for (int i=0 ; i<n ; i++){
            inorderMap.put(inorder[i],i);
        }
        return buildTree(postorder,0,n-1,inorder,0,n-1,inorderMap);
    }
    public static TreeNode buildTree(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd, HashMap<Integer,Integer> inorderMap){
        if (postStart>postEnd || inStart>inEnd){
            return null;
        }
        int rootval = postorder[postEnd];
        int rootIndex = inorderMap.get(rootval);
        int sizeleftTree = rootIndex-inStart;

        TreeNode root = new TreeNode(rootval);

        root.left = buildTree(postorder,postStart,postStart+sizeleftTree-1,inorder,inStart,rootIndex-1,inorderMap);
        root.right = buildTree(postorder,postStart+sizeleftTree,postEnd-1,inorder,rootIndex+1,inEnd,inorderMap);
        return root;
    }
}
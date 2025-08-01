// Last updated: 8/1/2025, 7:11:19 AM
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        HashMap<Integer,Integer> valIndex = new HashMap<>();
        for (int i=0 ; i<n ; i++){
            valIndex.put(inorder[i],i);
        }
        return buildTree(preorder,0,n-1,inorder,0,n-1,valIndex);
    }
    public static TreeNode buildTree(int[] preorder, int stpre, int endpre, int[] inorder, int stin, int endin, HashMap<Integer,Integer> valIndex){
        if (stpre>endpre || stin>endin){
            return null;
        }
        TreeNode root = new TreeNode(preorder[stpre]);
        int rootIndex = valIndex.get(preorder[stpre]);
        int sizeleftTree = rootIndex-stin;

        root.left = buildTree(preorder,stpre+1,stpre+sizeleftTree,inorder,stin,rootIndex-1,valIndex);
        root.right = buildTree(preorder,stpre+sizeleftTree+1,endpre,inorder,rootIndex+1,endin,valIndex);
        return root;
    }
}
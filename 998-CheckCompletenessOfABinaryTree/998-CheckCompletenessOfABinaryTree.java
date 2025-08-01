// Last updated: 8/1/2025, 7:06:27 AM
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
 
class Pair{
    int colIndex;
    TreeNode node;
    public Pair(TreeNode node, int colIndex){
        this.node = node;
        this.colIndex = colIndex;
    }
}
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        boolean isfound = false;
        queue.offer(new Pair(root,0));
        int req = 1;
        while (!queue.isEmpty()){
            int size = queue.size();
            if (size!=req){
                if (isfound){
                    return false;
                }
                isfound = true;
            }
            int firstCol = -1;
            int lastCol = -1;
            for (int i=0 ; i<size ; i++){
                Pair pair = queue.poll();
                int colIndex = pair.colIndex;
                TreeNode curr = pair.node;
                if (i==0){
                    firstCol = colIndex;
                }
                if (i==size-1){
                    lastCol = colIndex;
                }
                if (curr.left!=null) queue.offer(new Pair(curr.left,colIndex*2));
                if (curr.right!=null) queue.offer(new Pair(curr.right,1 + colIndex*2));
            }
            if (firstCol!=0 ||  lastCol-firstCol+1!=size){
                return false;
            }
            req *= 2;
            System.out.println(size);
        }
        return true;
    }
}
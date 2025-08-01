// Last updated: 8/1/2025, 7:06:23 AM
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
    class Pair{
        TreeNode node;
        int colIndex;
        public Pair(TreeNode node,int colInd){
            this.node = node;
            this.colIndex = colInd;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        int[] col = new int[2];
        fn(root,col,0);
        int colcnt = -col[0] + col[1] + 1;
        List<List<Integer>> verticalTrav = new ArrayList<>();
        for (int i=0 ; i<colcnt ; i++){
            verticalTrav.add(new ArrayList<>());
        }
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,-col[0]));
        while (!queue.isEmpty()){
            int size = queue.size();
            List<PriorityQueue<Integer>> currList = new ArrayList<>();
            for (int i=0 ; i<colcnt ; i++){
                currList.add(new PriorityQueue<>());
            }
            for (int i=0 ; i<size ; i++){
                Pair pair = queue.poll();
                TreeNode currnode = pair.node;
                int colIndex = pair.colIndex;
                currList.get(colIndex).offer(currnode.val);
                if (currnode.left!=null) queue.offer(new Pair(currnode.left,colIndex-1));
                if (currnode.right!=null) queue.offer(new Pair(currnode.right,colIndex+1));
            }
            for (int i=0 ; i<colcnt ; i++){
                PriorityQueue<Integer> pq = currList.get(i);
                while (!pq.isEmpty()){
                    verticalTrav.get(i).add(pq.poll());
                }
            }

        }
        return verticalTrav;
    }
    public static void fn(TreeNode curr, int[] col , int colIndex){
        if (curr==null){
            return;
        }
        col[0] = Math.min(col[0],colIndex);
        col[1] = Math.max(col[1],colIndex);
        fn(curr.left,col,colIndex-1);
        fn(curr.right,col,colIndex+1);
        return ;
    }
}
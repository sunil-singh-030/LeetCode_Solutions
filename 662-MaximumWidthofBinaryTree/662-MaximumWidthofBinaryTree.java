// Last updated: 8/14/2025, 10:59:27 AM
class Pair{
    TreeNode node;
    int index;
    public Pair(TreeNode node, int ind){
        this.node = node;
        this.index = ind;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,1));
        while (!q.isEmpty()){
            int size = q.size();
            int lind = -1;
            int rind = -1;
            for (int i=0 ; i<size ; i++){
                Pair currPair = q.poll();
                if (i==0){
                    lind = currPair.index;
                }
                if (i==size-1){
                    rind = currPair.index;
                }
                if (currPair.node.left!=null) q.offer(new Pair(currPair.node.left,2*currPair.index + 1));
                if (currPair.node.right!=null) q.offer(new Pair(currPair.node.right,2*currPair.index + 2));
            }
            ans = Math.max(ans,rind-lind+1);
        }
        return ans;
    }
}

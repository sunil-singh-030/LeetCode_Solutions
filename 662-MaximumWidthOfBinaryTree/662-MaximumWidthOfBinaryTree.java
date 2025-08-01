// Last updated: 8/1/2025, 7:07:46 AM
class Pair {
    int colIndex;
    TreeNode node;

    public Pair(int colIndex, TreeNode node) {
        this.colIndex = colIndex;
        this.node = node;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int ans = 1;
        int currleftInd = 0;
        int currrightInd = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(0, root));

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Pair pair = queue.poll();
                int colIndex = pair.colIndex;
                TreeNode currnode = pair.node;
                if (i == 0) currleftInd = colIndex;
                if (i == size - 1) currrightInd = colIndex;

                if (currnode.left != null) queue.offer(new Pair(colIndex * 2, currnode.left));
                if (currnode.right != null) queue.offer(new Pair(colIndex * 2 + 1, currnode.right));
            }

            int currans = currrightInd - currleftInd + 1;
            ans = Math.max(ans, currans);
        }

        return ans;
    }
}

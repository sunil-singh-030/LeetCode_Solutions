// Last updated: 8/1/2025, 7:07:49 AM
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;

        Stack<TreeNode> st1 = new Stack<>();  // in-order
        Stack<TreeNode> st2 = new Stack<>();  // reverse in-order

        pushLeft(st1, root);
        pushRight(st2, root);

        TreeNode left = st1.peek();
        TreeNode right = st2.peek();

        while (left != right) {
            int sum = left.val + right.val;
            if (sum == k) return true;
            if (sum < k) {
                next(st1);
                left = st1.peek();
            } else {
                prev(st2);
                right = st2.peek();
            }
        }
        return false;
    }

    private void pushLeft(Stack<TreeNode> st, TreeNode node) {
        while (node != null) {
            st.push(node);
            node = node.left;
        }
    }

    private void pushRight(Stack<TreeNode> st, TreeNode node) {
        while (node != null) {
            st.push(node);
            node = node.right;
        }
    }

    private void next(Stack<TreeNode> st) {
        TreeNode node = st.pop();
        pushLeft(st, node.right);
    }

    private void prev(Stack<TreeNode> st) {
        TreeNode node = st.pop();
        pushRight(st, node.left);
    }
}

// Last updated: 8/1/2025, 7:10:21 AM
class BSTIterator {
    private Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        pushLeftPath(root);
    }

    public int next() {
        TreeNode node = stack.pop();
        pushLeftPath(node.right);
        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void pushLeftPath(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}

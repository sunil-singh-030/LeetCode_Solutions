// Last updated: 8/1/2025, 7:11:29 AM
class Solution {
    public void recoverTree(TreeNode root) {
        TreeNode node1 = null, node2 = null;
        TreeNode prev = null;
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left == null) {
                if (prev != null && curr.val < prev.val) {
                    if (node1 == null) node1 = prev;
                    node2 = curr;
                }
                prev = curr;
                curr = curr.right;
            } else {
                TreeNode pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if (pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    pred.right = null;
                    if (prev != null && curr.val < prev.val) {
                        if (node1 == null) node1 = prev;
                        node2 = curr;
                    }
                    prev = curr;
                    curr = curr.right;
                }
            }
        }

        if (node1 != null && node2 != null) {
            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
        }
    }
}

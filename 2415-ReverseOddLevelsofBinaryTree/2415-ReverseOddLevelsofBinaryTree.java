// Last updated: 2/10/2026, 10:36:43 AM
1class Solution {
2
3    public TreeNode reverseOddLevels(TreeNode root) {
4        traverseDFS(root.left, root.right, 0);
5        return root;
6    }
7
8    private void traverseDFS(
9        TreeNode leftChild,
10        TreeNode rightChild,
11        int level
12    ) {
13        if (leftChild == null || rightChild == null) {
14            return;
15        }
16
17        if (level % 2 == 0) {
18            int temp = leftChild.val;
19            leftChild.val = rightChild.val;
20            rightChild.val = temp;
21        }
22
23        traverseDFS(leftChild.left, rightChild.right, level + 1);
24        traverseDFS(leftChild.right, rightChild.left, level + 1);
25    }
26}
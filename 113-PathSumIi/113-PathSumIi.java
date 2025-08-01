// Last updated: 8/1/2025, 7:11:10 AM
class Solution {
    static List<List<Integer>> ls = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ls = new ArrayList<>();
        if (root == null) {
            return ls;
        }
        List<Integer> path = new ArrayList<>();
        path.add(root.val);
        check(root, targetSum, root.val, path);
        return ls;
    }

    public static void check(TreeNode node, int target, int sum, List<Integer> path) {
        if (node.left == null && node.right == null) {
            if (sum == target) {
                ls.add(new ArrayList<>(path));  // Add a copy of the current path
            }
            return;
        }

        if (node.left != null) {
            path.add(node.left.val);
            check(node.left, target, sum + node.left.val, path);
            path.remove(path.size() - 1);  // Backtrack
        }
        if (node.right != null) {
            path.add(node.right.val);
            check(node.right, target, sum + node.right.val, path);
            path.remove(path.size() - 1);  // Backtrack
        }
    }
}

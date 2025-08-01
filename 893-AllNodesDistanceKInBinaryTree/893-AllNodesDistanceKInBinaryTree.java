// Last updated: 8/1/2025, 7:07:02 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, target, k, ans);
        return ans;
    }

    public static int dfs(TreeNode curr, TreeNode target, int k, List<Integer> ans) {
        if (curr == null) return -1;

        if (curr == target) {
            addNode(curr, ans, k);
            return 0;
        }

        int leftDist = dfs(curr.left, target, k, ans);
        if (leftDist != -1) {
            if (leftDist + 1 == k) {
                ans.add(curr.val);
            } else {
                addNode(curr.right, ans, k - leftDist - 2);
            }
            return leftDist + 1;
        }

        int rightDist = dfs(curr.right, target, k, ans);
        if (rightDist != -1) {
            if (rightDist + 1 == k) {
                ans.add(curr.val);
            } else {
                addNode(curr.left, ans, k - rightDist - 2);
            }
            return rightDist + 1;
        }

        return -1;
    }

    public static void addNode(TreeNode curr, List<Integer> ans, int k) {
        if (curr == null) return;
        if (k == 0) {
            ans.add(curr.val);
            return;
        }
        addNode(curr.left, ans, k - 1);
        addNode(curr.right, ans, k - 1);
    }
}

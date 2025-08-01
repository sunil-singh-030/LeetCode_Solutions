// Last updated: 8/1/2025, 7:08:18 AM
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
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        fn(root,map);
        int maxFreq = Integer.MIN_VALUE;
        int freqcnt = 0;
        for (int val : map.values()){
            if (val>maxFreq){
                maxFreq = val;
                freqcnt = 1;
            }
            else if (val==maxFreq){
                freqcnt++;
            }
        }
        int[] ans = new int[freqcnt];
        int ind = 0;
        for (int key : map.keySet()){
            if (map.get(key)==maxFreq){
                ans[ind] = key;
                ind++;
            }
        }
        return ans;
    }
    public static int fn(TreeNode root, HashMap<Integer,Integer> map){
        if (root==null){
            return 0;
        }
        int currsum = root.val + fn(root.left,map) + fn(root.right,map);
        map.put(currsum,map.getOrDefault(currsum,0)+1);
        return currsum;
    }
}
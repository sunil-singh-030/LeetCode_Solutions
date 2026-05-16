// Last updated: 5/16/2026, 12:39:00 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        int n = nums.length;
4        Arrays.sort(nums);
5        return nums[n-k];
6    }
7}
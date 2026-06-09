// Last updated: 6/9/2026, 5:43:55 PM
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        long ans = 0;
4        int n = nums.length;
5        Arrays.sort(nums);
6        ans = k*( (long) (nums[n-1]-nums[0]));
7        return ans;
8    }
9}
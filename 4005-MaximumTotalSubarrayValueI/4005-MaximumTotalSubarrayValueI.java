// Last updated: 12/19/2025, 11:54:31 AM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long ans = 0;
        int n = nums.length;
        Arrays.sort(nums);
        ans = k*( (long) (nums[n-1]-nums[0]));
        return ans;
    }
}
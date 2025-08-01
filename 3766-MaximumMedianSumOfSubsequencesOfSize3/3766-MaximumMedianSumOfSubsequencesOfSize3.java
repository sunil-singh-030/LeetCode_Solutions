// Last updated: 8/1/2025, 7:01:33 AM
class Solution {
    public long maximumMedianSum(int[] nums) {
        int req = nums.length/3;
        long ans = 0;
        Arrays.sort(nums);
        int ind = nums.length-2;
        while (req-->0){
            ans += nums[ind];
            ind -= 2;
        }
        return ans;
    }
}
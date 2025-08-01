// Last updated: 8/1/2025, 7:04:19 AM
class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int max = nums[n-1];
        int ans = -1;
        for (int i=n-2 ; i>=0 ; i--){
            if (nums[i]<max){
                ans = Math.max(ans,max-nums[i]);
            }
            max = Math.max(max,nums[i]);
        }
        return ans;
    }
}
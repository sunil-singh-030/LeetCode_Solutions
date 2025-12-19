// Last updated: 12/19/2025, 11:54:33 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int ans = 2;
        int curr = 2;
        for (int i=2 ; i<n ; i++){
            long sum1 = nums[i-1];
            sum1 += nums[i-2];
            long sum2 = (long) nums[i];
            if (sum2==sum1){
                curr++;
            }
            else{
                ans = Math.max(ans,curr);
                curr = 2;
            }
        }
        ans = Math.max(ans,curr);
        return ans;
    }
}
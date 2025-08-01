// Last updated: 8/1/2025, 7:07:53 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = -10000;
        double sum = 0.0;
        for (int i=0 ; i<k ; i++){
            sum += nums[i];
        }
        double avgsum = sum/k;
        ans = Math.max(ans,avgsum);
        for (int i=k ; i<nums.length ; i++){
            sum -= nums[i-k];
            sum += nums[i];
            avgsum = sum/k;
            ans = Math.max(ans,avgsum);
        }
        return ans;
    }
}
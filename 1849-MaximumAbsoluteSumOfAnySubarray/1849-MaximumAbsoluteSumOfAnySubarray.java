// Last updated: 8/1/2025, 7:04:44 AM
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int minsum = 0;
        int sum = 0;
        for (int i=0 ; i<n ; i++){
            sum += nums[i];
            if (sum>=0){
                sum = 0;
            }
            else{
                minsum = Math.min(minsum,sum);
            }
        }

        int maxsum = 0;
        sum = 0;
        for (int i=0 ; i<n ; i++){
            sum += nums[i];
            if (sum<1){
                sum = 0;
            }
            else{
                maxsum = Math.max(sum,maxsum);
            }
        }
        return Math.max(Math.abs(minsum),maxsum);
    }
}
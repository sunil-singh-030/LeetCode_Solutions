// Last updated: 8/1/2025, 7:04:36 AM
class Solution {
    public int maxAscendingSum(int[] nums) {
        int msum = 0;
        int sum = nums[0];
        for (int i=1 ; i<nums.length ; i++){
            if (nums[i]>nums[i-1]){
                sum += nums[i];
            }
            else{
                msum = Math.max(sum,msum);
                sum = nums[i];
            }
        }
        msum = Math.max(sum,msum);
        return msum;
    }
}
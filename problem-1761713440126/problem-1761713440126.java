// Last updated: 10/29/2025, 10:20:40 AM
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for (int i=0 ; i<n ; i++){
            if (nums[i]<0){
                nums[i] = -nums[i];
            }
        }
        Arrays.sort(nums);
        long minSum = 0;
        long maxSum = 0;
        for (int i=0 ; i<n/2 ; i++){
            minSum += nums[i]*nums[i];
        }
        for (int i=n/2 ; i<n ; i++){
            maxSum += nums[i]*nums[i];
        }
        return maxSum-minSum;
    }
}
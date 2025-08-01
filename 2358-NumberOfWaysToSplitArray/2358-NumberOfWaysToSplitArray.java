// Last updated: 8/1/2025, 7:03:45 AM
class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        long tsum=0;
        for(int num:nums){
            tsum+=num;
        }
        int count=0;
        for (int i=0;i<nums.length-1;i++){
            sum+=nums[i];
            if (2*sum>=tsum){
                count++;
            }
        }
        return count;
    }
}
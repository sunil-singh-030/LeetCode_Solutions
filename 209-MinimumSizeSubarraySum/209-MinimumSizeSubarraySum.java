// Last updated: 8/1/2025, 7:10:06 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = nums.length+1;
        int start = 0;
        int index  = 0;
        long sum = 0;
        while (index<nums.length){
            sum += nums[index];
            if (sum>=target){
                while (sum>=target){
                    sum-=nums[start];
                    start++;
                }
                ans=Math.min(ans,index-start+2);
            }
            index++;
        }
        if (ans==nums.length+1){
            return 0;
        }
        return ans;
    }
}
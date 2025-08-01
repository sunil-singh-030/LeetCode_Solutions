// Last updated: 8/1/2025, 7:01:42 AM
class Solution {
    public int subarraySum(int[] nums) {
        int [] psum=new int[nums.length];
        int sum=nums[0];
        psum[0]=sum;
        for (int i=1;i<nums.length;i++){
            sum+=nums[i];
            psum[i]=sum;
        }
        int ans=0;
        for (int i=0;i<nums.length;i++){
            int start=Math.max(0,i-nums[i]);
            ans+=psum[i]-psum[start]+nums[start];
        }
        return ans;
    }
}
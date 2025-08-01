// Last updated: 8/1/2025, 7:01:39 AM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ans=0;
        int num=nums[0];
        for (int i=1;i<nums.length;i++){
            ans=Math.max(ans,Math.abs(num-nums[i]));
            num=nums[i];
        }
        ans=Math.max(ans,Math.abs(num-nums[0]));
        return ans;
    }
}
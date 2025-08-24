// Last updated: 8/24/2025, 7:45:44 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long cnt = 0;
        for (int i=0 ; i<nums.length ; i++){
            if (nums[i]==0){
                cnt++;
                ans += cnt;
            }
            else{
                cnt = 0;
            }
        }
        return ans;
    }
}
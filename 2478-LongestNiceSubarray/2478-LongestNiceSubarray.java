// Last updated: 8/1/2025, 7:03:31 AM
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int ans=1;
        int sind=0;
        int cind=0;
        while (cind<nums.length){
            int num=nums[cind];
            for (int i=cind-1;i>=sind;i--){
                if ((nums[i] & num)!=0){
                    sind=i+1;
                    break;
                }
            }
            ans=Math.max(ans,cind-sind+1);
            cind++;
        }
        return ans;
    }
}
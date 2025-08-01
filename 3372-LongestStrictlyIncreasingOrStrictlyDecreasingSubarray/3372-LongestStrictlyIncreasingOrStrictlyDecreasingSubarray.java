// Last updated: 8/1/2025, 7:02:30 AM
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int leni = 1;
        int deci = 1;
        int len1 = 1;
        int len2 = 1;
        for (int i=0 ; i<nums.length-1 ; i++ ){
            if (nums[i]>nums[i+1]){
                len2++;
            }
            else{
                deci = Math.max(deci,len2);
                len2 = 1;
            }
            if (nums[i]<nums[i+1]){
                len1++;
            }
            else{
                leni = Math.max(leni,len1);
                len1 = 1;
            }
        }
        deci = Math.max(deci,len2);
        leni = Math.max(leni,len1);
        return Math.max(leni,deci);
    }
}
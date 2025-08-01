// Last updated: 8/1/2025, 7:07:36 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c=0;
        int p=1;
        int cind=0;
        int start=0;
        while (cind<nums.length){
            // grow
            p*=nums[cind];
            // shrink
            while (start<=cind && p>=k){
                p/=nums[start];
                start++;
            }
            // ans update
            c+=(cind-start+1);
            cind++;
        }
        return c;
    }
}
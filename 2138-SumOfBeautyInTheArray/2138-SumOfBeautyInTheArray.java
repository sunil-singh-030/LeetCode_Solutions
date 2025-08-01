// Last updated: 8/1/2025, 7:04:21 AM
class Solution {
    public int sumOfBeauties(int[] nums) {
        int sum = 0;
        int n = nums.length;
        long[] lmax  = new long[n];
        lmax[0] = -1;
        for (int i=1 ; i<n ; i++){
            lmax[i] = Math.max(lmax[i-1],nums[i-1]);
        }
        long[] rmin = new long[n];
        rmin[n-1] = nums[n-1];
        for (int i=n-2 ; i>=0 ; i--){
            rmin[i] = Math.min(rmin[i+1],nums[i+1]);
        }
        for (int i=1 ; i<n-1 ; i++){
            if (nums[i]>lmax[i] && nums[i]<rmin[i]){
                sum += 2;
                continue;
            }
            if (nums[i]>nums[i-1] && nums[i]<nums[i+1]){
                sum += 1;
                continue;
            }
        }
        return sum;
    }
}
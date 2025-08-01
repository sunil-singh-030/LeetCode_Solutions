// Last updated: 8/1/2025, 7:02:46 AM
class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n<3){
            return 0;
        }
        long ans = 0;
        long[] lmax = new  long[n];
        lmax[0] = -1;
        long max = nums[0];
        for (int i=1 ; i<n ; i++){
            max = Math.max(max,nums[i-1]);
            lmax[i] = max;
        }
        long[] rmax = new long[n];
        rmax[n-1] = -1;
        max = nums[n-1];
        for (int i=n-2 ; i>=0 ; i--){
            max = Math.max(max,nums[i+1]);
            rmax[i] = max;
        }
        for (int i=1 ; i<n-1 ; i++){
            ans = Math.max(ans,(lmax[i]-nums[i])*rmax[i]);
        }
        return ans;
    }
}
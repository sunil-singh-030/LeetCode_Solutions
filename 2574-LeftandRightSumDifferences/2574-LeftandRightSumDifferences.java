// Last updated: 6/6/2026, 6:18:19 AM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n = nums.length;
4        int[] lsum = new int[n];
5        for (int i=1 ; i<n ; i++){
6            lsum[i] = lsum[i-1] + nums[i-1];
7        }
8        int rsum = nums[n-1];
9        for (int i=n-2 ; i>=0 ; i--){
10            lsum[i] = Math.abs(lsum[i]-rsum);
11            rsum += nums[i];
12        }
13        return lsum;
14    }
15}
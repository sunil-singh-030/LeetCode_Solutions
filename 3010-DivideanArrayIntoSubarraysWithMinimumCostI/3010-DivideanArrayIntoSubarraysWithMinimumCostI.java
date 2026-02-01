// Last updated: 2/1/2026, 7:53:47 AM
1class Solution {
2    public int minimumCost(int[] nums) {
3        int ans = Integer.MAX_VALUE;
4        int n = nums.length;
5        for (int i=1 ; i<n-1 ; i++){
6            for (int j=i+1 ; j<n ; j++){
7                ans = Math.min(ans,nums[0]+nums[i]+nums[j]);
8            }
9        }
10        return ans;
11    }
12}
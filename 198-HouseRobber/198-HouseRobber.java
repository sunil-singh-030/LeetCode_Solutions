// Last updated: 5/16/2026, 11:12:07 AM
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        int[] dp = new int[n+1];
5        dp[n-1] = nums[n-1];
6        for (int i=n-2 ; i>=0 ; i--){
7            int skip = dp[i+1];
8            int rob = nums[i] + dp[i+2];
9            dp[i] = Math.max(skip,rob);
10        }
11        return dp[0];
12    }
13    
14}
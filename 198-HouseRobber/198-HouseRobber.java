// Last updated: 5/16/2026, 11:07:34 AM
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        int[] dp = new int[n+1];
5        Arrays.fill(dp,-1);
6        return helper(nums,0,dp);
7    }
8    public int helper(int[] nums, int idx, int[] dp){
9        if (idx>=nums.length){
10            return 0;
11        }
12        if (dp[idx]!=-1) return dp[idx];
13        int skip = helper(nums,idx+1,dp);
14        int rob = nums[idx] + helper(nums,idx+2,dp);
15        return dp[idx] = Math.max(skip,rob);
16    }
17}
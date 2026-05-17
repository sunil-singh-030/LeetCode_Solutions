// Last updated: 5/17/2026, 7:11:50 AM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        Arrays.fill(dp,-1);
6        return helper(nums,0,dp);
7    }
8    public boolean helper(int[] nums, int idx, int[] dp){
9        if (idx>=nums.length-1){
10            return true;
11        }
12        if (dp[idx]!=-1) return dp[idx]==1;
13        int jumps = nums[idx];
14        for (int i=idx+1 ; i<=idx+jumps ; i++){
15            if (helper(nums,i,dp)) {
16                dp[idx] = 1;
17                return true;
18            }
19        }
20        dp[idx] = 0;
21        return false;
22    }
23}
// Last updated: 5/16/2026, 11:53:51 AM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n = nums.length;
4        int ans = 1;
5        int[] dp = new int[n];
6        Arrays.fill(dp,1);
7        for (int i=0 ; i<n ; i++){
8            for (int j=i-1 ; j>=0 ; j--){
9                if (nums[i]>nums[j]){
10                    dp[i] = Math.max(dp[i],1+dp[j]);
11                }
12            }
13            ans = Math.max(ans,dp[i]);
14        }
15        return ans;
16    }
17}
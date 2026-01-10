// Last updated: 1/10/2026, 1:01:44 PM
1class Solution {
2    public long maxStrength(int[] nums) {
3        int n = nums.length;
4        long[][] dp = new long[n+1][2];
5        dp[0][0] = dp[0][1] = 1;
6        long max = Long.MIN_VALUE;
7        for (int num : nums){
8            max = Math.max(max,(long) num);
9        }
10        boolean check = false;
11        for (int i=0 ; i<n ; i++){
12            long num = (long) nums[i];
13            long currMin = Math.min(dp[i][0]*num,dp[i][1]*num);
14            long currMax = Math.max(dp[i][0]*num,dp[i][1]*num);
15            if (currMax==1){
16                check = true;
17            }
18            dp[i+1][0] = Math.min(dp[i][0],currMin);
19            dp[i+1][1] = Math.max(dp[i][1],currMax);
20        }
21        if (dp[n][1]!=1){
22            return dp[n][1];
23        }
24        return check ? 1 : max;
25    }
26    
27}
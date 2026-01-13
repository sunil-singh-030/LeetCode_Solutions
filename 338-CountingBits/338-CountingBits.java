// Last updated: 1/13/2026, 4:03:04 PM
1class Solution {
2    public int[] countBits(int n) {
3        int dp[] = new int[n + 1];
4        if(n == 0) return dp;
5        dp[0] = 0;
6        dp[1] = 1;
7
8        
9        for(int i = 2; i <= n; i++){
10            if(i % 2 == 0) dp[i] = dp[i/2];
11            else dp[i] = 1 + dp[i - 1];
12        }
13        return dp;
14    }
15}
// Last updated: 5/1/2026, 8:50:11 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int m = text1.length();
4        int n = text2.length();
5        int[][] dp = new int[m+1][n+1];
6        
7        for (int i=1 ; i<=m ; i++){
8            for (int j=1 ; j<=n ; j++){
9                char ch1 = text1.charAt(i-1);
10                char ch2 = text2.charAt(j-1);
11                if (ch1==ch2){
12                    dp[i][j] = 1 + dp[i-1][j-1];
13                }
14                else{
15                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
16                }
17            }
18        }
19        return dp[m][n];
20    }
21    
22}
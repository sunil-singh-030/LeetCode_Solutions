// Last updated: 5/16/2026, 11:46:51 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int m = text1.length();
4        int n = text2.length();
5        int[][] dp = new int[m+1][n+1];
6        for (int i=m-1 ; i>=0 ; i--){
7            for (int j=n-1 ; j>=0 ; j--){
8                char ch1 = text1.charAt(i);
9                char ch2 = text2.charAt(j);
10                if (ch1==ch2){
11                    int res = 1 + dp[i+1][j+1];
12                    dp[i][j] = res;
13                }
14                else{
15                    int skipA = 0 + dp[i+1][j];
16                    int skipB = 0 + dp[i][j+1];
17                    dp[i][j] = Math.max(skipA,skipB);
18                }
19            }
20        }
21        return dp[0][0];
22    }
23    
24}
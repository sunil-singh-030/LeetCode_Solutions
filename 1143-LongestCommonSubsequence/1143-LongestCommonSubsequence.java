// Last updated: 7/21/2026, 9:50:44 PM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        
4        int m = text1.length();
5        int n = text2.length();
6        
7        int[][] dp = new int[m+1][n+1];
8        
9        for (int i=m-1 ; i>=0 ; i--){
10            for (int j=n-1 ; j>=0 ; j--){
11                char ch1 = text1.charAt(i);
12                char ch2 = text2.charAt(j);
13
14                if (ch1==ch2){
15                    dp[i][j] = 1 + dp[i+1][j+1];
16                }
17                else{
18                    int skipA = 0 + dp[i+1][j];
19                    int skipB = 0 + dp[i][j+1];
20                    
21                    dp[i][j] = Math.max(skipA,skipB);
22                }
23            }
24        }
25        
26        return dp[0][0];
27    }
28
29    
30
31}
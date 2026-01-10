// Last updated: 1/10/2026, 12:22:18 PM
1class Solution {
2    public int minimumDeleteSum(String s1, String s2) {
3        int m = s1.length();
4        int n = s2.length();
5        int[][] dp = new int[m+1][n+1];
6        for (int i=n-1 ; i>=0 ; i--){
7            dp[m][i] = dp[m][i+1] + 97 + (s2.charAt(i)-'a');
8        }
9        for (int i=m-1 ; i>=0 ; i--){
10            dp[i][n] = dp[i+1][n] + 97 + (s1.charAt(i)-'a');
11        }
12        for (int i=m-1 ; i>=0 ; i--){
13            for (int j=n-1 ; j>=0 ; j--){
14                char ch1 = s1.charAt(i);
15                char ch2 = s2.charAt(j);
16                if (ch1==ch2){
17                    dp[i][j] = dp[i+1][j+1];
18                }
19                else{
20                    int skipA = (ch1-'a') + dp[i+1][j];
21                    int skipB = (ch2-'a') + dp[i][j+1];
22                    dp[i][j] = Math.min(skipA,skipB)+97;
23                }
24            }
25        }
26        return dp[0][0];
27        
28    }
29}
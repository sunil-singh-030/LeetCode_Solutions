// Last updated: 1/4/2026, 12:14:59 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m = word1.length();
4        int n = word2.length();
5        int[][] dp = new int[m+1][n+1];
6        for (int j=0 ; j<=n ; j++){
7            dp[0][j] = j;
8        }
9        for (int i=0 ; i<=m ; i++){
10            dp[i][0] = i;
11        }
12        for (int i=1 ; i<=m ; i++){
13            for (int j=1 ; j<=n ; j++){
14                char ch1 = word1.charAt(i-1);
15                char ch2 = word2.charAt(j-1);
16                if (ch1==ch2){
17                    dp[i][j] = dp[i-1][j-1];
18                }
19                else{
20                    int insert = 1 + dp[i][j-1];
21                    int del = 1 + dp[i-1][j];
22                    int repl = 1 + dp[i-1][j-1];
23                    dp[i][j] = Math.min(insert,Math.min(del,repl));
24                }
25            }
26        }
27        return dp[m][n];
28    }
29    // public int helper(String s1, String s2, int i, int j, int[][] dp){
30    //     if (i<0){
31    //         return j+1;
32    //     }
33    //     if (j<0){
34    //         return i+1;
35    //     }
36    //     if (dp[i+1][j+1]!=-1){
37    //         return dp[i+1][j+1];
38    //     }
39    //     char ch1 = s1.charAt(i);
40    //     char ch2 = s2.charAt(j);
41
42    //     if (ch1==ch2){
43    //         return dp[i+1][j+1] = helper(s1,s2,i-1,j-1,dp);
44    //     }
45    //     else{
46    //         int insert = 1 + helper(s1,s2,i,j-1,dp);
47    //         int del = 1 + helper(s1,s2,i-1,j,dp);
48    //         int repl = 1 + helper(s1,s2,i-1,j-1,dp);
49    //         return dp[i+1][j+1] = Math.min(insert,Math.min(del,repl));
50    //     }
51    // }
52}
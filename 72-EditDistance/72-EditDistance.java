// Last updated: 1/4/2026, 12:33:37 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m = word1.length();
4        int n = word2.length();
5        int[] prev = new int[n+1];
6        int[] curr = new int[n+1];
7        for (int j=0 ; j<=n ; j++){
8            prev[j] = j;
9        }
10        for (int i=1 ; i<=m ; i++){
11            for (int j=0 ; j<=n ; j++){
12                if (j==0){
13                    curr[j] = i;
14                    continue;
15                }
16                char ch1 = word1.charAt(i-1);
17                char ch2 = word2.charAt(j-1);
18                if (ch1==ch2){
19                    curr[j] = prev[j-1];
20                }
21                else{
22                    int insert = 1 + curr[j-1];
23                    int del = 1 + prev[j];
24                    int repl = 1 + prev[j-1];
25                    curr[j] = Math.min(insert,Math.min(del,repl));
26                }
27            }
28            prev = curr.clone();
29        }
30        return prev[n];
31    }
32    // public int helper(String s1, String s2, int i, int j, int[][] dp){
33    //     if (i<0){
34    //         return j+1;
35    //     }
36    //     if (j<0){
37    //         return i+1;
38    //     }
39    //     if (dp[i+1][j+1]!=-1){
40    //         return dp[i+1][j+1];
41    //     }
42    //     char ch1 = s1.charAt(i);
43    //     char ch2 = s2.charAt(j);
44
45    //     if (ch1==ch2){
46    //         return dp[i+1][j+1] = helper(s1,s2,i-1,j-1,dp);
47    //     }
48    //     else{
49    //         int insert = 1 + helper(s1,s2,i,j-1,dp);
50    //         int del = 1 + helper(s1,s2,i-1,j,dp);
51    //         int repl = 1 + helper(s1,s2,i-1,j-1,dp);
52    //         return dp[i+1][j+1] = Math.min(insert,Math.min(del,repl));
53    //     }
54    // }
55}
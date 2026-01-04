// Last updated: 1/4/2026, 12:35:02 PM
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
11            curr[0] = i;
12            for (int j=1 ; j<=n ; j++){
13                
14                char ch1 = word1.charAt(i-1);
15                char ch2 = word2.charAt(j-1);
16                if (ch1==ch2){
17                    curr[j] = prev[j-1];
18                }
19                else{
20                    int insert = 1 + curr[j-1];
21                    int del = 1 + prev[j];
22                    int repl = 1 + prev[j-1];
23                    curr[j] = Math.min(insert,Math.min(del,repl));
24                }
25            }
26            prev = curr.clone();
27        }
28        return prev[n];
29    }
30    // public int helper(String s1, String s2, int i, int j, int[][] dp){
31    //     if (i<0){
32    //         return j+1;
33    //     }
34    //     if (j<0){
35    //         return i+1;
36    //     }
37    //     if (dp[i+1][j+1]!=-1){
38    //         return dp[i+1][j+1];
39    //     }
40    //     char ch1 = s1.charAt(i);
41    //     char ch2 = s2.charAt(j);
42
43    //     if (ch1==ch2){
44    //         return dp[i+1][j+1] = helper(s1,s2,i-1,j-1,dp);
45    //     }
46    //     else{
47    //         int insert = 1 + helper(s1,s2,i,j-1,dp);
48    //         int del = 1 + helper(s1,s2,i-1,j,dp);
49    //         int repl = 1 + helper(s1,s2,i-1,j-1,dp);
50    //         return dp[i+1][j+1] = Math.min(insert,Math.min(del,repl));
51    //     }
52    // }
53}
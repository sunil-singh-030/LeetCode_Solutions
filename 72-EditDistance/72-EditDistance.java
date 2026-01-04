// Last updated: 1/4/2026, 11:58:06 AM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m = word1.length();
4        int n = word2.length();
5        int[][] dp = new int[m+1][n+1];
6        for (int[] a : dp){
7            Arrays.fill(a,-1);
8        }
9        return helper(word1,word2,m-1,n-1,dp);
10    }
11    public int helper(String s1, String s2, int i, int j, int[][] dp){
12        if (i<0){
13            return j+1;
14        }
15        if (j<0){
16            return i+1;
17        }
18        if (dp[i+1][j+1]!=-1){
19            return dp[i+1][j+1];
20        }
21        char ch1 = s1.charAt(i);
22        char ch2 = s2.charAt(j);
23
24        if (ch1==ch2){
25            return dp[i+1][j+1] = helper(s1,s2,i-1,j-1,dp);
26        }
27        else{
28            int insert = 1 + helper(s1,s2,i,j-1,dp);
29            int del = 1 + helper(s1,s2,i-1,j,dp);
30            int repl = 1 + helper(s1,s2,i-1,j-1,dp);
31            return dp[i+1][j+1] = Math.min(insert,Math.min(del,repl));
32        }
33    }
34}
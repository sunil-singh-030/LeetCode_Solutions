// Last updated: 5/1/2026, 8:44:32 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int m = text1.length();
4        int n = text2.length();
5        int[][] dp = new int[m][n];
6        for (int[] a : dp){
7            Arrays.fill(a,-1);
8        }
9        return helper(text1,m-1,text2,n-1,dp);
10    }
11    public int helper(String s1, int idx1, String s2, int idx2, int[][] dp){
12        if (idx1<0 || idx2<0){
13            return 0;
14        }
15        if (dp[idx1][idx2]!=-1) return dp[idx1][idx2];
16        char ch1 = s1.charAt(idx1);
17        char ch2 = s2.charAt(idx2);
18
19        if (ch1==ch2){
20            return dp[idx1][idx2] = 1 + helper(s1,idx1-1,s2,idx2-1,dp);
21        }
22        else{
23            int skipCh1 = 0 + helper(s1,idx1-1,s2,idx2,dp);
24            int skipCh2 = 0 + helper(s1,idx1,s2,idx2-1,dp);
25            return dp[idx1][idx2] = Math.max(skipCh1,skipCh2);
26        }
27    }
28}
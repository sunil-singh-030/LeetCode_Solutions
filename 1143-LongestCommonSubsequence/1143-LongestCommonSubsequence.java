// Last updated: 5/16/2026, 11:44:10 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int m = text1.length();
4        int n = text2.length();
5        int[][] dp = new int[m][n];
6        for (int[] arr : dp){
7            Arrays.fill(arr,-1);
8        }
9        return helper(text1,text2,0,0,dp);
10    }
11    public int helper(String text1, String text2, int idx1, int idx2, int[][] dp){
12        if (idx1>=text1.length() || idx2>=text2.length()){
13            return 0;
14        }
15        if (dp[idx1][idx2]!=-1) return dp[idx1][idx2];
16        char ch1 = text1.charAt(idx1);
17        char ch2 = text2.charAt(idx2);
18        if (ch1==ch2){
19            int res = 1 + helper(text1,text2,idx1+1,idx2+1,dp);
20            return dp[idx1][idx2] = res;
21        }
22        else{
23            int skipA = 0 + helper(text1,text2,idx1+1,idx2,dp);
24            int skipB = 0 + helper(text1,text2,idx1,idx2+1,dp);
25            return dp[idx1][idx2] = Math.max(skipA,skipB);
26        }
27    }
28}
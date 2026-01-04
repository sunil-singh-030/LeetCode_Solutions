// Last updated: 1/4/2026, 12:05:43 PM
1class Solution {
2    public int minInsertions(String s) {
3        int n = s.length();
4        int[][] dp = new int[n][n];
5        for (int[] a : dp){
6            Arrays.fill(a,-1);
7        }
8        return helper(s,0,n-1,dp);
9    }
10    public int helper(String s, int i, int j, int[][] dp){
11        if (i>=j){
12            return 0;
13        }
14        if (dp[i][j]!=-1){
15            return dp[i][j];
16        }
17        char ch1 = s.charAt(i);
18        char ch2 = s.charAt(j);
19        if (ch1==ch2){
20            return dp[i][j] = helper(s,i+1,j-1,dp);
21        }
22        else{
23            int insLeft = 1 + helper(s,i,j-1,dp);
24            int insRight = 1 + helper(s,i+1,j,dp);
25            return dp[i][j] = Math.min(insLeft,insRight);
26        }
27    }
28}
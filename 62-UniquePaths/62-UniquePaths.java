// Last updated: 1/4/2026, 3:03:10 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[][] dp = new int[m][n];
4        for (int[] a : dp){
5            Arrays.fill(a,-1);
6        }
7        return helper(m,n,0,0,dp);
8    }
9    public int helper(int m, int n, int r, int c, int[][] dp){
10        if (r==m-1 && c==n-1){
11            return 1;
12        }
13        if (dp[r][c]!=-1){
14            return dp[r][c];
15        }
16        int cnt = 0;
17        if (r+1<m){
18            cnt += helper(m,n,r+1,c,dp);
19        }
20        if (c+1<n){
21            cnt += helper(m,n,r,c+1,dp);
22        }
23        return dp[r][c] = cnt;
24    }
25}
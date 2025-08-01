// Last updated: 8/1/2025, 7:00:50 AM
class Solution {
    public long minCost(int m, int n, int[][] waitCost) {
        long[][] dp = new long[m][n];
        for (long[] a : dp){
            Arrays.fill(a,-1);
        }
        long ans1 = Long.MAX_VALUE-1;
        if (1<n){
            ans1 = min(m,n,0,1,waitCost,dp);
        }
        dp = new long[m][n];
        for (long[] a : dp){
            Arrays.fill(a,-1);
        }
        long ans2 = Long.MAX_VALUE-1;
        if (1<m){
            ans2 = min(m,n,1,0,waitCost,dp);
        }
        return 1+Math.min(ans1,ans2);
    }
    public static long min( int m, int n, int i, int j, int[][] wait, long[][] dp){
        if (i==m-1 && j==n-1){
            return (i+1)*(j+1);
        }
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        long cost = Long.MAX_VALUE;
        if (i+1<m){
            cost = (i+1)*(j+1) + wait[i][j] +min(m,n,i+1,j,wait,dp);
        }
        if (j+1<n){
            cost = Math.min(cost,(i+1)*(j+1) + wait[i][j] + min(m,n,i,j+1,wait,dp));
        }
        return dp[i][j] = cost;
    }
    
}
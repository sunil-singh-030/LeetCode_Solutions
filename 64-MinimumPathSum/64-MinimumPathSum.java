// Last updated: 8/1/2025, 7:11:58 AM
class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] dp = new int[m];
        for (int i=n-1 ; i>=0 ; i--){
            for (int j=m-1 ; j>=0 ; j--){
                if (j==m-1 && i==n-1){
                    dp[j] = grid[i][j];
                    continue;
                }
                if (j==m-1){
                    dp[j] += grid[i][j];
                    continue;
                }
                if (i==n-1){
                    dp[j] = grid[i][j] + dp[j+1];
                    continue;
                }
                dp[j] = grid[i][j] + Math.min(dp[j],dp[j+1]);
            }
        }
        return dp[0];
    }
    
}
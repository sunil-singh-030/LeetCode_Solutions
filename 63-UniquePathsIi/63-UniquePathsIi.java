// Last updated: 8/1/2025, 7:12:00 AM
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        for (int i=m-1 ; i>=0 ; i--){
            for (int j=n-1 ; j>=0 ; j--){
                if (obstacleGrid[i][j]==1){
                    dp[j] = 0;
                    continue;
                }
                if (j!=n-1){
                    dp[j] += dp[j+1];
                    continue;
                }
                if (i==m-1 && j==n-1){
                    dp[j] = 1;
                    continue;
                }
            }
        }
        return dp[0];
    }
    
}
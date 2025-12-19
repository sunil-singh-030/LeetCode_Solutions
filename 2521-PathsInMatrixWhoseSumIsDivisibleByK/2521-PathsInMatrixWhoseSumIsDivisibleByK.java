// Last updated: 12/19/2025, 11:56:46 AM
class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][k];
        for (int[][] a : dp){
            for (int[] b : a){
                Arrays.fill(b,-1);
            }
        }
        return cntWays(grid,0,0,grid[0][0]%k,k,dp);
    }
    public int cntWays(int[][] grid, int i, int j, int dis, int k, int[][][] dp){
        if (i==grid.length-1 && j==grid[0].length-1){
            return dis==0 ? 1 : 0;
        }
        if (dp[i][j][dis]!=-1){
            return dp[i][j][dis];
        }
        int cnt = 0;
        if (i+1<grid.length){
            cnt += cntWays(grid,i+1,j,(dis+grid[i+1][j])%k,k,dp);
        }
        if (j+1<grid[0].length){
            cnt += cntWays(grid,i,j+1,(dis+grid[i][j+1])%k,k,dp);
        }
        return dp[i][j][dis] = cnt%1000000007;
    } 
}
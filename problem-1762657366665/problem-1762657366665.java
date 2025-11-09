// Last updated: 11/9/2025, 8:32:46 AM
class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][k+2];
        for (int[][] a : dp){
            for (int[] b : a){
                Arrays.fill(b,-2);
            }
        }
        return fn(grid,0,0,k,m,n,0,dp);
    }
    public int fn(int[][] grid, int i, int j, int k, int m, int n, int cost,int[][][] dp){
        if (i==m-1 && j==n-1){
            return grid[i][j];
        }
        if (dp[i][j][cost]!=-2){
            return dp[i][j][cost];
        }
        int ans = -1;
        if (i+1<m){
            int currCost = 0;
            if (grid[i+1][j]!=0){
                currCost = 1;
            }
            if ((currCost+cost)<=k){
                int max1 = fn(grid,i+1,j,k,m,n,cost+currCost,dp);
                if (max1!=-1){
                    ans = grid[i][j] + max1;
                }
            }
        }
        if (j+1<n){
            int currCost = 0;
            if (grid[i][j+1]!=0){
                currCost = 1;
            }
            if ((currCost+cost)<=k){
                int max2 = fn(grid,i,j+1,k,m,n,cost+currCost,dp);
                if (max2!=-1){
                    ans = Math.max(ans,grid[i][j] + max2);
                }
            }
        }
        return dp[i][j][cost] = ans;
    }
}
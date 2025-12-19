// Last updated: 12/19/2025, 11:58:50 AM
class Solution {
    public int minFallingPathSum(int[][] grid) {
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] a : dp){
            Arrays.fill(a,-99999);
        }
        for (int i=0 ; i<grid.length ; i++){
            ans = Math.min(ans,minSum(grid,0,i,dp));
        }
        return ans;
    }
    public static int minSum(int[][] grid, int cr, int cc, int[][] dp){
        if (cr==grid.length-1){
            return grid[cr][cc];
        }
        if (dp[cr][cc]!=-99999){
            return dp[cr][cc];
        }
        int curr = Integer.MAX_VALUE;
        for (int i=0 ; i<grid[0].length ; i++){
            if (i!=cc){
                curr = Math.min(curr,minSum(grid,cr+1,i,dp));
            }
        }
        return dp[cr][cc] = curr + grid[cr][cc];
    }
}
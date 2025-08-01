// Last updated: 8/1/2025, 7:05:25 AM
class Solution {
    public int cherryPickup(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        int[][][] dp = new int[n][m][m];
        for (int i=n-1 ; i>=0 ; i--){
            for (int j=m-1 ; j>=0 ; j--){
                for (int k=m-1 ; k>=0 ; k--){
                    if (j==k){
                        dp[i][j][k] = 0;
                        continue;
                    }
                    if (i==n-1){
                        dp[i][j][k] = grid[n-1][j] + grid[n-1][k];
                        continue;
                    }
                    int[] choice1 = {-1,0,1};
                    int[] choice2 = {-1,0,1};
                    int maxsum = 0;
                    for (int k1=0 ; k1<3 ; k1++){
                        for (int l=0 ; l<3 ; l++){
                            int col1 = j+choice1[k1];
                            int col2 = k+choice2[l];
                            if (col1>=0 && col2>=0 && col1<m && col2<m && col1!=col2){
                                maxsum = Math.max(maxsum,dp[i+1][col1][col2]);
                            }
                        }
                    }
                    dp[i][j][k] = maxsum+grid[i][j]+grid[i][k];
                }
            }
        }
        return dp[0][0][m-1];
    }
    
}
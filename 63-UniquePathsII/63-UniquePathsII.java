// Last updated: 1/4/2026, 3:07:41 PM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m = obstacleGrid.length;
4        int n = obstacleGrid[0].length;
5        int[][] dp = new int[m][n];
6        for (int[] a : dp){
7            Arrays.fill(a,-1);
8        }
9        if (obstacleGrid[0][0]==1){
10            return 0;
11        }
12        return helper(obstacleGrid,m,n,0,0,dp);
13    }
14    public int helper(int[][] grid, int m, int n, int r, int c, int[][] dp){
15        if (r==m-1 && c==n-1){
16            return 1;
17        }
18        if (dp[r][c]!=-1){
19            return dp[r][c];
20        }
21        int cnt = 0;
22        if (r+1<m && grid[r+1][c]!=1){
23            cnt += helper(grid,m,n,r+1,c,dp);
24        }
25        if (c+1<n && grid[r][c+1]!=1){
26            cnt += helper(grid,m,n,r,c+1,dp);
27        }
28        return dp[r][c] = cnt;
29    }
30    
31}
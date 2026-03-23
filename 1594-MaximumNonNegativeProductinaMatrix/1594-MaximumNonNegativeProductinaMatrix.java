// Last updated: 3/23/2026, 6:44:36 AM
1class Solution {
2    
3    public int maxProductPath(int[][] grid) {
4        int m = grid.length;
5        int n = grid[0].length;
6        long[][][] dp = new long[m][n][2];
7        boolean[][] vis = new boolean[m][n];
8        long[] res = fn(grid,0,0,dp,vis);
9        res[1] %= 1000000007;
10        int ans = (int) res[1];
11
12        return ans<0 ? -1 : ans;
13    }
14    public long[] fn(int[][] grid, int r, int c, long[][][] dp, boolean[][] vis){
15        if (r==grid.length-1 && c==grid[0].length-1){
16            long val = (long) grid[r][c];
17            return new long[]{val,val};
18        }
19        if (vis[r][c]){
20            return new long[]{dp[r][c][0],dp[r][c][1]};
21        }
22        long currVal = (long) grid[r][c];
23        long min = Long.MAX_VALUE;
24        long max = Long.MIN_VALUE;
25        if (r+1<grid.length){
26            long[] arr1 = fn(grid,r+1,c,dp,vis);
27            min = Math.min(min,currVal*arr1[0]);
28            min = Math.min(min,currVal*arr1[1]);
29            max = Math.max(max,currVal*arr1[0]);
30            max = Math.max(max,currVal*arr1[1]);
31        }
32        if (c+1<grid[0].length){
33            long[] arr2 = fn(grid,r,c+1,dp,vis);
34            min = Math.min(min,currVal*arr2[0]);
35            min = Math.min(min,currVal*arr2[1]);
36            max = Math.max(max,currVal*arr2[0]);
37            max = Math.max(max,currVal*arr2[1]);
38            
39        }
40        vis[r][c] = true;
41        dp[r][c][0] = min;
42        dp[r][c][1] = max;
43        return new long[]{min,max};
44
45    }
46}
// Last updated: 7/17/2026, 11:14:19 PM
1class Solution {
2    public int longestIncreasingPath(int[][] matrix) {
3	
4        int m = matrix.length;
5        int n = matrix[0].length;
6        int[] r = {0,1,0,-1};
7        int[] c = {1,0,-1,0};
8        int maxLen = 1;
9        int[][] dp = new int[m][n];
10        for (int i=0 ; i<m ; i++){
11            for (int j=0 ; j<n ; j++){
12                boolean[][] vis = new boolean[m][n];
13                int currLen = helper(matrix,i,j,r,c,vis,dp);
14                maxLen = Math.max(maxLen,currLen);
15            }
16        }
17
18        return maxLen;
19        
20    }
21
22    public int helper(int[][] matrix, int row, int col, int[] r, int[] c, boolean[][] vis, int[][] dp){
23
24        if (dp[row][col]!=0){
25            return dp[row][col];
26        }
27
28        vis[row][col] = true;
29
30        int currMaxLen = 1;
31        
32        for (int i=0 ; i<4 ; i++){
33            int newR = row + r[i];
34            int newC = col + c[i];
35
36            if (newR<0 || newC<0 || newR>=matrix.length || newC>=matrix[0].length ){
37                continue;
38            }
39
40            if (vis[newR][newC] || matrix[newR][newC]<=matrix[row][col]){
41                continue;
42            }
43            
44            int currRes = helper(matrix,newR,newC,r,c,vis,dp);
45            currMaxLen = Math.max(currMaxLen,1+currRes);
46        }
47        
48        vis[row][col] = false;
49        return dp[row][col] =  currMaxLen;
50        
51    }
52
53
54}
// Last updated: 7/17/2026, 11:21:19 PM
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
12                int currLen = helper(matrix,i,j,r,c,dp);
13                maxLen = Math.max(maxLen,currLen);
14            }
15        }
16
17        return maxLen;
18        
19    }
20
21    public int helper(int[][] matrix, int row, int col, int[] r, int[] c, int[][] dp){
22
23        if (dp[row][col]!=0){
24            return dp[row][col];
25        }
26
27        
28
29        int currMaxLen = 1;
30        
31        for (int i=0 ; i<4 ; i++){
32            int newR = row + r[i];
33            int newC = col + c[i];
34
35            if (newR<0 || newC<0 || newR>=matrix.length || newC>=matrix[0].length ){
36                continue;
37            }
38
39            if (matrix[newR][newC]<=matrix[row][col]){
40                continue;
41            }
42            
43            int currRes = helper(matrix,newR,newC,r,c,dp);
44            currMaxLen = Math.max(currMaxLen,1+currRes);
45        }
46        
47        return dp[row][col] =  currMaxLen;
48        
49    }
50
51
52}
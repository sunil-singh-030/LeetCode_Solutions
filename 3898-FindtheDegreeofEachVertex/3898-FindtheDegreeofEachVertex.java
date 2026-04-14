// Last updated: 4/14/2026, 10:30:05 AM
1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3        int n = matrix.length;
4        int[] ans = new int[n];
5        for (int i=0 ; i<n ; i++){
6            for (int j=0 ; j<n; j++){
7                if (matrix[i][j]==1){
8                    ans[i]++; 
9                }
10            }
11        }
12        return ans;
13    }
14}
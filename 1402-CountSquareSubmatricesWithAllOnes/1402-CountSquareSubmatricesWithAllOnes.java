// Last updated: 8/1/2025, 7:05:46 AM
class Solution {
    public int countSquares(int[][] matrix) {
        int cnt = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] square = new int[n][m];
        for (int i=0 ; i<n ; i++){
            square[i][0] = matrix[i][0];
            cnt += (matrix[i][0]==1 ? 1 : 0);
        }
        for (int i=1 ; i<m ; i++){
            square[0][i] = matrix[0][i];
            cnt += (matrix[0][i]==1 ? 1 : 0);
        }
        for (int i=1 ; i<n; i++){
            for (int j=1 ; j<m ; j++){
                if (matrix[i][j]==0){
                    continue;
                }
                square[i][j] = 1 + Math.min(square[i-1][j-1],Math.min(square[i-1][j],square[i][j-1]));
                cnt += square[i][j];
            }
        }
        return cnt;
    }
}
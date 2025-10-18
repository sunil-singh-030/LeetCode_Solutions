// Last updated: 10/18/2025, 12:25:36 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] rowHasZero = new boolean[m];
        boolean[] colHasZero = new boolean[n];
        for (int i=0 ; i<m ; i++){
            for (int j=0 ; j<n ; j++){
                if (matrix[i][j]==0){
                    rowHasZero[i] = true;
                    colHasZero[j] = true;
                }
            }
        }
        for (int i=0 ; i<m ; i++){
            if (rowHasZero[i]){
                for (int j=0 ; j<n ; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i=0 ; i<n ; i++){
            if (colHasZero[i]){
                for (int j=0 ; j<m ; j++){
                    matrix[j][i] = 0;
                }
            }
        }
        
    }
}
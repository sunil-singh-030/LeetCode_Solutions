// Last updated: 10/18/2025, 12:35:00 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstrowHasZero = false;
        boolean firstcolHasZero = false;
        for (int i=0 ; i<n ; i++){
            if (matrix[0][i]==0){
                firstrowHasZero = true;
                break;
            }
        }
        for (int i=0 ; i<m ; i++){
            if (matrix[i][0]==0){
                firstcolHasZero = true;
                break;
            }
        }
        for (int i=0 ; i<m ; i++){
            for (int j=0 ; j<n ; j++){
                if (matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i=1 ; i<m ; i++){
            if (matrix[i][0]==0){
                for (int j=0 ; j<n ; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i=1 ; i<n ; i++){
            if (matrix[0][i]==0){
                for (int j=0 ; j<m ; j++){
                    matrix[j][i] = 0;
                }
            }
        }
        if (firstrowHasZero){
            for (int i=0 ; i<n ; i++){
                matrix[0][i] = 0;
            }
        }
        if (firstcolHasZero){
            for (int i=0 ; i<m ; i++){
                matrix[i][0] = 0;
            }
        }

    }
}
// Last updated: 9/29/2025, 11:16:03 AM
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean first_r_0 = false;
        boolean first_c_0 = false;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i=0 ; i<m ; i++){
            if (matrix[i][0]==0){
                first_c_0 = true;
                break;
            }
        }
        for (int i=0 ; i<n ; i++){
            if (matrix[0][i]==0){
                first_r_0 = true;
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
        if (first_r_0){
            for (int i=0 ; i<n ; i++){
                matrix[0][i] = 0;
            }
        }
        if (first_c_0){
            for (int i=0 ; i<m ; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
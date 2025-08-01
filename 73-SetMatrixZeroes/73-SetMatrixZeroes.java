// Last updated: 8/1/2025, 7:11:52 AM
class Solution {
    public void setZeroes(int[][] matrix) {
        int [] row1=new int[matrix.length];
        int [] col1=new int[matrix[0].length];
        for (int row=0;row<matrix.length;row++){
            for (int col=0;col<matrix[0].length;col++){
                if (matrix[row][col]==0){
                    row1[row]=1;
                    col1[col]=1;
                }
            }
        }
        for (int row=0;row<matrix.length;row++){
            for (int col=0;col<matrix[0].length;col++){
                if (row1[row]==1 || col1[col]==1){
                    matrix[row][col]=0;
                }
            }
        }
        
    }
}
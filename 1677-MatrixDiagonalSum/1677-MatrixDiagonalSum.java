// Last updated: 8/1/2025, 7:04:56 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int row=0;
        int col=0;
        while (row<mat.length){
            sum+=mat[row][col];
            row++;
            col++;
        }
        row=mat.length-1;
        col=0;
        while (col<mat.length){
            sum+=mat[row][col];
            row--;
            col++;
        }
        if (mat.length%2!=0){
            sum-=mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}
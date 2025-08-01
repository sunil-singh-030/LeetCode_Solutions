// Last updated: 8/1/2025, 7:01:56 AM
class Solution {
    public int minimumOperations(int[][] grid) {
        int sum=0;
        for (int col=0;col<grid[0].length;col++){
            int num=grid[0][col];
            for (int row=1;row<grid.length;row++){
                if (grid[row][col]<=num){
                    sum+=num-grid[row][col]+1;
                    num++;
                }
                else{
                    num=grid[row][col];
                }
            }
        }
        return sum;
    }
}
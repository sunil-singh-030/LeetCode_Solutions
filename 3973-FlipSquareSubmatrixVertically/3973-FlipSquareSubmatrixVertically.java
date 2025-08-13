// Last updated: 8/13/2025, 11:58:46 AM
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int rpl = x+k-1;
        int to = x;
        int chance = k/2;
        while (chance-->0){
        for (int i=y ; i<y+k ; i++){
            int temp = grid[to][i];
            grid[to][i] = grid[rpl][i];
            grid[rpl][i] = temp;
        }
        rpl--;
        to++;
        }
        return grid;
    }
}
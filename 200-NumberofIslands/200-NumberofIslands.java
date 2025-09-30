// Last updated: 9/30/2025, 7:33:36 AM
class Solution {
    public int numIslands(char[][] grid) {
        int cnt = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<m ; j++){
                if (grid[i][j]=='1'){
                    cnt++;
                    khatam(grid,i,j);
                }
            }
        }
        return cnt;
    }
    public static void khatam(char[][] grid , int cr , int cc){
        if (cr<0 || cc<0 || cr>=grid.length || cc>=grid[0].length || grid[cr][cc]=='0'){
            return;
        }
        grid[cr][cc] = '0';
        int[] r = {1,-1,0,0};
        int[] c = {0,0,1,-1};
        for (int i=0 ; i<4 ; i++){
            khatam(grid,cr+r[i],cc+c[i]);
        }
    }
}
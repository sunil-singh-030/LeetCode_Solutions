// Last updated: 8/6/2025, 6:43:58 AM
class Solution {
    public int orangesRotting(int[][] grid) {
        int minTime = 0;
        boolean repeat = true;
        int m = grid.length;
        int n = grid[0].length;
        int[][] newgrid = new int[m][n];
        for (int i=0 ; i<m ; i++){
            newgrid[i] = grid[i].clone();
        }
        while (repeat){
            repeat = false;
            boolean isfresh = false;
            boolean anyrotten = false;
            for (int i=0 ; i<m ; i++){
                for (int j=0 ; j<n ; j++){
                    if (grid[i][j]==0) continue;
                    if (grid[i][j]==1){
                        isfresh = true;
                        continue;
                    }
                    else{
                        int[] r = {-1,0,1,0};
                        int[] c = {0,1,0,-1};
                        for (int k=0 ; k<4 ; k++){
                            if (i+r[k]<0 || i+r[k]>=m || j+c[k]<0 || j+c[k]>=n){
                                continue;
                            }
                            if (grid[i+r[k]][j+c[k]]==1){
                                anyrotten = true;
                                newgrid[i+r[k]][j+c[k]] = 2;
                            }
                        }
                    }
                }
            }
            for (int i=0 ; i<m ; i++){
                grid[i] = newgrid[i].clone();
            }
            if (anyrotten){
                repeat = true;
                minTime++;
            }
            else{
                if (isfresh) return -1;
            }
            
        }
        return minTime;
    }
}
// Last updated: 8/24/2025, 7:44:42 AM
class Solution {
    public int minimumArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] r = new int[n];
        int[] c = new int[m];
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<m ; j++){
                if (grid[i][j]==1){
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }
        int str = -1;
        int endr = -1;
        for (int i=0 ; i<n ; i++){
            if (r[i]==1){
                str = i;
                break;
            }
        }
        for (int i=0 ; i<n ; i++){
            if (r[n-1-i]==1){
                endr = n-1-i;
                break;
            }
        }
        int stc = -1;
        int endc = -1;
        for (int i=0 ; i<m ; i++){
            if (c[i]==1){
                stc = i;
                break;
            }
        }
        for (int i=0 ; i<m ; i++){
            if (c[m-1-i]==1){
                endc = m-1-i;
                break;
            }
        }
        return (endr-str+1)*(endc-stc+1);
    }
}
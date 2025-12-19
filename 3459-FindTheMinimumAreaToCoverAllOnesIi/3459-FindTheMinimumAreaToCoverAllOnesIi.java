// Last updated: 12/19/2025, 11:56:08 AM
class Solution {
    public int minimumSum(int[][] grid) {
        int ans = Integer.MAX_VALUE;
        int m = grid.length;
        int n = grid[0].length;

        // 1st 
        for (int i=0 ; i<m-2 ; i++){
            int a1 = minArea(grid,0,0,i,n-1);
            for (int j=i+1 ; j<m-1 ; j++){
                int a2 = minArea(grid,i+1,0,j,n-1);
                int a3 = minArea(grid,j+1,0,m-1,n-1);
                ans = Math.min(ans,a1+a2+a3);
            }
        }
        //System.out.println("hi");
        // 2nd 
        for (int i=0 ; i<n-2 ; i++){
            int a1 = minArea(grid,0,0,m-1,i);
            for (int j=i+1 ; j<n-1 ; j++){
                int a2 = minArea(grid,0,i+1,m-1,j);
                int a3 = minArea(grid,0,j+1,m-1,n-1);
                ans = Math.min(ans,a1+a2+a3);
            }
        }
        //System.out.println("hi");
        // 3rd 
        for (int i=0 ; i<m-1 ; i++){
            int a1 = minArea(grid,0,0,i,n-1);
            for (int j=0 ; j<n-1 ; j++){
                int a2 = minArea(grid,i+1,0,m-1,j);
                int a3 = minArea(grid,i+1,j+1,m-1,n-1);
                ans = Math.min(ans,a1+a2+a3);
            }
        }
        //System.out.println("hi");
        // 4th
        for (int i=m-1 ; i>0 ; i--){
            int a1 = minArea(grid,i,0,m-1,n-1);
            for (int j=0 ; j<n-1 ; j++){
                int a2 = minArea(grid,0,0,i-1,j);
                int a3 = minArea(grid,0,j+1,i-1,n-1);
                ans = Math.min(ans,a1+a2+a3);
            }
        }
        //System.out.println("hi");
        // 5th
        for (int i=0 ; i<n-1 ; i++){
            int a1 = minArea(grid,0,0,m-1,i);
            for (int j=0 ; j<m-1 ; j++){
                int a2 = minArea(grid,0,i+1,j,n-1);
                int a3 = minArea(grid,j+1,i+1,m-1,n-1);
                ans = Math.min(ans,a1+a2+a3);
            }
        }
        //System.out.println("hi");
        //6th
        for (int i=n-1 ; i>0 ; i--){
            int a1 = minArea(grid,0,i,m-1,n-1);
            for (int j=0 ; j<m-1 ; j++){
                int a2 = minArea(grid,0,0,j,i-1);
                int a3 = minArea(grid,j+1,0,m-1,i-1);
                ans = Math.min(ans,a1+a2+a3);
            }
        }
        return ans;

    }
    public int minArea(int[][] grid, int str, int stc, int endr, int endc){
        // System.out.println(str+" "+stc+" "+endr+" "+endc);
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        for (int i=str ; i<=endr ; i++){
            for (int j=stc ; j<=endc ; j++){
                if (grid[i][j]==1){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        int minr = -1;
        for (int i=str ; i<=endr ; i++){
            if (row[i]==1){
                minr = i;
                break;
            }
        }
        int maxr = -1;
        for (int i=endr ; i>=str ; i--){
            if (row[i]==1){
                maxr = i;
                break;
            }
        }
        int minc = -1;
        for (int i=stc ; i<=endc ; i++){
            if (col[i]==1){
                minc = i;
                break;
            }
        }
        int maxc = -1;
        for (int i=endc ; i>=stc ; i--){
            if (col[i]==1){
                maxc = i;
                break;
            }
        } 
        return (maxr-minr+1)*(maxc-minc+1);
    }
}
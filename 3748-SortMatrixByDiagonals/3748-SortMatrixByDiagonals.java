// Last updated: 8/1/2025, 7:01:37 AM
class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int row = grid.length;
        for (int i = 0 ; i<row ; i++){
            int[] arr = new int[row-i];
            int c = 0;
            int r = i;
            for (int ind=0 ; ind<row-i ; ind++){
                arr[ind] = grid[r][c];
                r++;
                c++;
            }
            Arrays.sort(arr);
            r = i;
            c = 0;
            for (int ind=row-i-1 ; ind>=0 ; ind--){
                grid[r][c] = arr[ind];
                r++;
                c++;
            }
        }
        int col = row;
        for (int i = 1 ; i<col ; i++){
            int[] arr = new int[col-i];
            int c = i;
            int r = 0;
            for (int ind=0 ; ind<col-i ; ind++){
                arr[ind] = grid[r][c];
                r++;
                c++;
            }
            Arrays.sort(arr);
            r = 0;
            c = i;
            for (int ind=0 ; ind<col-i ; ind++){
                grid[r][c] = arr[ind];
                r++;
                c++;
            }
        }
        return grid;
    }
}
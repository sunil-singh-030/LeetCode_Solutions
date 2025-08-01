// Last updated: 8/1/2025, 7:02:38 AM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        int[] arr = new int[(int) (Math.pow(grid.length,2)+1)];
        for (int i=0 ; i<grid.length ; i++){
            for (int j=0 ; j<grid.length ; j++){
                arr[grid[i][j]]++;
            }
        }
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i]==0){
                ans[1] = i;
            }
            if (arr[i]==2){
                ans[0] = i;
            }
        }
        return ans;
    }
}
// Last updated: 8/1/2025, 7:12:19 AM
class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length-1;
        int rmin=0;
        int cmin=0;
        int rmax=n;
        int cmax=n;
        int c=(n+1)/2;
        while (c-->0){
            for (int i=0;i<n;i++){
            int temp1=matrix[rmin][cmin+i];
            int temp2=matrix[rmin+i][cmax];
            int temp3=matrix[rmax][cmax-i];
            int temp4=matrix[rmax-i][cmin];
            matrix[rmin][cmin+i]=temp4;
            matrix[rmin+i][cmax]=temp1;
            matrix[rmax][cmax-i]=temp2;
            matrix[rmax-i][cmin]=temp3;
            }
            n-=2;
            rmin++;
            cmin++;
            rmax--;
            cmax--;
        }
        
    }
}
// Last updated: 9/29/2025, 10:50:33 AM
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int minr = 0;
        int minc = 0;
        int maxr = n-1;
        int maxc = n-1;
        int move = n/2;
        int movecnt = n-1;
        while (move-->0){
            for (int i=0 ; i<movecnt ; i++){
                int temp1 = matrix[minr][minc+i];
                int temp2 = matrix[minr+i][maxc];
                int temp3 = matrix[maxr][maxc-i];
                int temp4 = matrix[maxr-i][minc];
                matrix[minr][minc+i] = temp4;
                matrix[minr+i][maxc] = temp1;
                matrix[maxr][maxc-i] = temp2;
                matrix[maxr-i][minc] = temp3;
            }
            movecnt -= 2;
            minr++;
            minc++;
            maxr--;
            maxc--;
            // for (int[] a : matrix){
            //     System.out.println(Arrays.toString(a));
            // }
        }
        
    }
}
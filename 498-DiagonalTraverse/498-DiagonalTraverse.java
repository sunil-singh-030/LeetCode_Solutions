// Last updated: 8/1/2025, 7:08:19 AM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int [] [] arr=mat;
        int n=mat.length;
        int m=mat[0].length;
        int [] out=new int [n*m];
        int c=0;
        for (int i=0;i<n;i++){
            if (i%2==0){
                int row=i;
                int col=0;
                while (row>=0 && col<m){
                    //System.out.print(arr[row][col]+" ");
                    out[c]=arr[row][col];
                    c++;
                    row--;
                    col++;
                }
            }
            else{
                int row=0;
                int col=i;
                while (col>m-1){
                    col--;
                    row++;
                }
                while (row<n && col>=0){
                    //System.out.print(arr[row][col]+" ");
                    out[c]=arr[row][col];
                    c++;
                    row++;
                    col--;
                }

            }
        }
        if (n%2!=0){
            for (int i=1;i<m;i++){
            if (i%2==0){
                int row=n-1;
                int col=i;
                while (row>=0 && col<m){
                    //System.out.print(arr[row][col]+" ");
                    out[c]=arr[row][col];
                    c++;
                    row--;
                    col++;
                }
            }
            else{
                int row=0;
                int col=i+n-1;
                while (col>m-1){
                    col--;
                    row++;
                }
                //System.out.print("row " + row +"col "+col);
                while (row<n && col>=0){
                    //System.out.print(arr[row][col]+" ");
                    out[c]=arr[row][col];
                    c++;
                    row++;
                    col--;
                }

            }
        }
        }
        else{
            for (int i=1;i<m;i++){
            if (i%2!=0){
                int row=n-1;
                int col=i;
                while (row>=0 && col<m){
                    //System.out.print(arr[row][col]+" ");
                    out[c]=arr[row][col];
                    c++;
                    row--;
                    col++;
                }
            }
            else{
                int row=0;
                int col=i+n-1;
                while (col>m-1){
                    col--;
                    row++;
                }
                //System.out.print("row " + row +"col "+col);
                while (row<n && col>=0){
                    //System.out.print(arr[row][col]+" ");
                    out[c]=arr[row][col];
                    c++;
                    row++;
                    col--;
                }

            }
        }
        }
        
        return out;
    }
}
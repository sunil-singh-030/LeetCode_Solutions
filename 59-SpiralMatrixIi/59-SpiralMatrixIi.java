// Last updated: 8/1/2025, 7:12:03 AM
class Solution {
    public int[][] generateMatrix(int n) {
        int [][] arr=new int[n][n];
        int minr=0;
        int maxr=n-1;
        int minc=0;
        int maxc=n-1;
        int tc=n*n;
        int c=1;
        while (c<=tc){
            for (int i=minc;i<=maxc && c<=tc;i++){
                arr[minr][i]=c;
                c++;
            }
            minr++;
            for (int i=minr;i<=maxr  && c<=tc;i++){
                arr[i][maxc]=c;
                c++;
            }
            maxc--;
            for (int i=maxc;i>=minc  && c<=tc;i--){
                arr[maxr][i]=c;
                c++;
            }
            maxr--;
            for (int i=maxr;i>=minr  && c<=tc;i--){
                arr[i][minc]=c;
                c++;
            }
            minc++;
        }
        return arr;
    }
}
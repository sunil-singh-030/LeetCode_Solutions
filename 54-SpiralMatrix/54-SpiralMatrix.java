// Last updated: 8/1/2025, 7:12:09 AM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls=new ArrayList<>();
        int minr=0;
        int maxr=matrix.length-1;
        int minc=0;
        int maxc=matrix[0].length-1;
        int tc=matrix.length*matrix[0].length;
        int c=0;
        while (c<tc){
            for (int i=minc;i<=maxc && c<tc;i++){
                ls.add(matrix[minr][i]);
                c++;
            }
            minr++;
            for (int i=minr;i<=maxr  && c<tc;i++){
                ls.add(matrix[i][maxc]);
                c++;
            }
            maxc--;
            for (int i=maxc;i>=minc  && c<tc;i--){
                ls.add(matrix[maxr][i]);
                c++;
            }
            maxr--;
            for (int i=maxr;i>=minr  && c<tc;i--){
                ls.add(matrix[i][minc]);
                c++;
            }
            minc++;
        }
        return ls;
    }
}
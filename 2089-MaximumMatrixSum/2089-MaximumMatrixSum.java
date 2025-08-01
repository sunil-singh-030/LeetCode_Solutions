// Last updated: 8/1/2025, 7:04:28 AM
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n=matrix.length;
        long sum=0;
        int negc=0;
        long min=Integer.MAX_VALUE;
        for (int [] row:matrix){
            for(int item:row){
                long element = Math.abs(item);
                sum += element;
                if(min > element){
                    min = element;
                }
                if(item < 0){
                    negc++;
                }
            }
        }
        if (negc%2!=0){
            sum-=2*min;
        }
        return sum;
    }
}
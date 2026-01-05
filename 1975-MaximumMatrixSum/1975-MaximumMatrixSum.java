// Last updated: 1/5/2026, 10:31:22 AM
1class Solution {
2    public long maxMatrixSum(int[][] matrix) {
3        int n=matrix.length;
4        long sum=0;
5        int negc=0;
6        long min=Integer.MAX_VALUE;
7        for (int [] row:matrix){
8            for(int item:row){
9                long element = Math.abs(item);
10                sum += element;
11                if(min > element){
12                    min = element;
13                }
14                if(item < 0){
15                    negc++;
16                }
17            }
18        }
19        if (negc%2!=0){
20            sum-=2*min;
21        }
22        return sum;
23    }
24}
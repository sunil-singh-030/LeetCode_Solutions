// Last updated: 8/1/2025, 7:04:17 AM
class Solution {
    public long gridGame(int[][] grid) {
        long [] prefix1=new long[grid[0].length];
        long [] prefix2=new long[grid[0].length];
        long sum1=0;
        long sum2=0;
        for (int col=0;col<grid[0].length;col++){
            sum1+=grid[0][col];
            prefix1[col]=sum1;
            sum2+=grid[1][col];
            prefix2[col]=sum2;
        }
        long sum=Long.MAX_VALUE;
        for (int col=0;col<grid[0].length;col++){
            long s1=prefix1[grid[0].length-1]-prefix1[col];
            long s2;
            if (col==0){
                s2=0;
            }
            else{
                s2=prefix2[col-1];
            }
            if (sum>Math.max(s1,s2)){
                sum=Math.max(s1,s2);
            }
        }

        
        return sum;
        
    }
}
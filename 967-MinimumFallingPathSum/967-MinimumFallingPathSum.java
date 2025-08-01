// Last updated: 8/1/2025, 7:06:34 AM
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        int n = matrix.length;
        int[] dp = new int[n];
        for (int i=n-1 ; i>=0 ; i--){
            int[] temp = dp.clone();
            for (int j=n-1 ; j>=0 ; j--){
                if (i==n-1){
                    dp[j] = matrix[i][j];
                    continue;
                }
                int sum = Integer.MAX_VALUE;
                sum = Math.min(sum,temp[j]);
                if (j+1<n){
                    sum = Math.min(sum,temp[j+1]);
                }
                if (j-1>=0){
                    sum = Math.min(sum,temp[j-1]);
                }
                dp[j] = matrix[i][j] + sum;
            }
        }
        Arrays.sort(dp);
        return dp[0];
    }
}
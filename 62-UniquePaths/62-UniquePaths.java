// Last updated: 10/5/2025, 7:22:43 AM
class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        for (int i=m-1 ; i>=0 ; i--){
            for (int j=n-1 ; j>=0 ; j--){
                if (j!=n-1){
                    dp[j] = dp[j+1] + dp[j];
                    continue;
                }
                if (i==m-1 && j==n-1){
                    dp[j] = 1;
                    continue;
                }
            }
        }
        return dp[0];
    }
}
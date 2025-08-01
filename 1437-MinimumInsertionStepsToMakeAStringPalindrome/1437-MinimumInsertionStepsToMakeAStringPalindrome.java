// Last updated: 8/1/2025, 7:05:41 AM
class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i=n-1 ; i>=0 ; i--){
            for (int j=i+1 ; j<n ; j++){
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1];
                }
                else{
                    dp[i][j] = 1 + Math.min(dp[i][j-1],dp[i+1][j]);
                }
            }
        }
        return dp[0][n-1];
    }
}
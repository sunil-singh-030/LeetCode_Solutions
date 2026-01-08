// Last updated: 1/8/2026, 12:07:57 PM
class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n=nums1.length, m=nums2.length;
        int [][]dp= new int[n+1][m+1];
        for(int []r: dp){
            Arrays.fill(r, Integer.MIN_VALUE);
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                int prod= nums1[i-1]*nums2[j-1];
                dp[i][j]= Math.max(dp[i][j-1], Math.max(dp[i-1][j], prod + Math.max(0, dp[i-1][j-1])));
            }
        }
        return dp[n][m];
    }
}
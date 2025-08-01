// Last updated: 8/1/2025, 7:11:37 AM
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] sumcol = new int[n];
        int maxRectangle = 0;
        for (int i=0 ; i<m ; i++){
            for (int j=0 ; j<n ; j++){
                if (matrix[i][j]-'0'==0){
                    sumcol[j] = 0;
                }
                else{
                    sumcol[j]++;
                }
            }
            int[] dp = new int[n];
            Arrays.fill(dp,-1);
            maxRectangle = Math.max(maxRectangle,maxRecArea(n,sumcol,0,dp));
        }
        return maxRectangle;
    }
    public static int maxRecArea(int n, int[] arr, int i, int[] dp){
        if (i==n){
            return 0;
        }
        if (dp[i]!=-1){
            return dp[i];
        }
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for (int ind=i ; ind<n ; ind++){
            min = Math.min(min,arr[ind]);
            ans = Math.max(ans,Math.max(min*(ind-i+1),maxRecArea(n,arr,ind+1,dp)));
        }
        return  dp[i] = ans;
    }
}
// Last updated: 8/1/2025, 7:10:49 AM
class Solution {
    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n];
        boolean[][] isPalin = new boolean[n][n];
        for (int i=n-1 ; i>=0 ; i--){
            for (int j=i ; j<n ; j++){
                if (s.charAt(i)==s.charAt(j) && (j-i+1<=3 || isPalin[i+1][j-1])){
                    isPalin[i][j] = true;
                }
            }
        }
        Arrays.fill(dp,-1);
        return fn(n,s,0,dp,isPalin);
    }
    public static int fn(int n, String s, int i, int[] dp, boolean[][] isPalin){
        if (dp[i]!=-1){
            return dp[i];
        }
        int ans = n;
        for (int ind=i ; ind<n ; ind++){
            if (isPalin[i][ind]){
                if (ind==n-1){
                    return dp[i] = 0;
                }
                ans = Math.min(ans,1+fn(n,s,ind+1,dp,isPalin));
            }
        }
        return dp[i] = ans;
    }
}
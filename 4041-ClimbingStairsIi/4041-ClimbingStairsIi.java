// Last updated: 12/19/2025, 11:54:23 AM
class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return fn(n,costs,-1,dp);
    }
    public static int fn(int n, int[] costs, int i, int[] dp){
        if (i==n-1){
            return 0;
        }
        if (dp[i+1]!=-1){
            return dp[i+1];
        }
        int curr = Integer.MAX_VALUE;
        if (i+1<n){
            int ans1 = costs[i+1] + 1 + fn(n,costs,i+1,dp);
            curr = Math.min(curr,ans1);
        }
        if (i+2<n){
            int ans2 = costs[i+2] + 4 + fn(n,costs,i+2,dp);
            curr = Math.min(curr,ans2);
        }
        if (i+3<n){
            int ans3 = costs[i+3] + 9 + fn(n,costs,i+3,dp);
            curr = Math.min(curr,ans3);
        }
        return dp[i+1] = curr;
    }
}
// Last updated: 12/19/2025, 11:56:39 AM
class Solution {
    int MOD = 1_000_000_007;

    public int waysToReachTarget(int target, int[][] types) {
        int n = types.length;
        int[][] dp = new int[n][target+1];
        for (int[] a : dp){
            Arrays.fill(a,-1);
        }
        return countWays(types, n-1, target, dp);
    }

    public int countWays(int[][] coins, int i, int amount, int[][] dp){
        if (amount == 0) return 1;
        if (i < 0) return 0;

        if (dp[i][amount] != -1) return dp[i][amount];

        long pick = 0;  // Use long to avoid overflow
        for (int j = 1; j <= coins[i][0]; j++){
            int rem = amount - coins[i][1] * j;
            if (rem >= 0){
                pick = (pick + countWays(coins, i-1, rem, dp)) % MOD;
            }
        }

        long notPick = countWays(coins, i-1, amount, dp);
        dp[i][amount] = (int)((pick + notPick) % MOD);

        return dp[i][amount];
    }
}

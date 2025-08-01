// Last updated: 8/1/2025, 7:08:12 AM
class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[] dp = new int[amount+1];
        for (int i=0 ; i<amount+1 ; i++){
            if (i%coins[0]==0){
                dp[i] = 1;
            }
        }
        for (int i=1 ; i<n ; i++){
            for (int j=0 ; j<amount+1 ; j++){
                int noTake = dp[j];
                int take = 0;
                if (j>=coins[i]){
                    take = dp[j-coins[i]];
                }
                dp[j] = take+noTake;
            }
        }
        return dp[amount];
    }
    
}
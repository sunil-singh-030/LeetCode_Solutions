// Last updated: 8/1/2025, 7:09:16 AM
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount+1];
        for (int i=0 ; i<amount+1 ; i++){
            if (i%coins[0]==0){
                dp[i] = i/coins[0];
            }
            else{
                dp[i] = (int) 1e9;
            }
        }
        for (int i=1 ; i<n ; i++){
            for (int j=0 ; j<amount+1 ; j++){
                int noTake = dp[j];
                int take = Integer.MAX_VALUE;
                if (j>=coins[i]){
                    take = 1 + dp[j-coins[i]];
                }
                dp[j] = Math.min(take,noTake);
            }
            
        }
        return dp[amount]<(int) 1e9 ? dp[amount] : -1;
    }
    
    
}
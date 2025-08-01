// Last updated: 8/1/2025, 7:10:17 AM
class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][] dp = new int[2][k+1];
        for (int i=n-1 ; i>=0 ; i--){
            for (int j=0 ; j<2 ; j++){
                for (int l=0 ; l<=k ; l++){
                    if (j==1){
                        if (l<k){
                            int buyIt = -prices[i] + dp[0][l+1] ;
                            int skipIt = 0 + dp[1][l];
                            dp[1][l] = Math.max(buyIt,skipIt);
                        }
                        else{
                            dp[1][l] = 0;
                        }
                    }
                    else{
                        int sellIt = prices[i] + dp[1][l];
                        int skipIt = 0 + dp[0][l];
                        dp[0][l] = Math.max(sellIt,skipIt);
                    }

                }
            }
        }
        return dp[1][0];
    }
    
}
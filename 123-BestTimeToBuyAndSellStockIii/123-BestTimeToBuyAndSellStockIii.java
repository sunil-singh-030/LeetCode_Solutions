// Last updated: 8/1/2025, 7:10:59 AM
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[2][3];
        for (int i=n-1 ; i>=0 ; i--){
            for (int j=0 ; j<2 ; j++){
                for (int k=0 ; k<3 ; k++){
                    if (j==1){
                        if (k<2){
                            int buyIt = -prices[i] + dp[0][k+1] ;
                            int skipIt = 0 + dp[1][k];
                            dp[1][k] = Math.max(buyIt,skipIt);
                        }
                        else{
                            dp[1][k] = 0;
                        }
                    }
                    else{
                        int sellIt = prices[i] + dp[1][k];
                        int skipIt = 0 + dp[0][k];
                        dp[0][k] = Math.max(sellIt,skipIt);
                    }

                }
            }
        }
        return dp[1][0];
    }
    
}
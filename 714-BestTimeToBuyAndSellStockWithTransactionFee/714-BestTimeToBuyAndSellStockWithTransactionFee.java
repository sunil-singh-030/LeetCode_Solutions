// Last updated: 8/1/2025, 7:07:34 AM
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int buy = 0;
        int sell = 0;
        for (int i=n-1 ; i>=0 ; i--){
            for (int j=0 ; j<2 ; j++){
                if (j==1){
                    int profit1 = -prices[i] + sell;
                    int profit2 = 0 + buy;
                    buy = Math.max(profit1,profit2);
                }
                else {
                    int profit1 = (prices[i] - fee) + buy;
                    int profit2 = 0 + sell;
                    sell =  Math.max(profit1,profit2);
                }
            }
        }
        return buy;
    }
    
}
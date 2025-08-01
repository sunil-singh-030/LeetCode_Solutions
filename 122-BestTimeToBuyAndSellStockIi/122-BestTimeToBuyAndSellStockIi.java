// Last updated: 8/1/2025, 7:11:00 AM
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = 0;
        int sell = 0;
        for (int i=n-1 ; i>=0 ; i--){
            int profit1 = -prices[i] + sell;
            int profit2 = 0 + buy;
            buy = Math.max(profit1,profit2);
            profit1 = prices[i] + buy;
            profit2 = 0 + sell;
            sell =  Math.max(profit1,profit2);
        }
        return buy;
    }
    
}
// Last updated: 8/1/2025, 7:11:02 AM
class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int n = prices.length;
        int minprice = prices[0];
        for (int i=1 ; i<n ; i++){
            ans = Math.max(ans,prices[i]-minprice);
            minprice = Math.min(minprice,prices[i]);
        }
        return ans;
    }
    
}
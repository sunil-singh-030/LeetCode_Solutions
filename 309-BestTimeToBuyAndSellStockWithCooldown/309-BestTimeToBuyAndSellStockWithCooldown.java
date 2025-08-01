// Last updated: 8/1/2025, 7:09:19 AM
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] ahead1 = new int[2];
        int[] ahead2 = new int[2];
        int[] curr = new int[2];
        for (int i=n-1 ; i>=0 ; i--){
            for (int j=0 ; j<2 ; j++){
                if (j==1){
                    int buyIt = -prices[i] + ahead1[0];
                    int skipIt = 0 + ahead1[1];
                    curr[1] = Math.max(buyIt,skipIt);
                }
                else{
                    int sellIt = prices[i] + ahead2[1];
                    int skipIt = 0 + ahead1[0];
                    curr[0] = Math.max(sellIt,skipIt);
                }
            }
            ahead2 = ahead1.clone();
            ahead1 = curr.clone();
        }
        return curr[1];
    }
}
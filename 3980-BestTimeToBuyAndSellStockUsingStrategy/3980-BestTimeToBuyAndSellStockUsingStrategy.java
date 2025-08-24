// Last updated: 8/24/2025, 7:43:58 AM
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long ans = 0;
        for (int i=0 ; i<n ; i++){
            ans += (prices[i]*strategy[i]);
        }
        // System.out.println(ans);
        long[] psum = new long[n];
        psum[n-1] = prices[n-1]*strategy[n-1];
        for (int i=n-2 ; i>=0 ; i--){
            psum[i] = psum[i+1] + (prices[i]*strategy[i]);
        }
        //System.out.println(Arrays.toString(psum));
        long[] tsum = new long[n];
        tsum[0] = prices[0];
        for (int i=1 ; i<n ; i++){
            tsum[i] = prices[i] + tsum[i-1];
        }
        //System.out.println(Arrays.toString(tsum));
        for (int i=(k/2) ; i<=(n-(k/2)) ; i++){
            long currans  = 0;
            if ((i-(k/2))>=0){
                currans += (psum[0]-psum[i-(k/2)]);
            }
            if ((i+(k/2))<=n-1){
                currans += (psum[i+(k/2)]);
            }
            currans += (tsum[i+(k/2)-1]-tsum[i-1]);
            ans = Math.max(ans,currans);
            //System.out.println(currans);
        }
        return ans;
        
        
    }
}
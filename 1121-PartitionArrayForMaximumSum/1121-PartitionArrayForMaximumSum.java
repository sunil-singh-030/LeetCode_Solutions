// Last updated: 8/1/2025, 7:06:11 AM
class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n+1];
        for (int i=n-1 ; i>=0 ; i--){
            int ans = 0;
            int max = 0;
            for (int ind=i ; ind<Math.min(n,i+k) ; ind++){
                max = Math.max(max,arr[ind]);
                ans = Math.max(ans,(max*(ind-i+1)) + dp[ind+1]);
            }
            dp[i] = ans;
        }
        return dp[0];
    }
}
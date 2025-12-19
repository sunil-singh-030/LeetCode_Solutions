// Last updated: 12/19/2025, 11:56:13 AM
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int max = Integer.MIN_VALUE;
        int[] dp = new int[n];
        for (int i=n-1 ; i>=0 ; i--){
            int curr = energy[i];
           if (i+k<n){
            curr += dp[i+k];
           }
            max = Math.max(max,curr);
            dp[i] = curr;
        }
        return max;
    }
}
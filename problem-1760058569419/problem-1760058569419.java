// Last updated: 10/10/2025, 6:39:29 AM
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int max = Integer.MIN_VALUE;
        int[] dp = new int[n];
        for (int i=n-1 ; i>=0 ; i--){
            int curr = energy[i];
            int ind = i;
            while (ind+k<n){
                if (dp[ind+k]!=-1){
                    curr += dp[ind+k];
                    break;
                }
                curr += energy[ind+k];
                ind += k;
            }
            max = Math.max(max,curr);
            dp[i] = curr;
        }
        return max;
    }
}
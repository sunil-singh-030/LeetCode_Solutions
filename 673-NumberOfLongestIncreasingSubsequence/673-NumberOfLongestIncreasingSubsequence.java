// Last updated: 8/1/2025, 7:07:43 AM
class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] freq = new int[n];
        Arrays.fill(freq,1);
        Arrays.fill(dp,1);
        int max = 0;
        int cntMaxLen = 0;
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<i ; j++){
                if (nums[i]>nums[j]){
                    if (1+dp[j]>dp[i]){
                        freq[i] = freq[j];
                    }
                    else if (1+dp[j]==dp[i]){
                        freq[i] += freq[j];
                    }
                    dp[i] = Math.max(dp[i],1+dp[j]);
                    
                }
            }
            if (dp[i]>max){
                max = dp[i];
                cntMaxLen = freq[i];
            }
            else if (dp[i]==max ){
                cntMaxLen += freq[i];
            }
        }
        
        return cntMaxLen;
    }
}
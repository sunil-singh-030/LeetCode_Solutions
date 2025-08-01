// Last updated: 8/1/2025, 7:12:24 AM
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[n-1] = 0;
        for (int i=n-2 ; i>=0 ; i--){
            int move = nums[i];
            int minjump = n;
            for (int j=i+1 ; j<=i+move ; j++){
                if (j==n){
                    break;
                }
                minjump = Math.min(minjump,dp[j]+1);
            }
            dp[i] = minjump;
        }
        return dp[0];
    }
    
}
// Last updated: 8/1/2025, 7:00:52 AM
public class Solution {
    public int minXor(int[] nums, int k) {
        int n = nums.length;
        int[][] dp = new int[n][k+1];
        for (int i=0 ; i<n ; i++ ){
            dp[i][1] = 0;
            int ind = i;
            while (ind>=0){
                dp[i][1] ^= nums[ind];
                ind--;
            }
        }
        for (int i=0 ; i<n ; i++){
            for (int j=2 ; j<=k ; j++){
                int minval = Integer.MAX_VALUE;
                int xorval = 0;
                for (int l=i ; l>=j-1 ; l--){
                    xorval ^= nums[l];
                    int prevmax = dp[l-1][j-1] ;
                    minval = Math.min(minval,Math.max(xorval,prevmax));
                }
                dp[i][j] = minval;
            }
        }
        return dp[n-1][k];
    }
}

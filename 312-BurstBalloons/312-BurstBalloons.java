// Last updated: 9/18/2025, 12:19:31 PM
class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+2];
        for (int i=0 ; i<n ; i++){
            arr[i+1] = nums[i];
        }
        arr[0] = arr[n+1] = 1;
        int[][] dp = new int[n+2][n+2];
        for (int[] a : dp){
            Arrays.fill(a,-1);
        }
        return Burst_Coin(arr,0,n+1,dp);
    }
    public int Burst_Coin(int[] arr, int i, int j, int[][] dp){
        if (j-i+1==2){
            return 0;
        }
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        int currMax = 0;
        for (int k=i+1 ; k<j ; k++){
             int left = Burst_Coin(arr,i,k,dp);
             int right = Burst_Coin(arr,k,j,dp);
             int self = arr[i]*arr[k]*arr[j];
             currMax = Math.max(left+right+self,currMax);
        }
        return dp[i][j] = currMax;
    }
}
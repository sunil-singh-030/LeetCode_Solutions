// Last updated: 8/1/2025, 7:08:41 AM
class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        int n = nums.length;
        for (int num : nums){
            totalSum += num;
        }
        if (totalSum%2==1){
            return false;
        }
        int k = totalSum/2;
        int[] dp = new int[k+1];
        dp[0] = 1;
        for (int i=1 ; i<n ; i++){
            int[] temp = dp.clone();
            for (int j=1 ; j<=k ; j++){
                boolean noTake = temp[j]==1;
                boolean take = false;
                if (j>=nums[i]){
                    take = temp[j-nums[i]]==1;
                }
                dp[j] = (noTake || take ) ? 1 : 0;
            }
        }

        return dp[k]==1;
    }
    
}
// Last updated: 12/19/2025, 12:00:59 PM
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        int[][][] dp = new int[n][n+1][3];
        for (int[][] a : dp){
            for (int[] b : a){
                Arrays.fill(b,-1);
            }
        }
        return fn(nums,n-1,0,n,dp);
    }
    public static int fn(int[] nums, int i, int diff, int prevInd, int[][][] dp){
        if (i<0){
            return 0;
        }
        if (dp[i][prevInd][diff]!=-1){
            return dp[i][prevInd][diff];
        }
        int noTake = fn(nums,i-1,diff,prevInd,dp);
        int take = 0;
        if (diff==0){
            if (prevInd==nums.length){
                take = 1 + fn(nums,i-1,0,i,dp);
            }
            else{
                if (nums[i]!=nums[prevInd]){
                    take = 1 + fn(nums,i-1,nums[i]-nums[prevInd] > 0 ? 1 : 2,i,dp);
                }
            }
            
        }
        else if (diff==1){
            if (nums[i]-nums[prevInd]<0 && nums[i]!=nums[prevInd]){
                take = 1 + fn(nums,i-1,2,i,dp);
            }
        }
        else{
            if (nums[i]-nums[prevInd]>0 && nums[i]!=nums[prevInd]){
                take = 1 + fn(nums,i-1,1,i,dp);
            }
        }
        return dp[i][prevInd][diff] = Math.max(noTake,take);
    }
    
}
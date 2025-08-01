// Last updated: 8/1/2025, 7:08:23 AM
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int totalSum = 0;
        for (int num : nums){
            totalSum += num;
        }
        if (target%2==0 && totalSum%2==1){
            return 0;
        }
        if (target%2==1 && totalSum%2==0){
            return 0;
        }
        int req = (target+totalSum)/2;
        if (req<0){
            return 0;
        }
        int[] dp = new int[req+1];

        dp[0] = 1;
        if (nums[0]<req+1){
            dp[nums[0]] += 1;
        }
        for (int i=1 ; i<n ; i++){
            int[] temp = new int[req+1];
            for (int j=0 ; j<req+1 ; j++){
                int noTake = dp[j];
                int take =  0;
                if (j>=nums[i]){
                    take = dp[j-nums[i]];
                }
                temp[j] = take+noTake;
            }
            dp = temp;
        }
        return dp[req];

    }
    public static int Maxcnt(int[] nums, int ind, int target, int[][] dp){
        if (ind==0){
            int c = 0;
            if (target==0){
                c++;
            }
            if (nums[0]==target){
                c++;
            }
            return c;

        }
        if (dp[ind][target]!=-1){
            return dp[ind][target];
        }
        int noTake = Maxcnt(nums,ind-1,target,dp);
        int take =  0;
        if (target>=nums[ind]){
            take = Maxcnt(nums,ind-1,target-nums[ind],dp);
        }
        return dp[ind][target] = noTake+take;
        
    }
}
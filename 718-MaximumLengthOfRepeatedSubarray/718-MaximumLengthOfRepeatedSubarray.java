// Last updated: 12/19/2025, 12:00:13 PM
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[][][] dp = new int[n][m][2];
        for (int[][] a : dp){
            for (int[] b : a){
                Arrays.fill(b,-1);
            }
        }
        return maxSubarr(nums1,nums2,n-1,m-1,true,dp);
    }
    public int maxSubarr(int[] nums1, int[] nums2, int i, int j,boolean canSkip, int[][][] dp){
        if (i<0 || j<0){
            return 0;
        }
        if (dp[i][j][canSkip ? 1 : 0]!=-1){
            return dp[i][j][canSkip ? 1 : 0];
        }
        int case1 = 0;
        if (nums1[i]==nums2[j]){
            case1 =  1 + maxSubarr(nums1,nums2,i-1,j-1,false,dp);
        }
        int case2 = 0 ;
        int case3 = 0 ;
        if (canSkip){
            case2 = 0 + maxSubarr(nums1,nums2,i-1,j,true,dp);
            case3 = 0 + maxSubarr(nums1,nums2,i,j-1,true,dp);
        }
        return dp[i][j][canSkip ? 1 : 0] = Math.max(case3,Math.max(case1,case2));
    }
}
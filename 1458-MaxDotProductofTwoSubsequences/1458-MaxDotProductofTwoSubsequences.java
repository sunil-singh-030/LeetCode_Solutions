// Last updated: 1/8/2026, 12:02:41 PM
1class Solution {
2    public int maxDotProduct(int[] nums1, int[] nums2) {
3        int[][][] dp = new int[nums1.length][nums2.length][2];
4        for (int[][] a : dp){
5            for (int[] b : a){
6                Arrays.fill(b,-1);
7            }
8        }
9        return helper(nums1,nums2,0,0,0,dp);
10    }
11    public int helper(int[] nums1, int[] nums2, int i, int j,int haveI, int[][][] dp){
12        if (i==nums1.length || j==nums2.length){
13            return 0;
14        }
15        if (dp[i][j][haveI]!=-1){
16            return dp[i][j][haveI];
17        }
18        int take = nums1[i]*nums2[j] + helper(nums1,nums2,i+1,j+1,1,dp);
19        int notake1 = Integer.MIN_VALUE;
20        if (!(haveI==0 && i==nums1.length-1)){
21            notake1 = helper(nums1,nums2,i+1,j,haveI,dp);
22        }
23        int notake2 = Integer.MIN_VALUE;
24        if (!(haveI==0 && j==nums2.length-1)){
25            notake2 = helper(nums1,nums2,i,j+1,haveI,dp);
26        }
27        return dp[i][j][haveI] = Math.max(take,Math.max(notake1,notake2));
28    }
29}
// Last updated: 1/14/2026, 11:32:03 AM
1class Solution {
2    public int maxOperations(int[] nums) {
3        int n = nums.length;
4        int[][] dp = new int[n][n];
5        for (int[] a : dp){
6            Arrays.fill(a,-1);
7        }
8        int case1 = helper(nums,2,n-1,nums[0]+nums[1],dp);
9        for (int[] a : dp){
10            Arrays.fill(a,-1);
11        }
12        int case2 = helper(nums,1,n-2,nums[0]+nums[n-1],dp);
13        for (int[] a : dp){
14            Arrays.fill(a,-1);
15        }
16        int case3 = helper(nums,0,n-3,nums[n-1]+nums[n-2],dp);
17        return 1 + Math.max(case1,Math.max(case2,case3));
18    }
19    public int helper(int[] nums, int st, int end, int prev, int[][] dp){
20        if (st>=end){
21            return 0;
22        }
23        if (dp[st][end]!=-1){
24            return dp[st][end];
25        }
26        int maxLen = 0;
27        if (nums[st]+nums[st+1]==prev){
28            int c1 = 1 + helper(nums,st+2,end,prev,dp);
29            maxLen = Math.max(maxLen,c1);
30        }
31        if (nums[st]+nums[end]==prev){
32            int c2 = 1 + helper(nums,st+1,end-1,prev,dp);
33            maxLen = Math.max(maxLen,c2);
34        }
35        if (nums[end]+nums[end-1]==prev){
36            int c3 = 1 + helper(nums,st,end-2,prev,dp);
37            maxLen = Math.max(maxLen,c3);
38        }
39        return dp[st][end] = maxLen;
40    }
41}
// Last updated: 2/16/2026, 9:31:51 PM
1class Solution {
2    public long rob(int[] nums, int[] colors) {
3        int n = nums.length;
4        long[][] dp = new long[n][2];
5        for (long[] a : dp){
6            Arrays.fill(a,-1);
7        }
8        return jaiBabaKi(nums,colors,0,true,dp);
9    }
10    public long jaiBabaKi(int[] nums, int[] col ,int idx, boolean canRob, long[][] dp){
11        if (idx==nums.length){
12            return 0;
13        }
14        if (dp[idx][canRob ? 1 : 0]!=-1){
15            return dp[idx][canRob ? 1 : 0];
16        }
17        long notake = jaiBabaKi(nums,col,idx+1,true,dp);
18        long take = 0;
19        if (idx==0 || canRob || (col[idx]!=col[idx-1])){
20            take = nums[idx] + jaiBabaKi(nums,col,idx+1,false,dp);
21        }
22        return dp[idx][canRob ? 1 : 0] = Math.max(notake,take);
23    }
24    
25}
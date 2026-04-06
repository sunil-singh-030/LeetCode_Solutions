// Last updated: 4/6/2026, 3:39:43 PM
1class Solution {
2    public long minIncrease(int[] nums) {
3        int n = nums.length;
4        long[][] dp = new long[n+1][2];
5        for (long[] a : dp){
6            Arrays.fill(a,-1);
7        }
8        if (n%2==1){
9            return jaiBabaKi(nums,1,0,dp);
10        }
11        return jaiBabaKi(nums,1,1,dp);
12        
13
14    }
15
16    public long jaiBabaKi(int[] nums, int idx, int canI, long[][] dp){
17        if (idx>=nums.length-1){
18            return 0;
19        }
20        if (dp[idx][canI]!=-1) return dp[idx][canI];
21
22        long res = Long.MAX_VALUE/2;
23        if (canI==1){
24            res = jaiBabaKi(nums,idx+1,0,dp);
25        }
26        
27        int reqHeight = 0;
28        int maxHeight = Math.max(nums[idx-1],nums[idx+1]);
29        if (nums[idx]<=maxHeight){
30            reqHeight = maxHeight-nums[idx]+1;
31        }
32        long take = jaiBabaKi(nums,idx+2,canI,dp);
33        if (take!=Long.MAX_VALUE/2){
34            res = Math.min(res,reqHeight + take );
35        }
36        
37        return dp[idx][canI] = res;
38
39         
40
41    }
42}
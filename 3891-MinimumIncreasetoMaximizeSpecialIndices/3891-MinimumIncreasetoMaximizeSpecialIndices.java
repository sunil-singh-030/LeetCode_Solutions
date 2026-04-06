// Last updated: 4/6/2026, 3:36:42 PM
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
17        
18        if (idx>=nums.length-1){
19            return 0;
20        }
21        if (dp[idx][canI]!=-1) return dp[idx][canI];
22        long res = Long.MAX_VALUE/2;
23
24        
25        if (canI==1){
26            res = jaiBabaKi(nums,idx+1,0,dp);
27        }
28        
29        int req = 0;
30        if (nums[idx]<=Math.max(nums[idx-1],nums[idx+1])){
31            req = Math.max(nums[idx-1],nums[idx+1])-nums[idx]+1;
32        }
33        long curr = jaiBabaKi(nums,idx+2,canI,dp);
34        if (curr==Long.MAX_VALUE/2) return res;
35        res = Math.min(res,req +curr );
36        return dp[idx][canI] = res;
37
38         
39
40    }
41}
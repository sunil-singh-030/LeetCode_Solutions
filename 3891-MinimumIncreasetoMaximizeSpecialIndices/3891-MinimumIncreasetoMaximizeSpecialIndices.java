// Last updated: 4/6/2026, 3:43:18 PM
1class Solution {
2    public long minIncrease(int[] nums) {
3        int n = nums.length;
4        
5        if (n%2==1){
6            long cntOp = 0;
7            for (int i=1 ; i<n-1 ; i+=2){
8                if (nums[i]<=Math.max(nums[i-1],nums[i+1])){
9                    cntOp += Math.max(nums[i-1],nums[i+1])-nums[i]+1;
10                }
11            }
12            return cntOp;
13        }
14        long[][] dp = new long[n+1][2];
15        for (long[] a : dp){
16            Arrays.fill(a,-1);
17        }
18        return jaiBabaKi(nums,1,1,dp);
19        
20
21    }
22
23    public long jaiBabaKi(int[] nums, int idx, int canI, long[][] dp){
24        if (idx>=nums.length-1){
25            return 0;
26        }
27        if (dp[idx][canI]!=-1) return dp[idx][canI];
28
29        long res = Long.MAX_VALUE/2;
30        if (canI==1){
31            res = jaiBabaKi(nums,idx+1,0,dp);
32        }
33        
34        int reqHeight = 0;
35        int maxHeight = Math.max(nums[idx-1],nums[idx+1]);
36        if (nums[idx]<=maxHeight){
37            reqHeight = maxHeight-nums[idx]+1;
38        }
39        long take = jaiBabaKi(nums,idx+2,canI,dp);
40        if (take!=Long.MAX_VALUE/2){
41            res = Math.min(res,reqHeight + take );
42        }
43        return dp[idx][canI] = res;
44    }
45}
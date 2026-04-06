// Last updated: 4/6/2026, 3:43:01 PM
1class Solution {
2    public long minIncrease(int[] nums) {
3        int n = nums.length;
4        long[][] dp = new long[n+1][2];
5        for (long[] a : dp){
6            Arrays.fill(a,-1);
7        }
8        if (n%2==1){
9            long cntOp = 0;
10            for (int i=1 ; i<n-1 ; i+=2){
11                if (nums[i]<=Math.max(nums[i-1],nums[i+1])){
12                    cntOp += Math.max(nums[i-1],nums[i+1])-nums[i]+1;
13                }
14            }
15            return cntOp;
16        }
17        return jaiBabaKi(nums,1,1,dp);
18        
19
20    }
21
22    public long jaiBabaKi(int[] nums, int idx, int canI, long[][] dp){
23        if (idx>=nums.length-1){
24            return 0;
25        }
26        if (dp[idx][canI]!=-1) return dp[idx][canI];
27
28        long res = Long.MAX_VALUE/2;
29        if (canI==1){
30            res = jaiBabaKi(nums,idx+1,0,dp);
31        }
32        
33        int reqHeight = 0;
34        int maxHeight = Math.max(nums[idx-1],nums[idx+1]);
35        if (nums[idx]<=maxHeight){
36            reqHeight = maxHeight-nums[idx]+1;
37        }
38        long take = jaiBabaKi(nums,idx+2,canI,dp);
39        if (take!=Long.MAX_VALUE/2){
40            res = Math.min(res,reqHeight + take );
41        }
42        return dp[idx][canI] = res;
43    }
44}
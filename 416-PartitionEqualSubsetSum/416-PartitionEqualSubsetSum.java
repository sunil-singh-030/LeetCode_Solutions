// Last updated: 1/3/2026, 1:03:48 PM
1class Solution {
2    public boolean canPartition(int[] nums) {
3        int n = nums.length;
4        int tsum = 0;
5        for (int num : nums){
6            tsum += num;
7        }
8        if (tsum%2==1){
9            return false;
10        }
11        int[][] dp = new int[n][tsum/2+1];
12        for (int[] a : dp){
13            Arrays.fill(a,-1);
14        }
15        return helper(nums,0,tsum/2,dp);
16    }
17    public boolean helper(int[] nums, int idx, int sum, int[][] dp){
18        if (sum==0){
19            return true;
20        }
21        if (idx==nums.length){
22            return false;
23        }
24        if (dp[idx][sum]!=-1){
25            return dp[idx][sum]==1 ? true : false;
26        }
27        boolean notake = helper(nums,idx+1,sum,dp);
28        boolean take = false;
29        if (nums[idx]<=sum){
30            take = helper(nums,idx+1,sum-nums[idx],dp);
31        }
32        if (notake||take==true){
33            dp[idx][sum] = 1;
34        }
35        else{
36            dp[idx][sum] = 0;
37        }
38        return notake || take;
39    }
40    
41}
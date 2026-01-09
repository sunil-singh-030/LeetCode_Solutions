// Last updated: 1/9/2026, 11:23:41 AM
1class Solution {
2    public int maximumLength(int[] nums, int k) {
3        int n = nums.length;
4        int[][] dp = new int[n][k];
5        int ans = 1;
6
7        for (int i = 0; i < n; i++) {
8            for (int j = 0; j < i; j++) {
9                int mod = (nums[i] + nums[j]) % k;
10                dp[i][mod] = Math.max(dp[i][mod], dp[j][mod] + 1);
11                dp[i][mod] = Math.max(dp[i][mod], 2);
12                ans = Math.max(ans, dp[i][mod]);
13            }
14        }
15        return ans;
16    }
17}
18
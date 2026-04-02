// Last updated: 4/2/2026, 3:21:19 PM
1class Solution {
2    public int maximumAmount(int[][] coins) {
3        int m = coins.length;
4        int n = coins[0].length;
5        int[][][] dp = new int[m][n][3];
6
7        for (int k = 0; k < 3; k++) {
8            dp[m-1][n-1][k] = (coins[m-1][n-1] < 0 && k > 0) ? 0 : coins[m-1][n-1];
9        }
10
11        for (int i = m-1; i >= 0; i--) {
12            for (int j = n-1; j >= 0; j--) {
13                if (i == m-1 && j == n-1) continue;
14
15                for (int k = 0; k < 3; k++) {
16                    int max = Integer.MIN_VALUE;
17
18                    if (j + 1 < n) {
19                        max = Math.max(max, coins[i][j] + dp[i][j+1][k]);
20                        if (coins[i][j] < 0 && k > 0) {
21                            max = Math.max(max, dp[i][j+1][k-1]);
22                        }
23                    }
24
25                    if (i + 1 < m) {
26                        max = Math.max(max, coins[i][j] + dp[i+1][j][k]);
27                        if (coins[i][j] < 0 && k > 0) {
28                            max = Math.max(max, dp[i+1][j][k-1]);
29                        }
30                    }
31
32                    dp[i][j][k] = max;
33                }
34            }
35        }
36
37        return dp[0][0][2];
38    }
39}
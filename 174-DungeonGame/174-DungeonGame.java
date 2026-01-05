// Last updated: 1/5/2026, 3:12:15 PM
1class Solution {
2    int[][] dp;
3    int m, n;
4
5    public int calculateMinimumHP(int[][] dungeon) {
6        m = dungeon.length;
7        n = dungeon[0].length;
8        dp = new int[m][n];
9
10        for (int i = 0; i < m; i++) {
11            Arrays.fill(dp[i], -1);
12        }
13
14        return helper(dungeon, 0, 0);
15    }
16
17    public int helper(int[][] dungeon, int i, int j) {
18
19        
20        if (i >= m || j >= n) {
21            return Integer.MAX_VALUE;
22        }
23
24        if (i == m - 1 && j == n - 1) {
25            return Math.max(1, 1 - dungeon[i][j]);
26        }
27
28        
29        if (dp[i][j] != -1) {
30            return dp[i][j];
31        }
32
33        int right = helper(dungeon, i, j + 1);
34        int down  = helper(dungeon, i + 1, j);
35
36        int minNext = Math.min(right, down);
37        int need = minNext - dungeon[i][j];
38
39        dp[i][j] = Math.max(1, need);
40        return dp[i][j];
41    }
42}
43
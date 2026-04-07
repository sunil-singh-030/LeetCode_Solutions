// Last updated: 4/7/2026, 12:42:57 PM
1class Solution {
2    int[] r = {-1,0,1,0};
3    int[] c = {0,1,0,-1};
4
5    public int numEnclaves(int[][] grid) {
6        int m = grid.length;
7        int n = grid[0].length;
8
9        
10        for (int i = 0; i < m; i++) {
11            if (grid[i][0] == 1) dfs(grid, i, 0);
12            if (grid[i][n - 1] == 1) dfs(grid, i, n - 1);
13        }
14
15        for (int j = 0; j < n; j++) {
16            if (grid[0][j] == 1) dfs(grid, 0, j);
17            if (grid[m - 1][j] == 1) dfs(grid, m - 1, j);
18        }
19
20        
21        int cnt = 0;
22        for (int i = 0; i < m; i++) {
23            for (int j = 0; j < n; j++) {
24                if (grid[i][j] == 1) cnt++;
25            }
26        }
27
28        return cnt;
29    }
30
31    public void dfs(int[][] grid, int row, int col) {
32        grid[row][col] = 0;
33
34        for (int i = 0; i < 4; i++) {
35            int newR = row + r[i];
36            int newC = col + c[i];
37
38            if (newR < 0 || newC < 0 || newR >= grid.length || newC >= grid[0].length) continue;
39            if (grid[newR][newC] == 1) {
40                dfs(grid, newR, newC);
41            }
42        }
43    }
44}
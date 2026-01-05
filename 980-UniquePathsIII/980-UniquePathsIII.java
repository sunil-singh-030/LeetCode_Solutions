// Last updated: 1/5/2026, 3:40:50 PM
1class Solution {
2    public int uniquePathsIII(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        boolean[][] visited = new boolean[m][n];
6        int req = 0;
7        int sr = -1;
8        int sc = -1;
9        for (int i=0 ; i<m ; i++){
10            for (int j=0 ; j<n ; j++){
11                if (grid[i][j]!=-1){
12                    req++;
13                    if (grid[i][j]==1){
14                        sr = i;
15                        sc = j;
16                    }
17                }
18            }
19        }
20        visited[sr][sc] = true;
21        return cntPaths(grid,sr,sc,req-1,visited);
22    }
23    public int cntPaths(int[][] grid, int i, int j, int req, boolean[][] visited){
24        if (grid[i][j]==2){
25            if (req==0){
26                return 1;
27            }
28            return 0;
29        }
30        if (req==0){
31            return 1;
32        }
33        int[] r = {-1,0,1,0};
34        int[] c = {0,-1,0,1};
35        int ans = 0;
36        for (int idx=0 ; idx<4 ; idx++){
37            int newR = r[idx]+i;
38            int newC = c[idx]+j;
39            if (newR<0 || newC<0 || newR>=grid.length || newC>=grid[0].length){
40                continue;
41            }
42            if (!visited[newR][newC] && grid[newR][newC]!=-1){
43                visited[newR][newC] = true;
44                ans += cntPaths(grid,newR,newC,req-1,visited);
45                visited[newR][newC] = false;
46            }
47
48        }
49        return ans;
50    }
51
52}
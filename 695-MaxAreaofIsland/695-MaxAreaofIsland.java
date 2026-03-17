// Last updated: 3/17/2026, 11:44:21 AM
1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3        int maxArea = 0;
4        int m = grid.length;
5        int n = grid[0].length;
6        for (int i=0 ; i<m ; i++){
7            for (int j=0 ; j<n ; j++){
8                if (grid[i][j]==1){
9                    maxArea = Math.max(maxArea,bfs(i,j,grid));
10                }
11            }
12        }
13        return maxArea;
14    }
15    public int bfs(int r, int c, int[][] grid){
16        if (r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0){
17            return 0;
18        }
19        int cnt = 1;
20        int[] row = {-1,0,1,0};
21        int[] col = {0,1,0,-1};
22        grid[r][c] = 0;
23        for (int i=0 ; i<4 ; i++){
24            int newR = r+row[i];
25            int newC = c+col[i];
26            cnt += bfs(newR,newC,grid);
27        }
28        return cnt;
29    }
30}
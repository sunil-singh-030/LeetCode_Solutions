// Last updated: 4/26/2026, 8:30:55 AM
1class Solution {
2    int[] row = {-1,0,1,0};
3    int[] col = {0,1,0,-1};
4    public boolean hasCycle(char[][] grid, int r, int c, boolean[][] visited, int pr, int pc){  
5        if (visited[r][c]) return true;
6        visited[r][c] = true;
7        
8        for (int i=0 ; i<4 ; i++){
9            int newr = row[i]+r;
10            int newc = col[i]+c;
11            if (newr<0 || newc<0 || newr>=grid.length || newc>=grid[0].length) continue;
12            if (grid[newr][newc]!=grid[r][c] || (newr==pr && newc==pc)) continue;
13            if (hasCycle(grid,newr,newc,visited,r,c)) return true;
14        }
15        
16        return false;
17    }
18    public boolean containsCycle(char[][] grid) {
19        int m = grid.length;
20        int n = grid[0].length;
21        boolean[][] visited = new boolean[m][n];
22        for (int i=0 ; i<m ; i++){
23            for (int j=0 ; j<n ; j++){
24                if (!visited[i][j] && hasCycle(grid,i,j,visited,-1,-1)){
25                    return true;
26                }
27            }
28        }
29        return false;
30    }
31}
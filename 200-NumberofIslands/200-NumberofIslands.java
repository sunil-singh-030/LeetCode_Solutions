// Last updated: 7/20/2026, 3:39:10 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int cntIsland = 0;
6        boolean[][] vis = new boolean[m][n];
7            
8        int[] dr = {-1,0,1,0};
9        int[] dc = {0,1,0,-1};	
10
11        for (int i=0 ; i<m ; i++){
12            for (int j=0 ; j<n ; j++){
13                if (!vis[i][j] && grid[i][j]=='1'){
14                    cntIsland++;
15                    Queue<int[]> q = new LinkedList<>();
16                    q.add(new int[]{i,j});
17
18                    while (!q.isEmpty()){
19                        int[] cpos = q.poll();
20                        int r = cpos[0];
21                        int c = cpos[1];
22                        if (vis[r][c]) continue;
23                        
24                        vis[r][c] = true;
25                        
26                        for (int idx=0 ; idx<4 ; idx++){
27                            int newR = r + dr[idx];
28                            int newC = c + dc[idx];
29                            
30                            if (newR<0 || newC<0 || newR>=m || newC>=n){
31                                continue;
32                            }
33                                
34                            if (!vis[newR][newC] && grid[newR][newC]=='1'){
35                                q.add(new int[]{newR,newC});
36                            }
37                        }
38                        
39                    }
40
41
42
43
44
45                }
46            }
47        }
48        return cntIsland;
49    }
50
51}
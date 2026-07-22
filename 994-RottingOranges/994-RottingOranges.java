// Last updated: 7/22/2026, 6:26:15 AM
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int tcnt = 0;
6        Queue<int[]> q = new LinkedList<>();
7        for (int i=0 ; i<m ; i++){
8            for (int j=0 ; j<n ; j++){
9                if (grid[i][j]==2){
10                    q.add(new int[]{i,j,0});
11                    tcnt++;
12                }
13                else if (grid[i][j]==1){
14                    tcnt++;
15                }
16            }
17        }
18
19        boolean[][] vis = new boolean[m][n];
20
21
22        int[] dr = {-1,0,1,0};
23        int[] dc = {0,1,0,-1};
24
25        int minTime = 0;
26
27        while (!q.isEmpty()){
28            int[] cp = q.poll();
29            int r = cp[0];
30            int c = cp[1];
31            int t = cp[2];
32
33            if (vis[r][c]) continue;
34            
35            minTime = Math.max(minTime,t);
36            
37
38            tcnt--;
39            vis[r][c] = true;
40            
41            for (int i=0 ; i<4 ; i++){
42                int newR = r + dr[i];
43                int newC = c + dc[i];
44
45                if (newR<0 || newC<0 || newR>=m || newC>=n) continue;
46
47                if (vis[newR][newC] || grid[newR][newC]==0) continue;
48
49                q.add(new int[]{newR,newC,t+1});
50            }
51
52        }
53        
54        return tcnt==0 ? minTime : -1;
55    }
56}
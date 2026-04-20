// Last updated: 4/20/2026, 9:18:40 AM
1import java.util.*;
2
3class Solution {
4    public int[][] colorGrid(int n, int m, int[][] sources) {
5
6        
7        Arrays.sort(sources, (a, b) -> b[2] - a[2]);
8
9        Queue<int[]> q = new LinkedList<>();
10        int[][] ans = new int[n][m];
11        boolean[][] vis = new boolean[n][m];
12
13        
14        for (int[] s : sources) {
15            int r = s[0], c = s[1], color = s[2];
16            q.add(new int[]{r, c});
17            ans[r][c] = color;
18            vis[r][c] = true;
19        }
20
21        int[] dr = {-1, 0, 1, 0};
22        int[] dc = {0, 1, 0, -1};
23
24        
25        while (!q.isEmpty()) {
26            int[] cur = q.poll();
27            int r = cur[0], c = cur[1];
28
29            for (int i = 0; i < 4; i++) {
30                int nr = r + dr[i];
31                int nc = c + dc[i];
32
33                if (nr < 0 || nc < 0 || nr >= n || nc >= m) continue;
34
35                if (!vis[nr][nc]) {
36                    vis[nr][nc] = true;
37                    ans[nr][nc] = ans[r][c];
38                    q.add(new int[]{nr, nc});
39                }
40            }
41        }
42
43        return ans;
44    }
45}
// Last updated: 2/27/2026, 12:30:21 PM
1class Solution {
2public:
3
4    struct Node {
5        int time;
6        int row;
7        int col;
8    };
9
10    int orangesRotting(vector<vector<int>>& grid) {
11        int m = grid.size();
12        int n = grid[0].size();
13        int freshCnt = 0;
14
15        queue<Node> q;
16
17        for (int i = 0; i < m; i++) {
18            for (int j = 0; j < n; j++) {
19                if (grid[i][j] == 1) {
20                    freshCnt++;
21                }
22                else if (grid[i][j] == 2) {
23                    q.push({0, i, j});
24                }
25            }
26        }
27
28        int minTime = 0;
29        int r[] = {1,0,-1,0};
30        int c[] = {0,1,0,-1};
31
32        while (!q.empty()) {
33            Node p = q.front();
34            q.pop();
35
36            for (int j = 0; j < 4; j++) {
37                int row = p.row + r[j];
38                int col = p.col + c[j];
39
40                if (row >= 0 && col >= 0 && row < m && col < n && grid[row][col] == 1) {
41                    grid[row][col] = 2;
42                    freshCnt--;
43                    minTime = max(minTime, p.time + 1);
44                    q.push({p.time + 1, row, col});
45                }
46            }
47        }
48
49        return freshCnt == 0 ? minTime : -1;
50    }
51};
// Last updated: 2/27/2026, 12:21:59 PM
1class Solution {
2public:
3
4    int orangesRotting(vector<vector<int>>& grid) {
5        int m = grid.size();
6        int n = grid[0].size();
7        int freshCnt = 0;
8        queue<pair<int,pair<int,int>>> q;
9        for (int i=0 ; i<m ; i++){
10            for (int j=0 ; j<n ; j++){
11                if (grid[i][j]==1){
12                    freshCnt++;
13                }
14                else if (grid[i][j]==2){
15                    q.push({0,{i,j}});
16                }
17            }
18        }
19        int minTime = 0;
20        while (!q.empty()){
21            int size = q.size();
22            for (int i=0 ; i<size ; i++){
23                auto p = q.front();
24                q.pop();
25                int r[] = {1,0,-1,0};
26                int c[] = {0,1,0,-1};
27                for (int j=0 ; j<4 ; j++){
28                    int row = p.second.first+r[j];
29                    int col = p.second.second+c[j];
30                    if (row>=0 && col>=0 && row<m && col<n && grid[row][col]==1){
31                        grid[row][col] = 2;
32                        freshCnt--;
33                        minTime = max(minTime,p.first+1);
34                        q.push({p.first+1,{row,col}});
35                    }
36                }
37            }
38        }
39        return freshCnt==0 ? minTime : -1;
40    }
41};
// Last updated: 3/6/2026, 5:24:57 PM
1class Solution {
2public:
3    int numSpecial(vector<vector<int>>& mat) {
4        int m = mat.size();
5        int n = mat[0].size();
6        int cnt = 0;
7        for (int i=0 ; i<m ; i++){
8            int c1 = 0;
9            int idx = -1;
10            for (int j=0 ; j<n ; j++){
11                if (mat[i][j]==1){
12                    c1++;
13                    idx = j;
14                }
15                if (c1>1){
16                    break;
17                }
18            }
19            if (c1==1){
20                c1 = 0;
21                for (int j=0 ; j<m ; j++){
22                    if (mat[j][idx]==1){
23                        c1++;
24                    }
25                }
26                if (c1==1){
27                    cnt++;
28                }
29            }
30        }
31        return cnt;
32    }
33};
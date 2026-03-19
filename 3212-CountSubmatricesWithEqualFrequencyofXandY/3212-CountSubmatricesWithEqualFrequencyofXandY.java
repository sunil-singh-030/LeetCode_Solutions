// Last updated: 3/19/2026, 9:47:18 AM
1class Solution {
2    public int numberOfSubmatrices(char[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int[][] x = new int[m][n];
7        int[][] y = new int[m][n];
8
9        for (int i=0 ; i<n ; i++){
10            int cx = 0;
11            int cy = 0;
12            for (int j=0 ; j<m ; j++){
13                if (grid[j][i]=='X'){
14                    cx++;
15                }
16                else if (grid[j][i]=='Y') {
17                    cy++;
18                }
19                x[j][i] = cx;
20                y[j][i] = cy;
21            }
22        }
23
24        int tcnt = 0;
25
26        for (int i=0 ; i<m ; i++){
27            int cx = 0;
28            int cy = 0;
29            for (int j=0 ; j<n ; j++){
30
31                cx += x[i][j];
32                cy += y[i][j];
33                if (cx>0 && cx==cy){
34                    tcnt++;
35                }
36            }
37            
38        }
39
40        return tcnt;
41    }
42
43    
44}
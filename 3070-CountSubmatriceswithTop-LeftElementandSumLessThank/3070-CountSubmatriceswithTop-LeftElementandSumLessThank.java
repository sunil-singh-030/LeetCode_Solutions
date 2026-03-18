// Last updated: 3/18/2026, 9:15:41 PM
1class Solution {
2    public int countSubmatrices(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6
7        for (int i=0 ; i<n ; i++){
8            int sum = 0;
9            for (int j=0 ; j<m ; j++){
10                sum += grid[j][i];
11                grid[j][i] = sum;
12            }
13        }
14
15        int tcnt = 0;
16        for (int i=0 ; i<m ; i++){
17            int tsum = 0;
18            for (int j=0 ; j<n ; j++){
19                tsum += grid[i][j];
20                if (tsum<=k){
21                    tcnt++;
22                }
23                else{
24                    break;
25                }
26            }
27        }
28
29        return tcnt;
30    }
31}
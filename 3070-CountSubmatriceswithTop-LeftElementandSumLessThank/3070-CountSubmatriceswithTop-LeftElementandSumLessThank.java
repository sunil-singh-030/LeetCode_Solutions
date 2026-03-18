// Last updated: 3/18/2026, 9:13:52 PM
1class Solution {
2    public int countSubmatrices(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int[][] newGrid = new int[m][n];
7
8        for (int i=0 ; i<n ; i++){
9            int sum = 0;
10            for (int j=0 ; j<m ; j++){
11                sum += grid[j][i];
12                newGrid[j][i] = sum;
13            }
14        }
15
16        int tcnt = 0;
17        for (int i=0 ; i<m ; i++){
18            int tsum = 0;
19            for (int j=0 ; j<n ; j++){
20                tsum += newGrid[i][j];
21                if (tsum<=k){
22                    tcnt++;
23                }
24                else{
25                    break;
26                }
27            }
28        }
29
30        return tcnt;
31    }
32}
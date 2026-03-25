// Last updated: 3/25/2026, 7:04:28 AM
1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        long tsum = 0;
6        for (int i=0 ; i<m ; i++){
7            for (int j=0 ; j<n ; j++){
8                tsum += grid[i][j];
9            }
10        }
11
12        // row
13        long rsum = 0;
14        for (int i=0 ; i<m ; i++){
15            for (int j=0 ; j<n ; j++){
16                rsum += grid[i][j];
17            }
18            if (rsum==tsum-rsum) return true;
19        }
20
21        // col
22        long csum = 0;
23        for (int j=0 ; j<n ; j++){
24            for (int i=0 ; i<m ; i++){
25                csum += grid[i][j];
26            }
27            if (csum==tsum-csum) return true;
28        }
29
30        return false;
31    }
32
33}
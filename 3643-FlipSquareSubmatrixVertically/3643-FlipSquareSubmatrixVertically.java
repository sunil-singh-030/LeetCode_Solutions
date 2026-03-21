// Last updated: 3/21/2026, 6:25:10 AM
1class Solution {
2    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int rpl = x+k-1;
6        int to = x;
7        int chance = k/2;
8        while (chance-->0){
9        for (int i=y ; i<y+k ; i++){
10            int temp = grid[to][i];
11            grid[to][i] = grid[rpl][i];
12            grid[rpl][i] = temp;
13        }
14        rpl--;
15        to++;
16        }
17        return grid;
18    }
19}
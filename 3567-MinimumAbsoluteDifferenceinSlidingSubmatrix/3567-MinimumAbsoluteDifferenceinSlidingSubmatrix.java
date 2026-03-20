// Last updated: 3/20/2026, 6:52:36 AM
1class Solution {
2    public int[][] minAbsDiff(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int[][] out = new int[m-k+1][n-k+1];
6        for (int i=0 ; i<out.length ; i++){
7            for (int j=0 ; j<out[0].length ; j++){
8                List<Integer> ls = new ArrayList<>();
9                for (int row=i ; row<i+k ; row++){
10                    for (int col=j ; col<j+k ; col++){
11                        ls.add(grid[row][col]);
12                    }
13                }
14                Collections.sort(ls);
15                int ans = Integer.MAX_VALUE;
16                for (int s=0 ; s<ls.size()-1 ; s++){
17                    int diff = Math.abs(ls.get(s)-ls.get(s+1));
18                    if (diff!=0){
19                        ans = Math.min(ans,diff);
20                    }
21                }
22                if (ans==Integer.MAX_VALUE){
23                    ans = 0;
24                }
25                out[i][j] = ans;
26            }
27        }
28        return out;
29    }
30}
// Last updated: 7/20/2026, 6:20:43 AM
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int total = m*n;
7        k %= total;
8
9        int r = 0;
10        int c = 0;
11        while (k-->0){
12            if (r==0 && c==0){
13                r = m-1;
14                c = n-1;
15            }
16            else if (c>0){
17                c--;
18            }
19            else{
20                r--;
21                c = n-1;
22            }
23        }
24
25        List<List<Integer>> ans = new ArrayList<>();
26        for (int i=0 ; i<m ; i++){
27            List<Integer> temp = new ArrayList<>();
28            for (int j=0 ; j<n ; j++){
29                temp.add(grid[r][c]);
30                if (r==m-1 && c==n-1){
31                    r = 0;
32                    c = 0;
33                }
34                else if (c==n-1){
35                    r++;
36                    c = 0;
37                }
38                else{
39                    c++;
40                }
41            }
42            ans.add(temp);
43        }
44        return ans;
45    }
46}
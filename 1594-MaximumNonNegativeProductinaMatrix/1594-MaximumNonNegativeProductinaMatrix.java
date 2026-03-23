// Last updated: 3/23/2026, 6:39:35 AM
1class Solution {
2    HashMap<String,Long> map1;
3    HashMap<String,Long> map2;
4    public int maxProductPath(int[][] grid) {
5        map1 = new HashMap<>();
6        map2 = new HashMap<>();
7        int m = grid.length;
8        int n = grid[0].length;
9        
10        long[] res = fn(grid,0,0);
11        res[1] %= 1000000007;
12        int ans = (int) res[1];
13
14        return ans<0 ? -1 : ans;
15    }
16    public long[] fn(int[][] grid, int r, int c){
17        if (r==grid.length-1 && c==grid[0].length-1){
18            long val = (long) grid[r][c];
19            return new long[]{val,val};
20        }
21        String key = r + " " + c;
22        if (map1.containsKey(key)){
23            return new long[]{map1.get(key),map2.get(key)};
24        }
25        long currVal = (long) grid[r][c];
26        long min = Long.MAX_VALUE;
27        long max = Long.MIN_VALUE;
28        if (r+1<grid.length){
29            long[] arr1 = fn(grid,r+1,c);
30            min = Math.min(min,currVal*arr1[0]);
31            min = Math.min(min,currVal*arr1[1]);
32            max = Math.max(max,currVal*arr1[0]);
33            max = Math.max(max,currVal*arr1[1]);
34            if (c+1<grid[0].length){
35                long[] arr2 = fn(grid,r,c+1);
36                min = Math.min(min,currVal*arr2[0]);
37                min = Math.min(min,currVal*arr2[1]);
38                max = Math.max(max,currVal*arr2[0]);
39                max = Math.max(max,currVal*arr2[1]);
40                
41            }
42        }
43        else{
44            if (c+1<grid[0].length){
45                long[] arr2 = fn(grid,r,c+1);
46                min = Math.min(min,currVal*arr2[0]);
47                min = Math.min(min,currVal*arr2[1]);
48                max = Math.max(max,currVal*arr2[0]);
49                max = Math.max(max,currVal*arr2[1]);
50                
51            }
52        }
53        map1.put(key,min);
54        map2.put(key,max);
55        return new long[]{min,max};
56
57    }
58}
// Last updated: 1/28/2026, 2:47:31 PM
1class Solution {
2    public int[] countRectangles(int[][] rectangles, int[][] points) {
3        int m = rectangles.length;
4        int n = points.length;
5        int[] res = new int[n];
6        List<List<Integer>> group = new ArrayList<>(101);
7        for(int i = 0; i < 101; i++){
8            group.add(new ArrayList<>());
9        }
10        for(int[] rec : rectangles){
11            int l = rec[0];
12            int h = rec[1];
13            group.get(h).add(l);
14        }
15        for(int i = 0; i < 101; i++){
16            Collections.sort(group.get(i));   
17        }
18        for(int i = 0; i < n; i++){
19            int count = 0;
20            int x = points[i][0];
21            int y = points[i][1];
22            for(int j = y; j < 101; j++){
23                List<Integer> cur = group.get(j);
24                int index = binarySearch(cur, x);
25                count += cur.size() - index;
26            }
27            res[i] = count;
28        }
29        return res;
30    }
31    public int binarySearch(List<Integer> list, int x){
32        int left = 0;
33        int right = list.size();
34        while(left < right){
35            int mid = left + (right - left) / 2;
36            if(list.get(mid) >= x){
37                right = mid;
38            } else{
39                left = mid + 1;
40            }
41        }
42        return left;
43    }
44}
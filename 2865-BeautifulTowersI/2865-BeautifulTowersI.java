// Last updated: 2/24/2026, 10:43:59 AM
1class Solution {
2    public long maximumSumOfHeights(int[] heights) {
3        long ans = 0;
4        int n = heights.length;
5        for (int i=0 ; i<n ; i++){
6            int idx = i;
7            int prev = heights[i];
8            long curr = 0;
9            while (idx>=0){
10                prev = Math.min(prev,heights[idx]);
11                curr += prev;
12                idx--;
13            }
14            idx = i+1;
15            prev = heights[i];
16            while (idx<n){
17                prev = Math.min(prev,heights[idx]);
18                curr += prev;
19                idx++;
20            }
21            ans = Math.max(ans,curr);
22        }
23        return ans;
24    }
25}
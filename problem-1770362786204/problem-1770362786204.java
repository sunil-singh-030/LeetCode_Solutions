// Last updated: 2/6/2026, 12:56:26 PM
1class Solution {
2    public int maxFrequency(int[] nums, int k) {
3        int max = 0;
4        int cntK = 0;
5        for (int num : nums){
6            if (num==k){
7                cntK++;
8            }
9        }
10        max = cntK;
11        for (int i=1 ; i<51 ; i++){
12            if (i==k){
13                continue;
14            }
15            int curr = 0;
16            int cmax = 0;
17            for (int num : nums){
18                if (num==i){
19                    curr++;
20                }
21                else if (num==k){
22                    curr--;
23                }
24                curr = Math.max(curr,0);
25                cmax = Math.max(curr,cmax);
26            }
27            max = Math.max(max,cntK+cmax);
28        }
29        return max;
30    }
31}
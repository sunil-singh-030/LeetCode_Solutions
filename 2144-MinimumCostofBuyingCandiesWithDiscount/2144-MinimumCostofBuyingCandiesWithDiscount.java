// Last updated: 6/1/2026, 3:33:16 PM
1class Solution {
2    public int minimumCost(int[] cost) {
3        // 2 2 5 6 7 9
4        Arrays.sort(cost);
5        int tcost = 0;
6        int req = 2;
7        int n = cost.length;
8        int idx = n-1;
9        while (idx>=0){
10            if (req>0){
11                tcost += cost[idx];
12                req--;
13            }
14            else{
15                req = 2;
16            }
17            idx--;
18        }
19        return tcost;
20    }
21}
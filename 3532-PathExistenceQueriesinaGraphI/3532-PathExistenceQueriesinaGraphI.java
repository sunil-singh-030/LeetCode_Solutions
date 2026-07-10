// Last updated: 7/10/2026, 4:49:04 PM
1class Solution {
2    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
3        int[] id = new int[n];
4
5        int currId = 1;
6        id[n-1] = 1;
7        for (int i=n-2 ; i>=0 ; i--){
8            if (nums[i+1]-nums[i]<=maxDiff){
9                id[i] = currId;
10            }
11            else{
12                currId++;
13                id[i] = currId;
14            }
15        }
16        int q = queries.length;
17        boolean[] ans = new boolean[q];
18
19        for (int i=0 ; i<q ; i++){
20            int n1 = queries[i][0];
21            int n2 = queries[i][1];
22            if (id[n1]==id[n2]){
23                ans[i] = true;
24            }
25        }
26        return ans;
27    }
28}
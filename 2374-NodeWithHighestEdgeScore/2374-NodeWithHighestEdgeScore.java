// Last updated: 1/2/2026, 10:32:39 AM
1class Solution {
2    public int edgeScore(int[] edges) {
3        int n = edges.length;
4        long[] edgeScore = new long[n];
5        for (int i=0 ; i<n ; i++){
6            edgeScore[edges[i]] += i;
7        }
8        int ans = 0;
9        long score = (long) edgeScore[0];
10        for (int i=1 ; i<n ; i++){
11            if (edgeScore[i]>score){
12                ans = i;
13                score = (long) edgeScore[i];
14            }
15        }
16        return ans;
17    }
18}
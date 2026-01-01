// Last updated: 1/1/2026, 10:18:46 AM
1class Solution {
2    public int findCenter(int[][] edges) {
3        int n = edges.length+1;
4        int[] cntEdges = new int[n+1];
5        for (int[] edg : edges){
6            cntEdges[edg[0]]++;
7            cntEdges[edg[1]]++;
8        }
9        for (int i=1 ; i<n+1 ; i++){
10            if (cntEdges[i]==n-1){
11                return i;
12            }
13        }
14        return -1;
15    }
16}
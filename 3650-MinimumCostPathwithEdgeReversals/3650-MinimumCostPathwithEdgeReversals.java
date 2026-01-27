// Last updated: 1/27/2026, 11:31:35 AM
1class Solution {
2    public int minCost(int n, int[][] edges) {
3        List<List<int []>> adjLs = new ArrayList<>();
4        for (int i=0 ; i<n ; i++){
5            adjLs.add(new ArrayList<>());
6        }
7        for (int[] edg : edges){
8            adjLs.get(edg[0]).add(new int[]{edg[1],edg[2]});
9            adjLs.get(edg[1]).add(new int[]{edg[0],2*edg[2]});
10        }
11        int[] dist = new int[n];
12        Arrays.fill(dist,Integer.MAX_VALUE);
13        dist[0] = 0;
14        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
15        pq.add(new int[]{0,0});
16        while (!pq.isEmpty()){
17            int[] cp = pq.poll();
18            int node = cp[0];
19            int dis = cp[1];
20            if (dis>dist[node]){
21                continue;
22            }
23            for ( int[] pair :adjLs.get(node)){
24                int newDis = dis + pair[1];
25                if (dist[pair[0]]>newDis){
26                    dist[pair[0]] = newDis;
27                    pq.add(new int[]{pair[0],newDis});
28                }
29            }
30        }
31        return dist[n-1]==Integer.MAX_VALUE ? -1 : dist[n-1];
32    }
33}
// Last updated: 1/2/2026, 10:49:42 AM
1class Solution {
2    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
3        List<List<int[]>> adjLs = new ArrayList<>();
4        for (int i=0 ; i<n ; i++){
5            adjLs.add(new ArrayList<>());
6        }
7        for (int[] edge : edges){
8            adjLs.get(edge[0]).add(new int[]{edge[1],edge[2]});
9            adjLs.get(edge[1]).add(new int[]{edge[0],edge[2]});
10        }
11        int[] minTime = new int[n];
12        Arrays.fill(minTime,Integer.MAX_VALUE);
13        minTime[0] = 0;
14        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.t-b.t);
15        HashSet<Integer> visited = new HashSet<>();
16        pq.add(new Pair(0,0));
17        while (!pq.isEmpty()){
18            // 1
19            Pair cp = pq.poll();
20
21            // 2
22            if (visited.contains(cp.node)){
23                continue;
24            }
25
26            // 3 
27            visited.add(cp.node);
28
29            for (int[] arr : adjLs.get(cp.node)){
30                if (!visited.contains(arr[0]) && cp.t+arr[1]<disappear[arr[0]]){
31                    if (cp.t+arr[1]<minTime[arr[0]]){
32                        minTime[arr[0]] = cp.t + arr[1];
33                        pq.add(new Pair(arr[0],minTime[arr[0]]));
34                    }
35                }
36            }
37        }
38        for (int i=0 ; i<n ; i++){
39            if (minTime[i]==Integer.MAX_VALUE){
40                minTime[i] = -1;
41            }
42        }
43        return minTime;
44
45    }
46    class Pair{
47        int node;
48        int t;
49        Pair(int node, int t){
50            this.node = node;
51            this.t = t;
52        }
53    }
54}
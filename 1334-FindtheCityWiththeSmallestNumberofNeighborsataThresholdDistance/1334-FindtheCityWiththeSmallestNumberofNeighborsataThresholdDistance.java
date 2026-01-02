// Last updated: 1/2/2026, 2:44:12 PM
1class Solution {
2    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
3        List<List<int[]>> adjLs = new ArrayList<>();
4        for (int i=0 ; i<n ; i++){
5            adjLs.add(new ArrayList<>());
6        }
7        for (int[] edge : edges){
8            adjLs.get(edge[0]).add(new int[]{edge[1],edge[2]});
9            adjLs.get(edge[1]).add(new int[]{edge[0],edge[2]});
10        }
11        int ansCity = -1;
12        int cntCity = n+1;
13        for (int i=n-1 ; i>=0 ; i--){
14            int currCnt = helper(adjLs,distanceThreshold,i,n);
15            if (currCnt<cntCity){
16                ansCity = i;
17                cntCity = currCnt;
18            }
19            //System.out.println(i+" "+currCnt);
20        }
21        return ansCity;
22    }
23    public int helper(List<List<int[]>> adjLs, int k , int city, int n){
24        int[] dist = new int[n];
25        Arrays.fill(dist,Integer.MAX_VALUE);
26        dist[city] = 0;
27        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
28        HashSet<Integer> visited = new HashSet<>();
29        pq.add(new int[]{city,0});
30        while (!pq.isEmpty()){
31            int[] curr = pq.poll();
32            if (visited.contains(curr)){
33                continue;
34            }
35            visited.add(curr[0]);
36            for (int[] edge : adjLs.get(curr[0])){
37                if (!visited.contains(edge[0])){
38                    int newDist = curr[1] + edge[1];
39                    if (newDist<dist[edge[0]]){
40                        dist[edge[0]] = newDist;
41                        pq.add(new int[]{edge[0],newDist});
42                    }
43                }
44            }
45
46        }
47        int cnt = 0;
48        for (int num : dist){
49            if (num<=k){
50                cnt++;
51            }
52        }
53        return cnt;
54    }
55
56}
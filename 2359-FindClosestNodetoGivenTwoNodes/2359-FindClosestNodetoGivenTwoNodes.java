// Last updated: 1/11/2026, 7:45:18 AM
1class Solution {
2    class Pair{
3        int node;
4        int dis;
5        public Pair(int node, int dis){
6            this.node = node;
7            this.dis = dis;
8        }
9    }
10    public int closestMeetingNode(int[] edges, int node1, int node2) {
11        int n = edges.length;
12        int[] dis1 = new int[edges.length];
13        Arrays.fill(dis1,-1);
14        dis1[node1] = 0;
15        HashSet<Integer> visited = new HashSet<>();
16        Queue<Pair> q = new LinkedList<>();
17        q.add(new Pair(node1,0));
18        while (!q.isEmpty()){
19            Pair cp = q.poll();
20            if (visited.contains(cp.node)){
21                continue;
22            }
23            visited.add(cp.node);
24            int next = edges[cp.node];
25            if (next != -1 && dis1[next] == -1) {
26                dis1[next] = cp.dis + 1;
27                q.add(new Pair(next, cp.dis + 1));
28            }
29
30        }
31
32        int[] dis2 = new int[edges.length];
33        Arrays.fill(dis2,-1);
34        dis2[node2] = 0;
35        visited = new HashSet<>();
36        q = new LinkedList<>();
37        q.add(new Pair(node2,0));
38        while (!q.isEmpty()){
39            Pair cp = q.poll();
40            if (visited.contains(cp.node)){
41                continue;
42            }
43            visited.add(cp.node);
44            int next = edges[cp.node];
45            if (next != -1 && dis2[next] == -1) {
46                dis2[next] = cp.dis + 1;
47                q.add(new Pair(next, cp.dis + 1));
48            }
49        }
50        int node = -1;
51        int dis = Integer.MAX_VALUE;
52        for (int i=0 ; i<n ; i++){
53            if (dis1[i]!=-1 && dis2[i]!=-1){
54                if (dis>Math.max(dis1[i],dis2[i])){
55                    node = i;
56                    dis = Math.max(dis1[i],dis2[i]);
57                }
58            }
59        }
60        return node;
61        
62        
63    }
64}
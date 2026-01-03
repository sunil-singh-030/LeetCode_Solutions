// Last updated: 1/3/2026, 11:40:25 AM
1class Solution {
2    List<List<Integer>> adjLs;
3    Set<Integer> leafSet;
4    int[] bobTime;
5    int ans = Integer.MIN_VALUE;
6
7    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
8        int n = amount.length;
9
10        adjLs = new ArrayList<>();
11        for (int i = 0; i < n; i++) adjLs.add(new ArrayList<>());
12
13        int[] freq = new int[n];
14
15        for (int[] e : edges) {
16            adjLs.get(e[0]).add(e[1]);
17            adjLs.get(e[1]).add(e[0]);
18            freq[e[0]]++;
19            freq[e[1]]++;
20        }
21
22        // leaf detection 
23        leafSet = new HashSet<>();
24        for (int i = 1; i < n; i++) {
25            if (freq[i] == 1) leafSet.add(i);
26        }
27
28        // build parent array
29        int[] parent = new int[n];
30        Arrays.fill(parent, -1);
31        dfsParent(0, -1, parent);
32
33        // bob arrival time
34        bobTime = new int[n];
35        Arrays.fill(bobTime, Integer.MAX_VALUE);
36
37        int t = 0;
38        int node = bob;
39        while (node != -1) {
40            bobTime[node] = t++;
41            node = parent[node];
42        }
43
44        // alice dfs
45        boolean[] visited = new boolean[n];
46        dfsAlice(0, 0, 0, amount, visited);
47
48        return ans;
49    }
50
51    // parent
52    void dfsParent(int node, int par, int[] parent) {
53        parent[node] = par;
54        for (int nbr : adjLs.get(node)) {
55            if (nbr != par) {
56                dfsParent(nbr, node, parent);
57            }
58        }
59    }
60
61    // alice dfs
62    void dfsAlice(int node, int time, int profit, int[] amount, boolean[] visited) {
63        visited[node] = true;
64
65        
66        if (time < bobTime[node]) {
67            profit += amount[node];
68        } else if (time == bobTime[node]) {
69            profit += amount[node] / 2;
70        }
71
72        if (leafSet.contains(node)) {
73            ans = Math.max(ans, profit);
74        }
75
76        for (int nbr : adjLs.get(node)) {
77            if (!visited[nbr]) {
78                dfsAlice(nbr, time + 1, profit, amount, visited);
79            }
80        }
81
82        visited[node] = false;
83    }
84}
85
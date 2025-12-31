// Last updated: 12/31/2025, 10:32:38 AM
1class Solution {
2    class Pair{
3        int node;
4        double prob;
5        Pair(int node,double prob){
6            this.node = node;
7            this.prob = prob;
8        }
9    }
10    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
11        List<List<Integer>> adjLs = new ArrayList<>();
12        double[] dis = new double[n];
13        dis[start_node] = 1.0;
14        HashMap<String,Double> map = new HashMap<>();
15        for (int i=0 ; i<n ; i++){
16            adjLs.add(new ArrayList<>());
17        }
18        int idx = 0;
19        for (int[] edge : edges){
20            adjLs.get(edge[0]).add(edge[1]);
21            adjLs.get(edge[1]).add(edge[0]);
22            map.put(edge[0]+" "+edge[1],succProb[idx]);
23            map.put(edge[1]+" "+edge[0],succProb[idx]);
24            idx++;
25        }
26        PriorityQueue<Pair> q = new PriorityQueue<>((a,b)->Double.compare(b.prob,a.prob));
27        HashSet<Integer> visited = new HashSet<>();
28        double maxProb = 0;
29        q.add(new Pair(start_node,1.0));
30        while (!q.isEmpty()){
31            Pair cp = q.poll();
32            if (cp.node==end_node){
33                maxProb = Math.max(maxProb,cp.prob);
34            }
35            if (visited.contains(cp.node)){
36                continue;
37            }
38            visited.add(cp.node);
39            for (int nbr : adjLs.get(cp.node)){
40                if (!visited.contains(nbr)){
41                    if (cp.prob*(map.get(cp.node+" "+nbr))>dis[nbr]){
42                        dis[nbr] = cp.prob*(map.get(cp.node+" "+nbr));
43                        q.add(new Pair(nbr,cp.prob*(map.get(cp.node+" "+nbr))));
44                    }
45                    
46                }
47            }
48        }
49        //System.out.println(Arrays.toString(dis));
50        return maxProb;
51        
52    }
53}
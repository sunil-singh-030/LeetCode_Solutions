// Last updated: 12/31/2025, 10:08:10 AM
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        List<List<Integer>> adjLs = new ArrayList<>();
4        for (int i=0 ; i<n ; i++){
5            adjLs.add(new ArrayList<>());
6        }
7        for (int[] edge : edges){
8            adjLs.get(edge[0]).add(edge[1]);
9            adjLs.get(edge[1]).add(edge[0]);
10        }
11        Queue<Integer> q = new LinkedList<>();
12        HashSet<Integer> visited = new HashSet<>();
13        q.add(source);
14        while (!q.isEmpty()){
15            int node = q.poll();
16            if (node==destination){
17                return true;
18            }
19            if (visited.contains(node)){
20                continue;
21            }
22            visited.add(node);
23            for (int nbr : adjLs.get(node)){
24                if (!visited.contains(nbr)){
25                    q.add(nbr);
26                }
27            }
28        }
29        return false;
30    }
31}
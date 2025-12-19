// Last updated: 12/19/2025, 12:00:03 PM
class Solution {
    class Pair{
        int node;
        int dis;
        public  Pair(int n, int dis){
            this.node = n;
            this.dis = dis;
        }
    }
    public boolean isBipartite(int[][] graph) {
        // if no cycle -> always bipartite , if cycle -> if odd len then no else bipartite
        int n = graph.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0 ; i<n ; i++){
            if (map.containsKey(i)) continue;
            Queue<Pair> q = new LinkedList<>();
            q.offer(new Pair(i,0));
            while (!q.isEmpty()){
                // 1
                Pair currPair = q.poll();
                int currNode = currPair.node;
                int dis = currPair.dis;

                // 2
                if (map.containsKey(currNode)) {
                    if (dis!=map.get(currNode)) return false;
                    continue;
                }

                // 3
                map.put(currNode,dis);
                // 4

                // 5
                int[] nbrs = graph[currNode];
                for (int j=0 ; j<nbrs.length ; j++){
                    if (!map.containsKey(nbrs[j])){
                        q.offer(new Pair(nbrs[j],dis+1));
                    }
                }

            }
        }
        return true;
    }
}
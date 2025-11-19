// Last updated: 11/19/2025, 12:27:14 PM
class Solution {
    public int longestCycle(int[] edges) {
        int n = edges.length;
        int[] inDegree = new int[n];
        for (int i=0 ; i<n ; i++){
            if (edges[i]!=-1){
                inDegree[edges[i]]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i=0 ; i<n ; i++){
            if (inDegree[i]==0){
                q.offer(i);
            }
        }
        HashSet<Integer> visited = new HashSet<>();
        while (!q.isEmpty()){
            // 1
            int vtx = q.poll();

            // 2

            // 3
            visited.add(vtx);

            // 4

            // 5
            if (edges[vtx]!=-1){
                inDegree[edges[vtx]]--;
                if (inDegree[edges[vtx]]==0){
                    q.offer(edges[vtx]);
                }
            }
        }
        int maxCycle = -1;
        for (int i=0 ; i<n ; i++){
            if (!visited.contains(i)){
                int cnt = 1;
                int nbrs = edges[i];
                while (nbrs!=i){
                    visited.add(nbrs);
                    cnt++;
                    nbrs = edges[nbrs];
                }
                maxCycle = Math.max(maxCycle,cnt);
            }
        }
        return maxCycle;

    }
}
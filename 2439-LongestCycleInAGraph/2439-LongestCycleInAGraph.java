// Last updated: 12/19/2025, 11:56:51 AM
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
        // HashSet<Integer> visited = new HashSet<>();
        boolean[] visited = new boolean[n];
        while (!q.isEmpty()){
            // 1
            int vtx = q.poll();

            // 2

            // 3
            visited[vtx] = true;

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
            if (!visited[i]){
                int cnt = 1;
                int nbrs = edges[i];
                while (nbrs!=i){
                    visited[nbrs] = true;
                    cnt++;
                    nbrs = edges[nbrs];
                }
                maxCycle = Math.max(maxCycle,cnt);
            }
        }
        return maxCycle;

    }
}
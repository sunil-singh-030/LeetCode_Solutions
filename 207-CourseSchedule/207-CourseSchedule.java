// Last updated: 10/20/2025, 3:23:26 PM
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adjList.add(new ArrayList<>());
        for (int[] pre : prerequisites) adjList.get(pre[1]).add(pre[0]);
        
        boolean[] visited = new boolean[numCourses];
        boolean[] onPath = new boolean[numCourses]; // tracks recursion stack
        
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (hasCycleDFS(i, adjList, visited, onPath)) return false;
            }
        }
        return true;
    }

    private boolean hasCycleDFS(int node, List<List<Integer>> adj, boolean[] visited, boolean[] onPath) {
        if (onPath[node]) return true; // cycle detected
        if (visited[node]) return false; // already processed
        
        onPath[node] = true;
        for (int nbr : adj.get(node)) {
            if (hasCycleDFS(nbr, adj, visited, onPath)) return true;
        }
        onPath[node] = false;
        visited[node] = true; // mark completely processed
        return false;
    }

}
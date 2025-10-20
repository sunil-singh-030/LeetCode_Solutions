// Last updated: 10/20/2025, 4:09:03 PM
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i=0 ; i<numCourses ; i++){
            adjList.add(new ArrayList<>());
        }
        for (int[] preReq : prerequisites){
            adjList.get(preReq[1]).add(preReq[0]);
        }
        if (hasCycle(adjList,numCourses)) return false;
        HashSet<Integer> visited = new HashSet<>();
        for (int i=0 ; i<numCourses ; i++){
            if (visited.contains(i)) continue;
            dfs(adjList,visited,i);
        }
        return visited.size()==numCourses ? true : false;
    }
    public void dfs(List<List<Integer>> adjList,HashSet<Integer> visited,int stNode){
        visited.add(stNode);
        for (int nbr : adjList.get(stNode)){
            if (!visited.contains(nbr)){
                dfs(adjList,visited,nbr);
            }
        }
    }
    public boolean hasCycle(List<List<Integer>> adjList, int numCourses){
        int[] visited = new int[numCourses];
        int[] pathVisited = new int[numCourses];
        for (int i=0 ; i<numCourses ; i++){
            if (visited[i]==1) continue;
            if (dfsDirectedGraph(i,visited,pathVisited,adjList)) {
                return true;
            }
        }
        return false;
    }
    public boolean dfsDirectedGraph(int currNode, int[] visited, int[] pathVisited, List<List<Integer>> adjList){
        visited[currNode] = 1;
        pathVisited[currNode] = 1;
        for (int nbr : adjList.get(currNode)){
            if (visited[nbr]==0){
                if (dfsDirectedGraph(nbr,visited,pathVisited,adjList)) return true;
            }
            else if (pathVisited[nbr]==1){
                return true;
            }
        }
        pathVisited[currNode] = 0;
        return false;
    }
}
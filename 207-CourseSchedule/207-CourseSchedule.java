// Last updated: 10/20/2025, 4:50:32 PM
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i=0 ; i<numCourses ; i++){
            adjList.add(new ArrayList<>());
        }
        for (int[] preReq : prerequisites){
            adjList.get(preReq[1]).add(preReq[0]);
            inDegree[preReq[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i=0 ; i<inDegree.length ; i++){
            if (inDegree[i]==0) q.offer(i);
        }
        HashSet<Integer> visited = new HashSet<>();
        while (!q.isEmpty()){
            // remove
            int currNode = q.poll();
            // ignore
            if (visited.contains(currNode)){
                continue;
            }
            // mark visited
            visited.add(currNode);
            // add those nbr whose indegree is 0
            for (int nbr : adjList.get(currNode)){
                inDegree[nbr]--;
                if (inDegree[nbr]==0){
                    q.offer(nbr);
                }
            }
        }
        return visited.size()==numCourses ? true : false;
    }
    
}
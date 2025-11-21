// Last updated: 11/21/2025, 12:18:05 PM
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i=0 ; i<numCourses ; i++){
            adjList.add(new ArrayList());
        }
        int[] inDegree = new int[numCourses];
        for (int[] arr : prerequisites){
            inDegree[arr[0]]++;
            adjList.get(arr[1]).add(arr[0]);
        }
        List<Integer> ls = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i=0 ; i<numCourses ; i++){
            if (inDegree[i]==0){
                q.add(i);
            }
        }
        HashSet<Integer> visited = new HashSet<>();
        while (!q.isEmpty()){
            // 1
            int currCourse = q.poll();
            // 2
            
            
            // 3
            visited.add(currCourse);
            ls.add(currCourse);
            // 4
            
            // 5
            for (int nbr : adjList.get(currCourse)){
                inDegree[nbr]--;
                if (inDegree[nbr]==0){
                    q.add(nbr);
                }
            }
        }
        if (visited.size()!=numCourses){
            return new int[0];
        }
        int[] ans = new int[numCourses];
        for (int i=0 ; i<numCourses ; i++){
            ans[i] = ls.get(i);
        }
        return ans;
    }
}
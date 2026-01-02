// Last updated: 1/2/2026, 10:23:53 AM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        int[] inDegree = new int[numCourses];
4        List<List<Integer>> adjList = new ArrayList<>();
5        for (int i=0 ; i<numCourses ; i++){
6            adjList.add(new ArrayList<>());
7        }
8        for (int[] preReq : prerequisites){
9            adjList.get(preReq[1]).add(preReq[0]);
10            inDegree[preReq[0]]++;
11        }
12        Queue<Integer> q = new LinkedList<>();
13        for (int i=0 ; i<inDegree.length ; i++){
14            if (inDegree[i]==0) q.offer(i);
15        }
16        HashSet<Integer> visited = new HashSet<>();
17        while (!q.isEmpty()){
18            // remove
19            int currNode = q.poll();
20            // ignore
21            if (visited.contains(currNode)){
22                continue;
23            }
24            // mark visited
25            visited.add(currNode);
26            // add those nbr whose indegree is 0
27            for (int nbr : adjList.get(currNode)){
28                inDegree[nbr]--;
29                if (inDegree[nbr]==0){
30                    q.offer(nbr);
31                }
32            }
33        }
34        return visited.size()==numCourses ? true : false;
35    }
36    
37}
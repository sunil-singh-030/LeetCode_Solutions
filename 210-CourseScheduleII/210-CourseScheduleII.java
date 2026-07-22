// Last updated: 7/22/2026, 11:56:44 AM
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> adjLs = new ArrayList<>();
4        for (int i=0 ; i<numCourses ; i++){
5            adjLs.add(new ArrayList<>());
6        }
7
8        int[] inDegree = new int[numCourses];
9
10        for (int[] pre : prerequisites){
11            int from = pre[1];
12            int to = pre[0];
13            inDegree[to]++;
14            adjLs.get(from).add(to);
15        }
16
17        int tcnt = numCourses;
18
19        Queue<Integer> q = new LinkedList<>();
20
21        for (int i=0 ; i<numCourses ; i++){
22            if (inDegree[i]==0){
23                q.add(i);
24                
25            }
26        }
27
28        int[] ans = new int[numCourses];
29        int idx = 0;
30
31        while (!q.isEmpty()){
32            int curr = q.poll();
33            ans[idx] = curr;
34            idx++;
35            tcnt--;
36            for (int nbr : adjLs.get(curr)){
37                inDegree[nbr]--;
38                if (inDegree[nbr]==0){
39                    q.add(nbr);
40                }
41            }
42        }
43        return tcnt==0 ? ans : new int[0];
44    }
45}
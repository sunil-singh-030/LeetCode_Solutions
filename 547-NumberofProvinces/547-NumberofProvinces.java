// Last updated: 12/30/2025, 10:10:13 AM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n = isConnected.length;
4        int cntProvinces = 0;
5        HashSet<Integer> visited = new HashSet<>();
6        for (int i=1 ; i<=n ; i++){
7            if (visited.contains(i)) continue;
8            cntProvinces++;
9            Queue<Integer> q = new LinkedList<>();
10            q.offer(i);
11            while (!q.isEmpty()){
12                // 1 remove
13                int currNode = q.poll();
14
15                // 2 ignore if already visited
16                if (visited.contains(currNode)) continue;
17
18                // 3 mark visited
19                visited.add(currNode);
20
21                // 4 self work
22
23                // add unvisited nbrs
24                for (int j=0 ; j<n ; j++){ 
25                    if ( (j+1!=currNode) && isConnected[currNode-1][j]==1 && !visited.contains(j+1)){
26                        q.offer(j+1);
27                    }
28                }
29
30            }
31        }
32        return cntProvinces;
33    }
34}
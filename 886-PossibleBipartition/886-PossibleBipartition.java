// Last updated: 1/3/2026, 10:09:20 AM
1class Solution {
2    public boolean possibleBipartition(int n, int[][] dislikes) {
3        List<List<Integer>> adjLs = new ArrayList<>();
4        for (int i=0 ; i<=n ; i++){
5            adjLs.add(new ArrayList<>());
6        }
7        for (int[] edg : dislikes){
8            adjLs.get(edg[0]).add(edg[1]);
9            adjLs.get(edg[1]).add(edg[0]);
10        }
11        HashMap<Integer,Integer> visitedMap = new HashMap<>();
12        for (int i=1 ; i<=n ; i++){
13            if (!visitedMap.containsKey(i)){
14                Queue<int[]> q = new LinkedList<>();
15                q.add(new int[]{i,0});
16                while (!q.isEmpty()){
17                    int[] curr = q.poll();
18                    if (visitedMap.containsKey(curr[0])){
19                        if (curr[1]!=visitedMap.get(curr[0])){
20                            return false;
21                        }
22                        continue;
23                    }
24                    visitedMap.put(curr[0],curr[1]);
25                    for (int nbr : adjLs.get(curr[0])){
26                        if (!visitedMap.containsKey(nbr)){
27                            q.add(new int[]{nbr,curr[1]+1});
28                        }
29                    }
30                }
31                
32            }
33
34        }
35        return true;
36    }
37}
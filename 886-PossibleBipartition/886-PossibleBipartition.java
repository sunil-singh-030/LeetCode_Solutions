// Last updated: 1/3/2026, 10:08:56 AM
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
11        //HashSet<Integer> visited = new HashSet<>();
12        HashMap<Integer,Integer> visitedMap = new HashMap<>();
13        for (int i=1 ; i<=n ; i++){
14            if (!visitedMap.containsKey(i)){
15                //HashMap<Integer,Integer> visitedMap = new HashMap<>();
16                Queue<int[]> q = new LinkedList<>();
17                q.add(new int[]{i,0});
18                while (!q.isEmpty()){
19                    int[] curr = q.poll();
20                    if (visitedMap.containsKey(curr[0])){
21                        if (curr[1]!=visitedMap.get(curr[0])){
22                            return false;
23                        }
24                        continue;
25                    }
26                    visitedMap.put(curr[0],curr[1]);
27                    //visited.add(curr[0]);
28                    for (int nbr : adjLs.get(curr[0])){
29                        if (!visitedMap.containsKey(nbr)){
30                            q.add(new int[]{nbr,curr[1]+1});
31                        }
32                    }
33                }
34                
35            }
36
37        }
38        return true;
39    }
40}
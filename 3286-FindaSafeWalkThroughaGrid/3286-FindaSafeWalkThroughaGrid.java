// Last updated: 12/31/2025, 11:00:05 AM
1class Solution {
2    class Pair{
3        int r;
4        int c;
5        int h;
6        public Pair(int r, int c, int h){
7            this.r = r;
8            this.c = c;
9            this.h = h;
10        }
11    }
12    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
13        int m = grid.size();
14        int n = grid.get(0).size();
15        int[][] dis = new int[m][n];
16        dis[0][0] = health-grid.get(0).get(0);
17        PriorityQueue<Pair> q = new PriorityQueue<>((a,b)->b.h-a.h);
18        HashSet<String> visited = new HashSet<>();
19        if (health-grid.get(0).get(0)>0){
20            q.add(new Pair(0,0,health-grid.get(0).get(0)));
21        }
22        while (!q.isEmpty()){
23            Pair cp = q.poll();
24            if (cp.r==m-1 && cp.c==n-1){
25                return true;
26            }
27            if (visited.contains(cp.r+" "+cp.c)){
28                continue;
29            }
30            visited.add(cp.r+" "+cp.c);
31            int[] row = {-1,0,1,0};
32            int[] col = {0,1,0,-1};
33            for (int i=0 ; i<4 ; i++){
34                int newR = row[i] + cp.r;
35                int newC = col[i] + cp.c;
36                if (newR<0 || newC<0 || newR>=m || newC>=n){
37                    continue;
38                }
39                if (!visited.contains(newR+" "+newC) && cp.h-grid.get(newR).get(newC)>0 && cp.h-grid.get(newR).get(newC)>dis[newR][newC]){
40                    dis[newR][newC] = cp.h-grid.get(newR).get(newC);
41                    q.add(new Pair(newR,newC,cp.h-grid.get(newR).get(newC)));
42                }
43            }
44        }
45        return false;
46    }
47}
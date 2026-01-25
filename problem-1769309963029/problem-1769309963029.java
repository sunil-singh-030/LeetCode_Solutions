// Last updated: 1/25/2026, 8:29:23 AM
1class Solution {
2    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
3        List<List<Integer>> adjLs = new ArrayList<>();
4        for (int i=0 ; i<n ; i++){
5            adjLs.add(new ArrayList<>());
6        }
7        for (int[] e : edges){
8            adjLs.get(e[0]).add(e[1]);
9            adjLs.get(e[1]).add(e[0]);
10        }
11
12        HashMap<Integer,Integer> mapx = new HashMap<>();
13        Queue<int[]> q = new LinkedList<>();
14        q.add(new int[]{x,0});
15        HashSet<Integer> set = new HashSet<>();
16        while (!q.isEmpty()){
17            int[] cp = q.poll();
18            if (set.contains(cp[0])){
19                continue;
20            }
21            mapx.put(cp[0],cp[1]);
22            //System.out.println(mapx);
23            set.add(cp[0]);
24            for (int nbr : adjLs.get(cp[0])){
25                if (!set.contains(nbr)){
26                    //System.out.println(nbr+" "+cp[1]+" "+cp[0]);
27                    q.add(new int[]{nbr,cp[1]+1});
28                }
29            }
30        }
31        HashMap<Integer,Integer> mapy = new HashMap<>();
32        q = new LinkedList<>();
33        q.add(new int[]{y,0});
34        set = new HashSet<>();
35        while (!q.isEmpty()){
36            int[] cp = q.poll();
37            if (set.contains(cp[0])){
38                continue;
39            }
40            mapy.put(cp[0],cp[1]);
41            set.add(cp[0]);
42            for (int nbr : adjLs.get(cp[0])){
43                if (!set.contains(nbr)){
44                    q.add(new int[]{nbr,cp[1]+1});
45                }
46            }
47        }
48        HashMap<Integer,Integer> mapz = new HashMap<>();
49        q = new LinkedList<>();
50        q.add(new int[]{z,0});
51        set = new HashSet<>();
52        while (!q.isEmpty()){
53            int[] cp = q.poll();
54            if (set.contains(cp[0])){
55                continue;
56            }
57            mapz.put(cp[0],cp[1]);
58            set.add(cp[0]);
59            for (int nbr : adjLs.get(cp[0])){
60                if (!set.contains(nbr)){
61                    q.add(new int[]{nbr,cp[1]+1});
62                }
63            }
64        }
65        //System.out.println(mapx);
66        int cnt = 0;
67        for (int key : mapx.keySet()){
68            long[] temp = new long[]{(long)mapx.get(key),(long)mapy.get(key),(long)mapz.get(key)};
69            Arrays.sort(temp);
70            long t1 = temp[0]*temp[0] + temp[1]*temp[1];
71            long t2 = temp[2]*temp[2];
72            if (t1==t2){
73                cnt++;
74            }
75        }
76        return cnt;
77    }
78}
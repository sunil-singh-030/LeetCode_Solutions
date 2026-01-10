// Last updated: 1/10/2026, 6:04:19 PM
1class Solution {
2
3    static class Pair {
4        int nextRain;
5        int lake;
6        Pair(int nextRain, int lake) {
7            this.nextRain = nextRain;
8            this.lake = lake;
9        }
10    }
11
12    public int[] avoidFlood(int[] rains) {
13        int n = rains.length;
14
15        HashSet<Integer> filled = new HashSet<>();
16        HashMap<Integer, List<Integer>> map = new HashMap<>();
17
18        for (int i = n - 1; i >= 0; i--) {
19            if (rains[i] > 0) {
20                map.computeIfAbsent(rains[i], k -> new ArrayList<>()).add(i);
21            }
22        }
23
24        PriorityQueue<Pair> pq = new PriorityQueue<>(
25            (a, b) -> a.nextRain - b.nextRain
26        );
27
28        int[] ans = new int[n];
29
30        for (int i = 0; i < n; i++) {
31
32            if (rains[i] > 0) {
33                ans[i] = -1;
34
35                if (filled.contains(rains[i])) {
36                    return new int[0]; 
37                }
38
39                filled.add(rains[i]);
40
41                map.get(rains[i]).remove(map.get(rains[i]).size() - 1);
42
43                if (!map.get(rains[i]).isEmpty()) {
44                    int next = map.get(rains[i]).get(map.get(rains[i]).size() - 1);
45                    pq.add(new Pair(next, rains[i]));
46                }
47
48            } else {
49                if (pq.isEmpty()) {
50                    ans[i] = 1; 
51                } else {
52                    Pair p = pq.poll();
53                    ans[i] = p.lake;
54                    filled.remove(p.lake);
55                }
56            }
57        }
58        return ans;
59    }
60}
61
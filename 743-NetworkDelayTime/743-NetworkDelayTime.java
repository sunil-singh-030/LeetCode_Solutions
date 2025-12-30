// Last updated: 12/30/2025, 12:28:42 PM
1class Solution {
2    class Pair{
3        int node;
4        int t;
5        Pair(int node,int t){
6            this.node = node;
7            this.t = t;
8        }
9    }
10    public int networkDelayTime(int[][] times, int n, int k) {
11        HashMap<Integer,HashMap<Integer,Integer>> adj = new HashMap<>();
12        for (int i=1 ; i<=n ; i++){
13            adj.put(i,new HashMap<>());
14        }
15        for (int[] t : times){
16            adj.get(t[0]).put(t[1],t[2]);
17        }
18        int[] time = new int[n+1];
19        Arrays.fill(time,Integer.MAX_VALUE);
20        time[k] = 0;
21        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.t-b.t);
22        pq.offer(new Pair(k,0));
23        while (!pq.isEmpty()){
24            Pair cp = pq.poll();
25            for (int nbr : adj.get(cp.node).keySet()){
26                if (cp.t+adj.get(cp.node).get(nbr)<time[nbr]){
27                    time[nbr] = cp.t+adj.get(cp.node).get(nbr);
28                    pq.offer(new Pair(nbr,time[nbr]));
29                }
30            }
31        }
32        int max = 0;
33        for (int i=1 ; i<=n ; i++){
34            if (i!=k){
35                if (time[i]==Integer.MAX_VALUE) return -1;
36                max = Math.max(max,time[i]);
37            }
38        }
39        return max;
40    }
41}
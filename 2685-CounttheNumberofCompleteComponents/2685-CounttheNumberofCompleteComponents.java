// Last updated: 7/11/2026, 8:10:08 PM
1class Solution {
2    public int countCompleteComponents(int n, int[][] edges) {
3        List<List<Integer>> adjList = new ArrayList<>();
4        for (int i=0 ; i<n ; i++){
5            adjList.add(new ArrayList<>());
6        }
7        for (int[] edg : edges){
8            adjList.get(edg[0]).add(edg[1]);
9            adjList.get(edg[1]).add(edg[0]);
10        }
11        int cntCom = 0;
12        HashSet<Integer> visited = new HashSet<>();
13        for (int i=0 ; i<n ; i++){
14            if (!visited.contains(i)){
15                int cntNode = 0;
16                int cntEdge = 0;
17                Stack<Integer> st = new Stack<>();
18                st.push(i);
19                while (!st.isEmpty()){
20                    int cnode = st.pop();
21                    if (visited.contains(cnode)){
22                        continue;
23                    }                    
24                    visited.add(cnode);
25                    cntNode ++;
26                    cntEdge += adjList.get(cnode).size();
27                    for (int nbr : adjList.get(cnode)){
28                        if (!visited.contains(nbr)){
29                            st.push(nbr);
30                        }
31                    }
32                }
33                //System.out.println(cntNode+" "+cntEdge);
34                if ((cntEdge/2)==(((cntNode-1)*cntNode)/2)){
35                    cntCom++;
36                }
37            }
38        }
39        return cntCom;
40    }
41}
// Last updated: 2/18/2026, 11:49:56 AM
1class Solution {
2    String ans;
3    int cnt;
4    boolean stop;
5    public String getPermutation(int n, int k) {
6        ans = "";
7        cnt = 0;
8        stop = false;
9        boolean[] visited = new boolean[n+1];
10        jaiBabaKi(visited,n,"",k);
11        return ans;
12    }
13    public void jaiBabaKi(boolean[] visited, int n, String s, int k){
14        if (stop){
15            return;
16        }
17        boolean found = false;
18        for (int i=1 ; i<=n ; i++){
19            if (!visited[i]){
20                found = true;
21                visited[i] = true;
22                jaiBabaKi(visited,n,s+i,k);
23                visited[i] = false;
24            }
25        }
26        if (!found){
27            cnt++;
28            if (cnt==k){
29                stop = true;
30                ans = s;
31            }
32            return;
33        }
34    }
35}
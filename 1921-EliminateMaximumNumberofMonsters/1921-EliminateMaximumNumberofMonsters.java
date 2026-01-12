// Last updated: 1/12/2026, 9:55:31 PM
1class Solution {
2    public int eliminateMaximum(int[] dist, int[] speed) {
3        int n = dist.length;
4        double[] monsTime = new double[n];
5        for (int i=0 ; i<n ; i++){
6            monsTime[i] = dist[i]/(1.0*speed[i]);
7        }
8        Arrays.sort(monsTime);
9        int ans = 1;
10        int time = 0;
11        for (int i=1 ; i<n ; i++){
12            time++;
13            if (monsTime[i]<=time){
14                return ans;
15            }
16            ans++;
17            
18        }
19        return ans;
20    }
21}
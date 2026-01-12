// Last updated: 1/12/2026, 9:46:18 PM
1class Solution {
2    public int minTimeToVisitAllPoints(int[][] points) {
3        int t = 0;
4        int x = points[0][0];
5        int y = points[0][1];
6        int n = points.length;
7        for (int i=1 ; i<n ; i++){
8            int abs1 = Math.abs(x-points[i][0]);
9            int abs2 = Math.abs(y-points[i][1]);
10            if (abs1==0){
11                t += abs2;
12            }
13            else if (abs2==0){
14                t += abs1;
15            }
16            else{
17                t += Math.min(abs1,abs2);
18                t += Math.abs(abs1-abs2); 
19            }
20            x = points[i][0];
21            y = points[i][1];
22        }
23        return t;
24    }
25}
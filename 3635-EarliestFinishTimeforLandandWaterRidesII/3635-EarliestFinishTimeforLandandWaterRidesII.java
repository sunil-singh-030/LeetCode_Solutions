// Last updated: 6/3/2026, 9:39:53 AM
1class Solution {
2    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
3        int[][] a = new int[landStartTime.length][2];
4        int n = a.length;
5        for (int i=0 ; i<a.length ; i++){
6            a[i][0] = landStartTime[i];
7            a[i][1] = landDuration[i];
8        }
9        Arrays.sort(a,(x,y) ->{
10            if (x[1]!=y[1]){
11                return Integer.compare(x[1],y[1]);
12            }
13            else{
14                return Integer.compare(x[0],y[0]);
15            }
16        });
17        int[][] b = new int[waterStartTime.length][2];
18        int m = b.length;
19        for (int i=0 ; i<b.length ; i++){
20            b[i][0] = waterStartTime[i];
21            b[i][1] = waterDuration[i];
22        }
23        Arrays.sort(b,(x,y) ->{
24            if (x[1]!=y[1]){
25                return Integer.compare(x[1],y[1]);
26            }
27            else{
28                return Integer.compare(x[0],y[0]);
29            }
30        });
31        int ans = Integer.MAX_VALUE;
32        for (int i=0 ; i<n ; i++){
33            int time = landStartTime[i] + landDuration[i];
34            for (int j=0 ; j<m ; j++){
35                ans = Math.min(ans,time+b[j][1]+Math.max(0,b[j][0]-time));
36                if (b[j][0]<=time){
37                    break;
38                }
39            }
40        }
41        for (int i=0 ; i<m ; i++){
42            int time = waterStartTime[i] + waterDuration[i];
43            for (int j=0 ; j<n ; j++){
44                ans = Math.min(ans,time+a[j][1]+Math.max(0,a[j][0]-time));
45                if (a[j][0]<=time){
46                    break;
47                }
48            }
49        }
50
51        
52        
53        return ans;
54    }
55}
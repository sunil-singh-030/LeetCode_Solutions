// Last updated: 6/2/2026, 6:54:48 AM
1class Solution {
2    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
3        int n = landStartTime.length;
4        int m = waterStartTime.length;
5        int ans = Integer.MAX_VALUE;
6        for (int i=0 ; i<n ; i++){
7            int time = landStartTime[i] + landDuration[i];
8            for (int j=0 ; j<m ; j++){
9                if (waterStartTime[j]>=landStartTime[i]){
10                    ans = Math.min(ans,time+waterDuration[j]+Math.max(0,waterStartTime[j]-time));
11                }
12            }
13        }
14        for (int i=0 ; i<m ; i++){
15            int time = waterStartTime[i] + waterDuration[i];
16            for (int j=0 ; j<n ; j++){
17                if (landStartTime[j]>=waterStartTime[i]){
18                    ans = Math.min(ans,time+landDuration[j]+Math.max(0,landStartTime[j]-time));
19                }
20            }
21        }
22        return ans;
23    }
24}
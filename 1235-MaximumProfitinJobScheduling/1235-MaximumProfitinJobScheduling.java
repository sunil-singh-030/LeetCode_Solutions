// Last updated: 1/2/2026, 10:20:09 AM
1class Solution {
2    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
3        int n = startTime.length;
4        int[][] arr = new int[n][3];
5        for (int i=0 ; i<n ; i++){
6            arr[i][0] = startTime[i];
7            arr[i][1] = endTime[i];
8            arr[i][2] = profit[i];
9        }
10        Arrays.sort(arr,(a,b)->a[1]-b[1]);
11        int[] dp = new int[n];
12        dp[0] = arr[0][2];
13        for (int i=1 ; i<n ; i++){
14            int notake = arr[i][2];
15            int take = 0;
16
17            // Binary Search
18            int st = 0;
19            int end = i-1;
20            int idx = -1;
21            while (st<=end){
22                int mid = (st+end)/2;
23                if (arr[i][0]>=arr[mid][1]){
24                    idx = mid;
25                    st = mid+1;
26                }
27                else{
28                    end = mid-1;
29                }
30            }
31            if (idx!=-1){
32                take = dp[idx];
33            }
34            dp[i] = Math.max(dp[i-1],take+notake);
35        }
36        return dp[n-1];
37    }
38    
39}
// Last updated: 1/2/2026, 10:21:19 AM
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
14            int take = arr[i][2];
15            // Binary Search
16            int st = 0;
17            int end = i-1;
18            int idx = -1;
19            while (st<=end){
20                int mid = (st+end)/2;
21                if (arr[i][0]>=arr[mid][1]){
22                    idx = mid;
23                    st = mid+1;
24                }
25                else{
26                    end = mid-1;
27                }
28            }
29            if (idx!=-1){
30                take += dp[idx];
31            }
32            dp[i] = Math.max(dp[i-1],take);
33        }
34        return dp[n-1];
35    }
36    
37}
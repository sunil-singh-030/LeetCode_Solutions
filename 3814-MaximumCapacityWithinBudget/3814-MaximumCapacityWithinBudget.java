// Last updated: 1/19/2026, 12:01:06 PM
1class Solution {
2    public int maxCapacity(int[] costs, int[] capacity, int budget) {
3        int n = costs.length;
4        int[][] arr = new int[n][2];
5        for (int i=0 ; i<n ; i++){
6            arr[i][0] = costs[i];
7            arr[i][1] = capacity[i];
8        }
9        Arrays.sort(arr,(a,b)->a[0]-b[0]);
10        int ans = 0;
11        // one machine
12        for (int i=0 ; i<n ; i++){
13            if (arr[i][0]<budget){
14                ans = Math.max(ans,arr[i][1]);
15            }
16            else{
17                break;
18            }
19        }
20        // two machine
21        int[] prevMax = new int[n];
22        prevMax[0] = arr[0][1];
23        for (int i=1 ; i<n ; i++){
24            prevMax[i] = Math.max(prevMax[i-1],arr[i][1]);
25        }
26
27        for (int i=0 ; i<n ; i++){
28            int left = budget-arr[i][0];
29            int idx = -1;
30            int st = 0;
31            int end = i-1;
32            while (st<=end){
33                int mid = (st+end)/2;
34                if (arr[mid][0]<left){
35                    idx = mid;
36                    st = mid+1;
37                }
38                else{
39                    end = mid-1;
40                }
41            }
42            if (idx!=-1){
43                ans = Math.max(ans,arr[i][1]+prevMax[idx]);
44            }
45        }
46        return ans;
47    }
48}
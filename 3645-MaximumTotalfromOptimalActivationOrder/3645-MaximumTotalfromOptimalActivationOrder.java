// Last updated: 1/23/2026, 10:28:18 AM
1class Solution {
2    public long maxTotal(int[] value, int[] limit) {
3        long ans = 0;
4        int n = limit.length;
5        int[][] arr = new int[n][2];
6        for (int i=0 ; i<n ; i++){
7            arr[i][0] = value[i];
8            arr[i][1] = limit[i];
9        }
10        Arrays.sort(arr, (x,y) -> {
11            if (x[1]!=y[1]){
12                return Integer.compare(x[1],y[1]);
13            }
14            else{
15                return Integer.compare(y[0],x[0]);
16            }
17        });
18        int cnt = 0;
19        boolean[] flag = new boolean[n];
20        List<Integer> ls = new ArrayList<>();
21        int stIndex = 0;
22        for (int i=0 ; i<n ; i++){
23            if (cnt<arr[i][1]){
24                ls.add(arr[i][1]);
25                ans += arr[i][0];
26                cnt++;
27            }
28            
29            int st = i+1;
30            int end = n-1;
31            int ind = n;
32            while (st<=end){
33                int mid = (st+end)/2;
34                if (arr[mid][1]>cnt){
35                    ind = mid;
36                    end = mid-1;
37                }
38                else{
39                    st = mid+1;
40                }
41            }
42            ind--;
43            i = ind;
44
45            
46            int stInd = stIndex;
47            int endInd = ls.size()-1;
48            int tar = -1;
49            while (stInd<=endInd){
50                int mid = (stInd+endInd)/2;
51                if (ls.get(mid)<=cnt){
52                    tar = mid;
53                    stInd = mid+1;
54                }
55                else{
56                    endInd = mid-1;
57                }
58            }
59            if (tar!=-1){
60                cnt -= (tar-stIndex+1);
61                stIndex = tar+1;
62                if (stIndex==ls.size()){
63                    stIndex = 0;
64                    ls = new ArrayList<>();
65                }
66            }
67        }
68        return ans;
69    }
70}
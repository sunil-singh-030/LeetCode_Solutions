// Last updated: 3/13/2026, 2:31:40 PM
1class Solution {
2public:
3    int calH(int w, long long k){
4        int st = 1;
5        int end = 1000000;
6        int hei = 0;
7        while (st<=end){
8            int mid = (st+end)/2;
9            long long m = mid;
10            long long val = w*((m*(m+1))/2);
11            if (val<=k){
12                hei = mid;
13                st = mid+1;
14            }
15            else{
16                end = mid-1;
17            }
18        }
19        return hei;
20
21
22    }
23    bool ispossible(vector<int>& wT, int h, long long k){
24        
25        for (int w : wT){
26            h -=  calH(w,k);
27            if (h<1){
28                
29                return true;
30            }
31        }
32        
33        return false;
34    }
35
36    long long minNumberOfSeconds(int mountainHeight, vector<int>& workerTimes) {
37        
38        long long minT = 1;
39        long long maxT = LLONG_MAX-1;
40        long long ans = minT;
41        
42        while (minT<=maxT){
43            long long mid = (minT+maxT)/((long long) 2);
44            if (ispossible(workerTimes,mountainHeight,mid)){
45                ans = mid;
46                maxT = mid-1;
47            }
48            else{
49                minT = mid+1;
50            }
51        }
52        return ans;
53    }
54};
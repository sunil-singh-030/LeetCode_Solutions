// Last updated: 3/13/2026, 2:33:58 PM
1class Solution {
2public:
3
4    long long calH(long long w, long long k){
5        long double val = (long double)1 + (long double)8 * k / w;
6        long long h = (sqrt(val) - 1) / 2;
7        return h;
8    }
9
10    bool ispossible(vector<int>& wT, int h, long long k){
11        
12        long long removed = 0;
13
14        for (int w : wT){
15            removed += calH(w,k);
16            if (removed >= h) return true;
17        }
18
19        return false;
20    }
21
22    long long minNumberOfSeconds(int mountainHeight, vector<int>& workerTimes) {
23        
24        long long l = 1;
25        long long r = 1e18;
26        long long ans = r;
27
28        while (l <= r){
29            long long mid = l + (r-l)/2;
30
31            if (ispossible(workerTimes, mountainHeight, mid)){
32                ans = mid;
33                r = mid - 1;
34            }
35            else{
36                l = mid + 1;
37            }
38        }
39
40        return ans;
41    }
42};
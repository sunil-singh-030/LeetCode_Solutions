// Last updated: 3/13/2026, 2:31:12 PM
1class Solution {
2public:
3    int calH(int w, long long k){
4        //w*(n*(n+1)/2)<=k
5        
6        int st = 1;
7        int end = 1000000;
8        int hei = 0;
9        while (st<=end){
10            int mid = (st+end)/2;
11            long long m = mid;
12            long long val = w*((m*(m+1))/2);
13            if (val<=k){
14                hei = mid;
15                st = mid+1;
16            }
17            else{
18                end = mid-1;
19            }
20        }
21        return hei;
22
23
24    }
25    bool ispossible(vector<int>& wT, int h, long long k){
26        //cout << k ;
27        for (int w : wT){
28            h -=  calH(w,k);
29            if (h<1){
30                //cout << "true" << endl;
31                return true;
32            }
33        }
34        //cout << "false" << endl;
35        return false;
36    }
37
38    long long minNumberOfSeconds(int mountainHeight, vector<int>& workerTimes) {
39        
40        long long minT = 1;
41        long long maxT = LLONG_MAX-1;
42        long long ans = minT;
43        //cout << calH(5, (minT+maxT)/((long long) 2)) << endl;
44        while (minT<=maxT){
45            long long mid = (minT+maxT)/((long long) 2);
46            if (ispossible(workerTimes,mountainHeight,mid)){
47                ans = mid;
48                maxT = mid-1;
49            }
50            else{
51                minT = mid+1;
52            }
53        }
54        return ans;
55    }
56};
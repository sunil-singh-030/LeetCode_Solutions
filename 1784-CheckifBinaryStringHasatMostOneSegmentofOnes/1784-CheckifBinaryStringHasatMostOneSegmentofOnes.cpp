// Last updated: 3/6/2026, 11:39:01 AM
1class Solution {
2public:
3    bool checkOnesSegment(string s) {
4        int n = s.size();
5        int stIdx = -1;
6        for (int i=0 ; i<n ; i++){
7            if (s[i]=='1'){
8                stIdx = i;
9                break;
10            }
11        }
12        if (stIdx==-1){
13            return true;
14        }
15        int endIdx = -1;
16        for (int i=n-1 ; i>=0 ; i--){
17            if (s[i]=='1'){
18                endIdx = i;
19                break;
20            }
21        }
22        for (int i=stIdx+1 ; i<endIdx ; i++){
23            if (s[i]=='0'){
24                return false;
25            }
26        }
27        return true;
28        
29        
30    }
31};
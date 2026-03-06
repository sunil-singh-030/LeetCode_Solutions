// Last updated: 3/6/2026, 5:18:31 PM
1class Solution {
2public:
3    int minOperations(string s) {
4        int n = s.size();
5        // 010101..
6        int cnt1 = 0;
7        for (int i=0 ; i<n ; i++){
8            char ch = s[i];
9            if ((i&1)==1){
10                if (ch=='0'){
11                    cnt1++;
12                }
13            }
14            else{
15                if (ch=='1'){
16                    cnt1++;
17                }
18            }
19            
20        }
21        // 101010..
22        int cnt2 = 0;
23        for (int i=0 ; i<n ; i++){
24            char ch = s[i];
25            if ((i&1)==1){
26                if (ch=='1'){
27                    cnt2++;
28                }
29            }
30            else{
31                if (ch=='0'){
32                    cnt2++;
33                }
34            }
35        }
36        
37        return min(cnt1,cnt2);
38    }
39};
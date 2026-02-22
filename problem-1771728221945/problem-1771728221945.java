// Last updated: 2/22/2026, 8:13:41 AM
1class Solution {
2    public String maximumXor(String s, String t) {
3        int cnt0 = 0;
4        int cnt1 = 0;
5        for (char ch : t.toCharArray()){
6            if (ch=='1'){
7                cnt1++;
8            }
9            else{
10                cnt0++;
11            }
12        }
13        StringBuilder res = new StringBuilder();
14        for (char ch : s.toCharArray()){
15            if (ch=='1'){
16                if (cnt0>0){
17                    cnt0--;
18                    res.append('1');
19                }
20                else{
21                    cnt1--;
22                    res.append('0');
23                }
24            }
25            else{
26                if (cnt1>0){
27                    cnt1--;
28                    res.append('1');
29                }
30                else{
31                    cnt0--;
32                    res.append('0');
33                }
34            }
35        }
36        return res.toString();
37    }
38}
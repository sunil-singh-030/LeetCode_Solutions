// Last updated: 7/21/2026, 6:50:19 AM
1class Solution {
2    public int maxActiveSectionsAfterTrade(String s) {
3        
4        int n = s.length();
5        int maxCnt = 0;
6        int totalOne = 0;
7        for (char ch : s.toCharArray()){
8            if (ch=='1'){
9                totalOne++;
10            }
11        
12        }
13        maxCnt = totalOne;
14
15        char[] type = new char[3];
16        Arrays.fill(type,'_');
17        int[] cnt = new int[3];
18        
19        char currType = s.charAt(0);
20        int currCnt = 0;
21        
22        for (int i=0 ; i<n ; i++){
23            char ch = s.charAt(i);
24            if (ch==currType){
25                currCnt++;
26            }
27            else{
28                if (type[0]=='_'){
29                    type[0] = currType;
30                    cnt[0] = currCnt;
31                }
32                else if (type[1]=='_'){
33                    type[1] = currType;
34                    cnt[1] = currCnt;
35                }
36                else if (type[2]=='_'){
37                    type[2] = currType;
38                    cnt[2] = currCnt;
39                }
40                else{
41                    type[0] = type[1];
42                    cnt[0] = cnt[1];
43                    type[1] = type[2];
44                    cnt[1] = cnt[2];
45                    type[2] = currType;
46                    cnt[2] = currCnt;
47                }
48                
49                if (type[2]!='_'){
50                    if (type[0]=='0' && type[1]=='1' && type[2]=='0'){
51                        int currAns = totalOne + cnt[0] + cnt[2];
52                        maxCnt = Math.max(maxCnt,currAns);
53                    }
54                }
55
56                currType = ch;
57                currCnt = 1;
58            }
59        }
60        if (type[0]=='_'){
61            type[0] = currType;
62            cnt[0] = currCnt;
63        }
64        else if (type[1]=='_'){
65            type[1] = currType;
66            cnt[1] = currCnt;
67        }
68        else if (type[2]=='_'){
69            type[2] = currType;
70            cnt[2] = currCnt;
71        }
72        else{
73            type[0] = type[1];
74            cnt[0] = cnt[1];
75            type[1] = type[2];
76            cnt[1] = cnt[2];
77            type[2] = currType;
78            cnt[2] = currCnt;
79        }
80        
81        if (type[2]!='_'){
82            if (type[0]=='0' && type[1]=='1' && type[2]=='0'){
83                int currAns = totalOne + cnt[0] + cnt[2];
84                maxCnt = Math.max(maxCnt,currAns);
85            }
86        }
87        
88        return maxCnt;
89
90        
91
92
93
94    } // tc -> O(N) , sc -> O(1)
95
96
97
98}
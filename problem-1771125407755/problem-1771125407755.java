// Last updated: 2/15/2026, 8:46:47 AM
1class Solution {
2    public int almostPalindromic(String s) {
3        // abbda
4        char[] arr = s.toCharArray();
5        int n = arr.length;
6        int ans = 1;
7        // even
8        for (int i=1 ; i<n ; i++){
9            int l = i-1;
10            int r = i;
11            int len = 0;
12            boolean used = false;
13            while (l>=0 && r<n){
14                if (arr[l]==arr[r]){
15                    len += 2;
16                    l--;
17                    r++;
18                } // 
19                else{
20                    used = true;
21                    int tlen1 = len;
22                    int tlen2 = len;
23                    int tl = l-1;
24                    int tr = r;
25                    while (tl>=0 && tr<n && arr[tl]==arr[tr]){
26                        tlen1 += 2;
27                        tl--;
28                        tr++;
29                    }
30                    len = Math.max(len,tlen1);
31                    //System.out.println(i+" 1 "+tlen);
32                    
33                    tl = l;
34                    tr = r+1;
35                    while (tl>=0 && tr<n && arr[tl]==arr[tr]){
36                        tlen2 += 2;
37                        tl--;
38                        tr++;
39                    }
40                    len = Math.max(len,tlen2);
41                    //System.out.println(i+" 2 "+tlen);
42                    break;
43                    
44                }
45                
46            }
47            if (len!=n){
48                len++;
49            }
50            if (used){
51                ans = Math.max(ans,len);
52            }
53            //System.out.println(i+" "+ans);
54            
55        }
56        //System.out.println(ans);
57        // odd
58        for (int i=0 ; i<n ; i++){
59            // left
60            int l = i-1;
61            int r = i+1;
62            int len = 1;
63            boolean used = false;
64            while (l>=0 && r<n){
65                if (arr[l]==arr[r]){
66                    len += 2;
67                    l--;
68                    r++;
69                } // 
70                else{
71                    used = true;
72                    int tlen1 = len;
73                    int tlen2 = len;
74                    int tl = l-1;
75                    int tr = r;
76                    while (tl>=0 && tr<n && arr[tl]==arr[tr]){
77                        tlen1 += 2;
78                        tl--;
79                        tr++;
80                    }
81                    len = Math.max(len,tlen1);
82                    
83                    tl = l;
84                    tr = r+1;
85                    while (tl>=0 && tr<n && arr[tl]==arr[tr]){
86                        tlen2 += 2;
87                        tl--;
88                        tr++;
89                    }
90                    len = Math.max(len,tlen2);
91                    break;
92                    
93                }
94                
95            }
96            if (len!=n){
97                len++;
98            }
99            if (used){
100                ans = Math.max(ans,len);
101            }
102            
103
104            
105        }
106        //System.out.println(ans);
107        // even 2
108        for (int i=1 ; i<n ; i++){
109            int l = i-1;
110            int r = i;
111            int len = 0;
112            while (l>=0 && r<n && arr[l]==arr[r]){
113                len += 2;
114                l--;
115                r++;
116            }
117            if (len!=n){
118                len++;
119            }
120            ans = Math.max(ans,len);
121        }
122        //System.out.println(ans);
123        for (int i=0 ; i<n ; i++){
124            int l = i-1;
125            int r = i+1;
126            int len = 1;
127            while (l>=0 && r<n && arr[l]==arr[r]){
128                len += 2;
129                l--;
130                r++;
131            }
132            
133            if (len!=n){
134                len++;
135            }
136            //System.out.println(i+" "+len);
137            ans = Math.max(ans,len);
138        }
139        return ans;
140    }
141}
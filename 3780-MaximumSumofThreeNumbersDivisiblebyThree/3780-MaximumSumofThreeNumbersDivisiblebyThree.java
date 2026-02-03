// Last updated: 2/3/2026, 10:47:34 AM
1class Solution {
2    public int maximumSum(int[] nums) {
3        // 1 2 3 4 // 6
4        int rem01 = 0;
5        int rem02 = 0;
6        int rem11 = 0;
7        int rem12 = 0;
8        int rem21 = 0;
9        int rem22 = 0;
10        int ans = 0;
11        for (int num : nums){
12            int rem = num%3;
13            if (rem==0){
14                if (rem01!=0 && rem02!=0){
15                    
16                    
17                    ans = Math.max(ans,num+rem01+rem02);
18                }
19                if (rem11!=0 && rem21!=0){
20                    ans = Math.max(ans,num+rem11+rem21);
21                }
22            }
23            else if (rem==1){
24                if (rem11!=0 && rem12!=0){
25                    
26                    
27                    ans = Math.max(ans,num+rem11+rem12);
28                }
29                if (rem21!=0 && rem01!=0){
30                    ans = Math.max(ans,num+rem21+rem01);
31                }
32            }
33            else{
34                if (rem21!=0 && rem22!=0){
35                    
36                    
37                    ans = Math.max(ans,num+rem21+rem22);
38                }
39                if (rem11!=0 && rem01!=0){
40                    ans = Math.max(ans,num+rem11+rem01);
41                }
42            }
43            if (rem==0){
44                if (num > rem01) {
45                    rem02 = rem01;
46                    rem01 = num;
47                } 
48                else if (num > rem02 ) {
49                    rem02 = num;
50                }
51                
52                
53            }
54            else if (rem==1){
55                if (num > rem11) {
56                    rem12 = rem11;
57                    rem11 = num;
58                } 
59                else if (num > rem12 ) {
60                    rem12 = num;
61                }
62            }
63            else{
64                if (num > rem21) {
65                    rem22 = rem21;
66                    rem21 = num;
67                } 
68                else if (num > rem22 ) {
69                    rem22 = num;
70                }
71            }
72        }
73        return ans;
74
75    }
76}
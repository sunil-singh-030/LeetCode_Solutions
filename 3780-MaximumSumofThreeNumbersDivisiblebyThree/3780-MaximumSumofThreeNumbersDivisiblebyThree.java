// Last updated: 2/3/2026, 10:47:56 AM
1class Solution {
2    public int maximumSum(int[] nums) {
3        int rem01 = 0;
4        int rem02 = 0;
5        int rem11 = 0;
6        int rem12 = 0;
7        int rem21 = 0;
8        int rem22 = 0;
9        int ans = 0;
10        for (int num : nums){
11            int rem = num%3;
12            if (rem==0){
13                if (rem01!=0 && rem02!=0){
14                    
15                    
16                    ans = Math.max(ans,num+rem01+rem02);
17                }
18                if (rem11!=0 && rem21!=0){
19                    ans = Math.max(ans,num+rem11+rem21);
20                }
21            }
22            else if (rem==1){
23                if (rem11!=0 && rem12!=0){
24                    
25                    
26                    ans = Math.max(ans,num+rem11+rem12);
27                }
28                if (rem21!=0 && rem01!=0){
29                    ans = Math.max(ans,num+rem21+rem01);
30                }
31            }
32            else{
33                if (rem21!=0 && rem22!=0){
34                    
35                    
36                    ans = Math.max(ans,num+rem21+rem22);
37                }
38                if (rem11!=0 && rem01!=0){
39                    ans = Math.max(ans,num+rem11+rem01);
40                }
41            }
42            if (rem==0){
43                if (num > rem01) {
44                    rem02 = rem01;
45                    rem01 = num;
46                } 
47                else if (num > rem02 ) {
48                    rem02 = num;
49                }
50                
51                
52            }
53            else if (rem==1){
54                if (num > rem11) {
55                    rem12 = rem11;
56                    rem11 = num;
57                } 
58                else if (num > rem12 ) {
59                    rem12 = num;
60                }
61            }
62            else{
63                if (num > rem21) {
64                    rem22 = rem21;
65                    rem21 = num;
66                } 
67                else if (num > rem22 ) {
68                    rem22 = num;
69                }
70            }
71        }
72        return ans;
73
74    }
75}
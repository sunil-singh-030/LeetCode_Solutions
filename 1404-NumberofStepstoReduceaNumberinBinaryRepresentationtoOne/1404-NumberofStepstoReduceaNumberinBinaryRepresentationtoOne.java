// Last updated: 2/26/2026, 10:40:20 AM
1class Solution {
2    public int numSteps(String s) {
3        int cntSteps = 0;
4        int n = s.length();
5        char[] arr = s.toCharArray();
6        int idx = n-1;
7        while (idx>=0){
8            if (arr[idx]=='0'){
9                cntSteps++;
10                idx--;
11            }
12            else if (idx>0){
13                cntSteps++;
14                while (idx>=0 && arr[idx]=='1'){
15                    cntSteps++;
16                    idx--;
17                }
18                if (idx>-1){
19                    arr[idx] = '1';
20                }
21                
22            }
23            else{
24                break;
25            }
26            
27        }
28        return cntSteps;
29
30    }
31}
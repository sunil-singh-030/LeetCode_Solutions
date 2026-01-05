// Last updated: 1/5/2026, 10:14:39 AM
1class Solution {
2    public int minimumBuckets(String hamsters) {
3        int cntBuckets = 0;
4        int n = hamsters.length();
5        boolean[] placed = new boolean[n];
6        for (int i=0 ; i<n ; i++){
7            char ch = hamsters.charAt(i);
8            if (ch=='H'){
9                if ((i>0) && placed[i-1]){
10                    continue;
11                }
12                if (i+1<n && hamsters.charAt(i+1)=='.'){
13                    cntBuckets++;
14                    placed[i+1] = true;
15                    continue;
16                }
17                if (i>0 && hamsters.charAt(i-1)=='.'){
18                    cntBuckets++;
19                    placed[i-1] = true;
20                    continue;
21                }
22                return -1;
23                
24            }
25        }
26        return cntBuckets;
27    }
28}
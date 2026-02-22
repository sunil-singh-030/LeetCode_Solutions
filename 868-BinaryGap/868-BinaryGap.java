// Last updated: 2/22/2026, 8:57:45 AM
1class Solution {
2    public int binaryGap(int n) {
3        int ans = 0;
4        String s = "";
5        while (n>0){
6            s += n%2;
7            n /= 2;
8        }
9        int prevIdx = -1;
10        for (int i=0 ; i<s.length() ; i++){
11            if (s.charAt(i)=='1'){
12                if (prevIdx==-1){
13                    prevIdx = i;
14                }
15                else{
16                    ans = Math.max(ans,i-prevIdx);
17                    prevIdx = i;
18                }
19            }
20        }
21        return ans;
22    }
23}
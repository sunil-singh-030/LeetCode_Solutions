// Last updated: 2/7/2026, 9:45:23 PM
1class Solution {
2    public int minimumDeletions(String s) {
3        int n = s.length();
4        int[] rcnta = new int[n];
5        rcnta[n-1] = s.charAt(n-1)=='a' ? 1 : 0;
6        for (int i=n-2 ; i>=0 ; i--){
7            rcnta[i] = rcnta[i+1];
8            if (s.charAt(i)=='a'){
9                rcnta[i]++;
10            }
11        }
12        if (rcnta[0]==0 || rcnta[0]==n) return 0;
13        int ans = n;
14        int cntb = 0;
15        for (int i=0 ; i<n ; i++){
16            if (s.charAt(i)=='b'){
17                int currAns = rcnta[i];
18                currAns += cntb;
19                ans = Math.min(ans,currAns);
20                cntb++;
21            }
22        }
23        ans = Math.min(ans,cntb);
24        return ans;
25    }
26}
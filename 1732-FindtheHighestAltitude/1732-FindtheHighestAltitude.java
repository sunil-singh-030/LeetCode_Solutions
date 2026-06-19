// Last updated: 6/19/2026, 5:35:53 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int ans=0;
4        int gain1=0;
5        for (int i=0;i<gain.length;i++){
6            gain1+=gain[i];
7            ans=Math.max(gain1,ans);
8        }
9        return ans;
10    }
11}
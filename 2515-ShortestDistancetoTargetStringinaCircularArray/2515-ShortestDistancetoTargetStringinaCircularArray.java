// Last updated: 4/15/2026, 11:43:12 AM
1class Solution {
2    public int closestTarget(String[] words, String target, int startIndex) {
3        int n = words.length;
4        int ans = n;
5        for (int i=0 ; i<n ; i++){
6            if (words[i].equals(target)){
7                int diff = Math.abs(startIndex-i);
8                ans = Math.min(ans,Math.min(diff,n-diff));
9            }
10        }
11        return ans==n ? -1 : ans;
12    }
13}
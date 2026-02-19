// Last updated: 2/19/2026, 2:27:18 PM
1class Solution {
2    public int countBinarySubstrings(String s) {
3        int ans = 0;
4        int prevcnt = 0;
5        int cnt = 1;
6        char ch = s.charAt(0);
7        int n = s.length();
8        for (int i=1 ; i<n ; i++){
9            if (s.charAt(i)==ch){
10                cnt++;
11            }
12            else{
13                ans += Math.min(prevcnt,cnt);
14                prevcnt = cnt;
15                cnt = 1;
16                ch = s.charAt(i);
17            }
18        }
19        ans += Math.min(prevcnt,cnt);
20        return ans;
21    }
22}
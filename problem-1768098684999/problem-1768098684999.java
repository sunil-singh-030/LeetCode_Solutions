// Last updated: 1/11/2026, 8:01:24 AM
1class Solution {
2    public int residuePrefixes(String s) {
3        int cnt = 0;
4        HashSet<Character> set = new HashSet<>();
5        int n = s.length();
6        for (int i=0 ; i<n ; i++){
7            set.add(s.charAt(i));
8            if ((i+1)%3==set.size()){
9                cnt++;
10            }
11        }
12        return cnt;
13    }
14}
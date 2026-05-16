// Last updated: 5/16/2026, 7:01:09 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n = s.length();
4        HashMap<Character,Integer> map = new HashMap<>();
5
6        int si = 0;
7        int ci = 0;
8        int maxLen = 0;
9
10        while (ci<n){
11            char ch = s.charAt(ci);
12            map.put(ch,map.getOrDefault(ch,0)+1);
13
14            while (map.get(ch)>1){
15                char stCh = s.charAt(si);
16                int freq = map.get(stCh);
17                if (freq==1){
18                    map.remove(stCh);
19                }
20                else{
21                    map.put(stCh,freq-1);
22                }
23                si++;
24            }
25
26            maxLen = Math.max(maxLen,ci-si+1);
27            ci++;
28        }
29        return maxLen;
30    }
31}
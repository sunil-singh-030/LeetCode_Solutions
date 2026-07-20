// Last updated: 7/20/2026, 9:27:52 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3	
4        int n = s.length();
5        if (n==0) return 0;
6        int maxLen = 0;
7
8        int cidx = 0;
9        int sidx = 0;
10            
11        HashSet<Character> set = new HashSet<>();
12
13        while (cidx<n){
14            char ch = s.charAt(cidx);
15            
16            while (set.contains(ch)){
17                char temp = s.charAt(sidx);
18                set.remove(temp);
19                sidx++;
20            }
21            
22            set.add(ch);
23            
24            maxLen = Math.max(maxLen,cidx-sidx+1);
25
26            cidx++;
27        }
28
29        return maxLen;
30            
31    }
32
33}
// Last updated: 5/18/2026, 12:21:14 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        // AABABBA K=1
4        int n = s.length();
5        HashMap<Character,Integer> map = new HashMap<>();
6        int maxLen = 1;
7        int ci = 0;
8        int si = 0;
9
10        while (ci<n){
11            char ch = s.charAt(ci);
12            map.put(ch,map.getOrDefault(ch,0)+1);
13            while (helper(map,ci-si+1)>k){
14                char prev = s.charAt(si);
15                int freq = map.get(prev);
16                if (freq==1){
17                    map.remove(prev);
18                }
19                else{
20                    map.put(prev,freq-1);
21                }
22                si++;
23            }
24            maxLen = Math.max(maxLen,ci-si+1);
25            ci++;
26        }
27        return maxLen;
28    }
29    public int helper(HashMap<Character,Integer> map, int cnt){
30        int max = 0;
31        for (char key : map.keySet()){
32            max = Math.max(max,map.get(key));
33        }
34        return cnt-max;
35    }
36}
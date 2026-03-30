// Last updated: 3/30/2026, 6:23:23 AM
1class Solution {
2    public boolean checkStrings(String s1, String s2) {
3        int n = s2.length();
4
5        int[] freq = new int[26];
6        
7        for (int i=0 ; i<n ; i+=2){
8            char ch = s1.charAt(i);
9            freq[ch-'a']++;
10        }
11        for (int i=0 ; i<n ; i+=2){
12            char ch = s2.charAt(i);
13            freq[ch-'a']--;
14        }
15        for (int i=0 ; i<26 ; i++){
16            if (freq[i]!=0) return false;
17        }
18        freq = new int[26];
19        
20        for (int i=1 ; i<n ; i+=2){
21            char ch = s1.charAt(i);
22            freq[ch-'a']++;
23        }
24        for (int i=1 ; i<n ; i+=2){
25            char ch = s2.charAt(i);
26            freq[ch-'a']--;
27        }
28        for (int i=0 ; i<26 ; i++){
29            if (freq[i]!=0) return false;
30        }
31        return true;
32    }
33}
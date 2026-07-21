// Last updated: 7/21/2026, 11:52:10 AM
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        int[] f = new int[26];
4        for (char ch : s.toCharArray()){
5            f[ch-'a']++;
6        }
7
8        StringBuilder sb = new StringBuilder();
9
10        while (f[y-'a']-->0){
11            sb.append(y);
12        }
13
14        while (f[x-'a']-->0){
15            sb.append(x);
16        }
17        for (int i=0 ; i<26 ; i++){
18            char ch = (char) (97+i);
19            while (f[ch-'a']-->0){
20                sb.append(ch);
21            }
22        }
23        return sb.toString();
24
25    }
26}